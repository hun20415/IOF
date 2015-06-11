//songlock, 2015-06-08

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "set_tomato_water")
public class SetTomatoWater { 
	
	@Id
	@Column(name = "TNO")//4, PK
	private int tno;
	
	@ManyToOne
	@JoinColumn(name = "CROP_TYPE_ID", referencedColumnName = "CROP_TYPE_ID")//11, FK
	private CropTypeInfo cropTypeInfo;
	
	@Column(name = "SET_TIME") //5,2
	private double setTime;
	@Column(name = "FLAG") //5,2
	private String flag;
	@Column(name = "IN_EC") //1
	private double inEC;
	@Column(name = "IN_PH") //5,2
	private double inPH;
	@Column(name = "IN_PH_MIN") //5,2
	private double inPHMin;
	@Column(name = "IN_WATER") //5,2
	private double inWater;
	@Column(name = "LIGHT_CONDITION") //4
	private int lightCondition;
	@Column(name = "TIME_PER_DAY") //2
	private int timePerDay;
	@Column(name = "GRD_AMOUNT") //5,2
	private double grdAmount;
	@Column(name = "OUT_EC_MIN") //5,2
	private double outECMin;
	@Column(name = "OUT_EC_MAX") //5,2
	private double outECMax;
	
	public SetTomatoWater() {
		// TODO Auto-generated constructor stub
	}

	public SetTomatoWater(int tno, CropTypeInfo cropTypeInfo, double setTime,
			String flag, double inEC, double inPH, double inPHMin,
			double inWater, int lightCondition, int timePerDay,
			double grdAmount, double outECMin, double outECMax) {
		super();
		this.tno = tno;
		this.cropTypeInfo = cropTypeInfo;
		this.setTime = setTime;
		this.flag = flag;
		this.inEC = inEC;
		this.inPH = inPH;
		this.inPHMin = inPHMin;
		this.inWater = inWater;
		this.lightCondition = lightCondition;
		this.timePerDay = timePerDay;
		this.grdAmount = grdAmount;
		this.outECMin = outECMin;
		this.outECMax = outECMax;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public CropTypeInfo getCropTypeInfo() {
		return cropTypeInfo;
	}

	public void setCropTypeInfo(CropTypeInfo cropTypeInfo) {
		this.cropTypeInfo = cropTypeInfo;
	}

	public double getSetTime() {
		return setTime;
	}

	public void setSetTime(double setTime) {
		this.setTime = setTime;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public double getInEC() {
		return inEC;
	}

	public void setInEC(double inEC) {
		this.inEC = inEC;
	}

	public double getInPH() {
		return inPH;
	}

	public void setInPH(double inPH) {
		this.inPH = inPH;
	}

	public double getInPHMin() {
		return inPHMin;
	}

	public void setInPHMin(double inPHMin) {
		this.inPHMin = inPHMin;
	}

	public double getInWater() {
		return inWater;
	}

	public void setInWater(double inWater) {
		this.inWater = inWater;
	}

	public int getLightCondition() {
		return lightCondition;
	}

	public void setLightCondition(int lightCondition) {
		this.lightCondition = lightCondition;
	}

	public int getTimePerDay() {
		return timePerDay;
	}

	public void setTimePerDay(int timePerDay) {
		this.timePerDay = timePerDay;
	}

	public double getGrdAmount() {
		return grdAmount;
	}

	public void setGrdAmount(double grdAmount) {
		this.grdAmount = grdAmount;
	}

	public double getOutECMin() {
		return outECMin;
	}

	public void setOutECMin(double outECMin) {
		this.outECMin = outECMin;
	}

	public double getOutECMax() {
		return outECMax;
	}

	public void setOutECMax(double outECMax) {
		this.outECMax = outECMax;
	}

}
