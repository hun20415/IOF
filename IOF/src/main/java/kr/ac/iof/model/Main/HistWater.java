/**                                                                                 	           **/
/**                                File Name   : HistWater.java                	              **/
/**                                Description : hist_water  양액, 관수 이력 데이터                      **/
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import kr.ac.iof.model.Main.HistWaterPK;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hist_water")
@IdClass(HistWaterPK.class)
public class HistWater {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "FARM_ID", referencedColumnName = "FARM_ID") 			//primary key & foreign key
	private FarmInfo farmInfo;
	
	@Id
	@Column(name = "SEQ_NO") 				//primary key
	private int seqNo;
	
	@Column(name = "DATA_INQ_DATE") 		// DATETIME
	private Date dataInqDate;
	
	@Column(name = "TEMPERATURE_GROUND") 	// DOUBLE(10,2)
	private double temperatureGround;
	
	@Column(name = "INPUT_AMOUNT") 			// DOUBLE(10,2)
	private double inputAmount;
	
	@Column(name = "INPUT_EC") 				// DOUBLE(10,2)
	private double inputEc;
	
	@Column(name = "INPUT_PH") 				// DOUBLE(10,2)
	private double inputPh;
	
	@Column(name = "GROUND_HUMIDITY")		// DOUBLE(10,2)
	private double groundHumidity;
	
	@Column(name = "GROUND_EC") 			// DOUBLE(10,2)
	private double groundEc;
	
	@Column(name = "GROUND_PH")				// DOUBLE(10,2)
	private double groundPh;
	
	@Column(name = "OUT_AMOUNT")			// DOUBLE(10,2)
	private double outAmount;
	
	@Column(name = "OUT_EC")				// DOUBLE(10,2)
	private double outEc;
	
	@Column(name = "OUT_PH")				// DOUBLE(10,2)
	private double outPh;
	
	@Column(name = "SYS_DATE")				// TIMESTAMP
	private Date sysDate;
	
	public HistWater() {
		
	}
	
	public HistWater(FarmInfo farmInfo, int seqNo, Date dataInqDate,
			double temperatureGround, double inputAmount, double inputEc,
			double inputPh, double groundHumidity, double groundEc,
			double groundPh, double outAmount, double outEc, double outPh,
			Date sysDate) {
		super();
		this.farmInfo = farmInfo;
		this.seqNo = seqNo;
		this.dataInqDate = dataInqDate;
		this.temperatureGround = temperatureGround;
		this.inputAmount = inputAmount;
		this.inputEc = inputEc;
		this.inputPh = inputPh;
		this.groundHumidity = groundHumidity;
		this.groundEc = groundEc;
		this.groundPh = groundPh;
		this.outAmount = outAmount;
		this.outEc = outEc;
		this.outPh = outPh;
		this.sysDate = sysDate;
	}
	
	public FarmInfo getFarmInfo() {
		return farmInfo;
	}
	
	public void setFarmId(FarmInfo farmInfo) {
		this.farmInfo = farmInfo;
	}
	
	public int getSeqNo() {
		return seqNo;
	}
	
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	
	public Date getDataInqDate() {
		return dataInqDate;
	}
	
	public void setDataInqDate(Date dataInqDate) {
		this.dataInqDate = dataInqDate;
	}
	
	public double getTemperatureGround() {
		return temperatureGround;
	}
	
	public void setTemperatureGround(double temperatureGround) {
		this.temperatureGround = temperatureGround;
	}
	
	public double getInputAmount() {
		return inputAmount;
	}
	
	public void setInputAmount(double inputAmount) {
		this.inputAmount = inputAmount;
	}
	
	public double getInputEc() {
		return inputEc;
	}
	
	public void setInputEc(double inputEc) {
		this.inputEc = inputEc;
	}
	
	public double getInputPh() {
		return inputPh;
	}
	
	public void setInputPh(double inputPh) {
		this.inputPh = inputPh;
	}
	
	public double getGroundHumidity() {
		return groundHumidity;
	}
	
	public void setGroundHumidity(double groundHumidity) {
		this.groundHumidity = groundHumidity;
	}
	
	public double getGroundEc() {
		return groundEc;
	}
	
	public void setGroundEc(double groundEc) {
		this.groundEc = groundEc;
	}
	
	public double getGroundPh() {
		return groundPh;
	}
	
	public void setGroundPh(double groundPh) {
		this.groundPh = groundPh;
	}
	
	public double getOutAmount() {
		return outAmount;
	}
	
	public void setOutAmount(double outAmount) {
		this.outAmount = outAmount;
	}
	
	public double getOutEc() {
		return outEc;
	}
	
	public void setOutEc(double outEc) {
		this.outEc = outEc;
	}
	
	public double getOutPh() {
		return outPh;
	}
	
	public void setOutPh(double outPh) {
		this.outPh = outPh;
	}
	
	public Date getSysDate() {
		return sysDate;
	}
	
	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}
	public int getFarmId(){
		return this.getFarmInfo().getFarmId();
	}
	
}
