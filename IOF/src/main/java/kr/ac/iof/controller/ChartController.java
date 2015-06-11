package kr.ac.iof.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.iof.Chart.DifferenceChartDemo2;
import kr.ac.iof.graph.demo.LineChart;
import kr.ac.iof.main.Service.CropCateService;
import kr.ac.iof.main.Service.FarmInfoService;
import kr.ac.iof.model.User;
import kr.ac.iof.model.UserGroup;
import kr.ac.iof.model.Main.FarmEquipType;
import kr.ac.iof.model.Main.FarmSectionInfo;
import kr.ac.iof.service.UserService;
import kr.ac.iof.service.UserGroupService;
import kr.ac.iof.util.HibernateUtil;

import org.hibernate.Session;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Handles requests for the application user page.
 */
@Controller
public class ChartController {

	private static final Logger logger = LoggerFactory
			.getLogger(ChartController.class);
	@RequestMapping(value = "/userTestGraph", method = RequestMethod.GET)
	public String userTestGraph2(){
		return "userTestGraph";
	}
	
	@RequestMapping(value = "/userTestGraph", method = RequestMethod.GET, params = {"type"})
	public String userTestGraph(HttpServletRequest request, HttpServletResponse response ) {
		
		JFreeChart chart = null;

		if (request.getParameter("type").equals("linechart")) {
			double[][] data = new double[][] { 
					{ 15, 17, 24, 25, 24 , 20, 18, 15},
					{ 17, 19, 26, 28, 26 , 22, 20, 17}, 
					{ 12, 15, 21, 22, 21 , 17, 15, 12},
					{ 16, 18, 27, 25, 21 , 18, 16, 14}};
			String[] rowKeys = { "설정온도", "상한 경고 온도", "하한 경고 온도", "실시간 온도" };
			String[] columnKeys = { "0:00시", "6:00시", "8:00시","10:00시", "14:00시", "17:00시", "19:00시", "22:00시" };
			CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
					rowKeys, columnKeys, data);
			chart = LineChart
					.createLineChart("온도 모니터", "시간 / h", "온도 / °C", dataset);
		}
		// ServletUtilities是面向web开发的工具类，返回一个字符串文件名,文件名自动生成，生成好的图片会自动放在服务器（tomcat）的临时文件下（temp）
		String filename = null;
		try {
			filename = ServletUtilities.saveChartAsPNG(chart, 800, 400, null, request.getSession());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 根据文件名去临时目录下寻找该图片，这里的/DisplayChart路径要与配置文件里用户自定义的<url-pattern>一致
		String graphURL = request.getContextPath() + "/DisplayChart?filename="
				+ filename;
		request.setAttribute("imgurl", graphURL);
		

		return "userTestGraph";
	}
	@RequestMapping(value = "/userTestGraph2", method = RequestMethod.GET)
	public String userTestGraph3(){
		return "userTestGraph2";
	}
	
	@RequestMapping(value = "/userTestGraph2", method = RequestMethod.GET, params = {"type"})
	public String userTestGraph5(HttpServletRequest request, HttpServletResponse response ) {
		
		JFreeChart chart = null;
		final DifferenceChartDemo2 demo = new DifferenceChartDemo2("Difference Chart Demo 2");
		final TimeSeries series1 = demo.createSunriseSeries();
        final TimeSeries series2 = demo.createSunsetSeries();
        final TimeSeries  series3 = demo.createlineSeries();
        final TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);
        
        
        
        JFreeChart chart1 = null; 
        
		if (request.getParameter("type").equals("linechart")) {
			
			chart1 = demo.createChart(dataset);
		}
		
		String filename = null;
		try {
			filename = ServletUtilities.saveChartAsPNG(chart1, 800, 400, null, request.getSession());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String graphURL = request.getContextPath() + "/DisplayChart?filename="
				+ filename;
		request.setAttribute("imgurl", graphURL);
		

		return "userTestGraph2";
	}
	

}
