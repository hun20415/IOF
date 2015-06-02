package kr.ac.iof.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
					{ 672, 766, 223, 540, 126 , 222},
					{ 325, 521, 210, 340, 106 , 412}, 
					{ 332, 256, 523, 240, 526 , 231} };
			String[] rowKeys = { "사과", "배", "포도" };
			String[] columnKeys = { "북경", "상해", "광주", "성도", "심수", "길림" };
			CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
					rowKeys, columnKeys, data);
			chart = LineChart
					.createLineChart("Line Chart", "x축", "y축", dataset);
		}
		// ServletUtilities是面向web开发的工具类，返回一个字符串文件名,文件名自动生成，生成好的图片会自动放在服务器（tomcat）的临时文件下（temp）
		String filename = null;
		try {
			filename = ServletUtilities.saveChartAsPNG(chart, 800, 400,
					null, request.getSession());
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

}
