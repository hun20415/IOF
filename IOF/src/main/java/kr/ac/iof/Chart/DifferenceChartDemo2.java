package kr.ac.iof.Chart;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;

import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.RefineryUtilities;

/**
 * A simple demonstration of the {@link XYDifferenceRenderer}. The sunrise and
 * sunset times for this demo were obtained from:
 * 
 * http://www.sunrisesunset.com/
 *
 */
public class DifferenceChartDemo2 extends ApplicationFrame {

	/**
	 * Creates a new demo.
	 *
	 * @param title
	 *            the frame title.
	 */
	public DifferenceChartDemo2(final String title) {

		super(title);
		/*
		 * final TimeSeries series1 = createSunriseSeries(); final TimeSeries
		 * series2 = createSunsetSeries(); final TimeSeriesCollection dataset =
		 * new TimeSeriesCollection(); dataset.addSeries(series1);
		 * dataset.addSeries(series2);
		 * 
		 * final JFreeChart chart = createChart(dataset);
		 * 
		 * final ChartPanel chartPanel = new ChartPanel(chart);
		 * chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
		 * setContentPane(chartPanel);
		 */

	}

	/**
	 * Creates a time series containing sunrise times for London in 2004.
	 *
	 * @return a time series containing sunrise times.
	 */
	public XYSeries createSunriseSeries() {

		final XYSeries  series = new XYSeries ("UP TEMP");

	
		series.add(0, 17);
		series.add(6, 19);
		series.add(8, 26);
		series.add(10, 28);
		series.add(14, 26);
		series.add(17, 22);
		series.add(19, 20);
		series.add(22, 17);
		

		return series;
	}

	/**
	 * Creates a time series containing sunset times for London in 2004.
	 *
	 * @return a time series containing sunset times.
	 */
	public XYSeries createSunsetSeries() {
		final XYSeries series = new XYSeries("LOW TEMP");


		series.add(0, 12);
		series.add(6, 15);
		series.add(8, 21);
		series.add(10, 22);
		series.add(14, 21);
		series.add(17, 17);
		series.add(19, 15);
		series.add(22, 12);
		
		return series;

	}

	public XYSeries createlineSeries() {
		
		final XYSeries series = new XYSeries("Real Time TEMP");
		
		series.add(0, 16);
		series.add(6, 18);
		series.add(8, 27);
		series.add(10, 25);
		series.add(14, 23);
		series.add(17, 18);
		series.add(19, 16);
		series.add(22, 14);
		

		return series;
	}

	/**
	 * Creates a chart.
	 * 
	 * @param dataset
	 *            the dataset.
	 * 
	 * @return The chart.
	 */
	public JFreeChart createChart(final XYDataset dataset) {
		final JFreeChart chart = ChartFactory.createTimeSeriesChart(
				"Temperature graph", "Time / h", "Temperature / °C", dataset, true, // legend
				true, // tool tips
				false // URLs
				);
		chart.setBackgroundPaint(Color.white);

		final XYDifferenceRenderer renderer = new XYDifferenceRenderer(
				Color.red, Color.red, false);
		renderer.setStroke(new BasicStroke(2.0f));
		renderer.setSeriesPaint(0, Color.red);
		renderer.setSeriesPaint(1, Color.red);
		renderer.setSeriesPaint(2, Color.yellow);
		final XYPlot plot = chart.getXYPlot();
		plot.setRenderer(renderer);
		plot.setBackgroundPaint(Color.lightGray);
		plot.setDomainGridlinePaint(Color.white);
		plot.setRangeGridlinePaint(Color.white);
		plot.setAxisOffset(new RectangleInsets(5D, 5D, 5D, 5D));
		
		
		/*
		 Taegoon changed
		*/
		
		
		Font labelFont = new Font("SansSerif", Font.TRUETYPE_FONT, 12);
		// 设置图示的字体
		chart.getLegend().setItemFont(labelFont);
		// 横轴 x
		ValueAxis domainAxis = plot.getDomainAxis();
		domainAxis.setLabelFont(labelFont);// 轴标题
		domainAxis.setTickLabelFont(labelFont);// 轴数值
		//domainAxis.setLabel("Time / h");
				
				
		
		// 纵轴 y
		NumberAxis Y_numberaxis = (NumberAxis) plot.getRangeAxis();
		Y_numberaxis.setLabelFont(labelFont);
		Y_numberaxis.setTickLabelFont(labelFont);
		Y_numberaxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		Y_numberaxis.setAutoRangeIncludesZero(true);
		//Y_numberaxis.setLabel("Temperature / °C");

		
		
		/*
		
		원래 설정(Original setting)
		
		*/
		
		/*// X 축 설정
		final DateAxis domainAxis = new DateAxis("Time / h");
		domainAxis.setTickMarkPosition(DateTickMarkPosition.MIDDLE);
		domainAxis.setLowerMargin(0.0D);
		domainAxis.setUpperMargin(0.0D);
		plot.setDomainAxis(domainAxis);
		plot.setForegroundAlpha(0.5f);*/
		
						
		/*// Y 축 설정		
		final DateAxis rangeAxis = new DateAxis("Temperature / °C");
		rangeAxis.setLowerMargin(0.15);
		rangeAxis.setUpperMargin(0.15);
		plot.setRangeAxis(rangeAxis);*/

		return chart;
	}

	/**
	 * Starting point for the demonstration application.
	 *
	 * @param args
	 *            ignored.
	 */
	public static void main(final String[] args) {

		final DifferenceChartDemo2 demo = new DifferenceChartDemo2(
				"Difference Chart Demo 2");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);

	}

}
