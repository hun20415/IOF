/**                                                                                 	           **/
/**                                File Name   : HistEnvironSum.java                	              **/  		
/**                                Description : hist_environ_sum  환경이력데이터(요약)                   **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "hist_environ_sum")
public class HistEnvironSum {
	
	@Id
	@Column(name = "FARM_ID") //4 primary key, FOREIGN KEY
	private int farmId ;
	@Id
	@Column(name = "FARM_SECTION_ID") //2 primary key
	private int farmSectionId;
	@Id
	@Column(name = "SEQ_NO") //10 primary key
	private int seqNo;
	
	@Column(name = "DATA_INQ_DATE") //DATETIME
	private Date dataInqDate;
	
	@Column(name = "TEMPERATURE_OUT") //DOUBLE(10,2)
	private double temperatureOut;
	
	@Column(name = "HUMIDITY_OUT") //DOUBLE(10,2)
	private double humidityOut;
	
	@Column(name = "WIND_DIRECTION") //3
	private int windDirection;
	
	@Column(name = "WIND_SPEED") //DOUBLE(10,2)
	private double windSpeed;
	
	@Column(name = "RAINFALL") //1
	private int rainfall;
	
	@Column(name = "TEMPERATURE_IN") //DOUBLE(10,2)
	private double temperatureIn;
	@Column(name = "HUMIDITY_IN") //DOUBLE(10,2)
	private double humidityIn;
	@Column(name = "CO2") //4
	private int co2;
	
	@Column(name = "SOLAR_RADIATION") //DOUBLE(10,2)
	private double solarRadiation;
	@Column(name = "DAILY_RADIATION") //DOUBLE(10,2)
	private double dailyRadiation;
	@Column(name = "SYS_DATE") //3
	private Date sysDate;
	
	
	public HistEnvironSum () {

	    }


	public HistEnvironSum(int farmId, int farmSectionId, int seqNo,
			Date dataInqDate, double temperatureOut, double humidityOut,
			int windDirection, double windSpeed, int rainfall,
			double temperatureIn, double humidityIn, int co2,
			double solarRadiation, double dailyRadiation, Date sysDate) {
		super();
		this.farmId = farmId;
		this.farmSectionId = farmSectionId;
		this.seqNo = seqNo;
		this.dataInqDate = dataInqDate;
		this.temperatureOut = temperatureOut;
		this.humidityOut = humidityOut;
		this.windDirection = windDirection;
		this.windSpeed = windSpeed;
		this.rainfall = rainfall;
		this.temperatureIn = temperatureIn;
		this.humidityIn = humidityIn;
		this.co2 = co2;
		this.solarRadiation = solarRadiation;
		this.dailyRadiation = dailyRadiation;
		this.sysDate = sysDate;
	}


	public int getFarmId() {
		return farmId;
	}


	public int getFarmSectionId() {
		return farmSectionId;
	}


	public int getSeqNo() {
		return seqNo;
	}


	public Date getDataInqDate() {
		return dataInqDate;
	}


	public double getTemperatureOut() {
		return temperatureOut;
	}


	public double getHumidityOut() {
		return humidityOut;
	}


	public int getWindDirection() {
		return windDirection;
	}


	public double getWindSpeed() {
		return windSpeed;
	}


	public int getRainfall() {
		return rainfall;
	}


	public double getTemperatureIn() {
		return temperatureIn;
	}


	public double getHumidityIn() {
		return humidityIn;
	}


	public int getCo2() {
		return co2;
	}


	public double getSolarRadiation() {
		return solarRadiation;
	}


	public double getDailyRadiation() {
		return dailyRadiation;
	}


	public Date getSysDate() {
		return sysDate;
	}


	public void setFarmId(int farmId) {
		this.farmId = farmId;
	}


	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}


	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}


	public void setDataInqDate(Date dataInqDate) {
		this.dataInqDate = dataInqDate;
	}


	public void setTemperatureOut(double temperatureOut) {
		this.temperatureOut = temperatureOut;
	}


	public void setHumidityOut(double humidityOut) {
		this.humidityOut = humidityOut;
	}


	public void setWindDirection(int windDirection) {
		this.windDirection = windDirection;
	}


	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}


	public void setRainfall(int rainfall) {
		this.rainfall = rainfall;
	}


	public void setTemperatureIn(double temperatureIn) {
		this.temperatureIn = temperatureIn;
	}


	public void setHumidityIn(double humidityIn) {
		this.humidityIn = humidityIn;
	}


	public void setCo2(int co2) {
		this.co2 = co2;
	}


	public void setSolarRadiation(double solarRadiation) {
		this.solarRadiation = solarRadiation;
	}


	public void setDailyRadiation(double dailyRadiation) {
		this.dailyRadiation = dailyRadiation;
	}


	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}
	
	
}
