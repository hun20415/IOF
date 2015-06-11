package kr.ac.iof.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.iof.graph.demo.LineChart;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
			chart = LineChart.createLineChart("Line Chart", "x축", "y축", dataset);
		} 

		String filename = null;
		try {
			filename = ServletUtilities.saveChartAsPNG(chart, 800, 400, null, request.getSession());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String graphURL = request.getContextPath() + "/DisplayChart?filename="
				+ filename;
		request.setAttribute("imgurl", graphURL);
		

		return "userTestGraph";
	}

}
