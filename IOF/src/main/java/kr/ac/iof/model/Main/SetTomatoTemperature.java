 //songlock, 2015-06-08

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "set_tomato_temperature")
public class SetTomatoTemperature { 
	
	@Id
	@Column(name = "TNO")//4, PK
	private int tno;
	
	@ManyToOne
	@JoinColumn(name = "CROP_TYPE_ID1", referencedColumnName = "CROP_TYPE_ID")//11, FK
	private CropTypeInfo cropTypeInfo;
	
	@Column(name = "SET_TIME") //5,2
	private double setTime;
	
	@Column(name = "UPPER_BOUND") //5,2
	private double upperBound;
	@Column(name = "LOWER_BOUND") //5,2
	private double lowerBound;
	@Column(name = "OP_VEGETATIVE") //5,2
	private double opVegetative;
	@Column(name = "OP_VEGE_ALARM1") //5,2
	private double opVegeAlarm1;
	@Column(name = "OP_VEGE_ALARM2") //5,2
	private double opVegeAlarm2;
	@Column(name = "OP_REPRODUCTIVE") //5,2
	private double opReproductive;
	@Column(name = "OP_REPRO_ALARM1") //5,2
	private double opReproAlarm1;
	@Column(name = "OP_REPRO_ALARM2") //5,2
	private double opReproAlarm2;
	@Column(name = "USER_DEFINE1") //5,2
	private double userDefine1;
	@Column(name = "OP_USER1_ALARM1") //5,2
	private double opUser1Alarm1;
	@Column(name = "OP_USER1_ALARM2") //5,2
	private double opUser1Alarm2;
	@Column(name = "USER_DEFINE2") //5,2
	private double userDefine2;
	@Column(name = "OP_USER2_ALARM1") //5,2
	private double opUser2Alarm1;
	@Column(name = "OP_USER2_ALARM2") //5,2
	private double opUser2Alarm2;
	@Column(name = "USER_DEFINE3") //5,2
	private double userDefine3;
	@Column(name = "OP_USER3_ALARM1") //5,2
	private double opUser3Alarm1;
	@Column(name = "OP_USER3_ALARM2") //5,2
	private double opUser3Alarm2;
	@Column(name = "USER_DEFINE4") //5,2
	private double userDefine4;
	@Column(name = "OP_USER4_ALARM1") //5,2
	private double opUser4Alarm1;
	@Column(name = "OP_USER4_ALARM2") //5,2
	private double opUser4Alarm2;
	@Column(name = "USER_DEFINE5") //5,2
	private double userDefine5;
	@Column(name = "OP_USER5_ALARM1") //5,2
	private double opUser5Alarm1;
	@Column(name = "OP_USER5_ALARM2") //5,2
	private double opUser5Alarm2;
	
	public SetTomatoTemperature() {
		// TODO Auto-generated constructor stub
	}

	public SetTomatoTemperature(int tno, CropTypeInfo cropTypeInfo,
			double setTime, double upperBound, double lowerBound,
			double opVegetative, double opVegeAlarm1, double opVegeAlarm2,
			double opReproductive, double opReproAlarm1, double opReproAlarm2,
			double userDefine1, double opUser1Alarm1, double opUser1Alarm2,
			double userDefine2, double opUser2Alarm1, double opUser2Alarm2,
			double userDefine3, double opUser3Alarm1, double opUser3Alarm2,
			double userDefine4, double opUser4Alarm1, double opUser4Alarm2,
			double userDefine5, double opUser5Alarm1, double opUser5Alarm2) {
		super();
		this.tno = tno;
		this.cropTypeInfo = cropTypeInfo;
		this.setTime = setTime;
		this.upperBound = upperBound;
		this.lowerBound = lowerBound;
		this.opVegetative = opVegetative;
		this.opVegeAlarm1 = opVegeAlarm1;
		this.opVegeAlarm2 = opVegeAlarm2;
		this.opReproductive = opReproductive;
		this.opReproAlarm1 = opReproAlarm1;
		this.opReproAlarm2 = opReproAlarm2;
		this.userDefine1 = userDefine1;
		this.opUser1Alarm1 = opUser1Alarm1;
		this.opUser1Alarm2 = opUser1Alarm2;
		this.userDefine2 = userDefine2;
		this.opUser2Alarm1 = opUser2Alarm1;
		this.opUser2Alarm2 = opUser2Alarm2;
		this.userDefine3 = userDefine3;
		this.opUser3Alarm1 = opUser3Alarm1;
		this.opUser3Alarm2 = opUser3Alarm2;
		this.userDefine4 = userDefine4;
		this.opUser4Alarm1 = opUser4Alarm1;
		this.opUser4Alarm2 = opUser4Alarm2;
		this.userDefine5 = userDefine5;
		this.opUser5Alarm1 = opUser5Alarm1;
		this.opUser5Alarm2 = opUser5Alarm2;
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

	public double getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(double upperBound) {
		this.upperBound = upperBound;
	}

	public double getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound(double lowerBound) {
		this.lowerBound = lowerBound;
	}

	public double getOpVegetative() {
		return opVegetative;
	}

	public void setOpVegetative(double opVegetative) {
		this.opVegetative = opVegetative;
	}

	public double getOpVegeAlarm1() {
		return opVegeAlarm1;
	}

	public void setOpVegeAlarm1(double opVegeAlarm1) {
		this.opVegeAlarm1 = opVegeAlarm1;
	}

	public double getOpVegeAlarm2() {
		return opVegeAlarm2;
	}

	public void setOpVegeAlarm2(double opVegeAlarm2) {
		this.opVegeAlarm2 = opVegeAlarm2;
	}

	public double getOpReproductive() {
		return opReproductive;
	}

	public void setOpReproductive(double opReproductive) {
		this.opReproductive = opReproductive;
	}

	public double getOpReproAlarm1() {
		return opReproAlarm1;
	}

	public void setOpReproAlarm1(double opReproAlarm1) {
		this.opReproAlarm1 = opReproAlarm1;
	}

	public double getOpReproAlarm2() {
		return opReproAlarm2;
	}

	public void setOpReproAlarm2(double opReproAlarm2) {
		this.opReproAlarm2 = opReproAlarm2;
	}

	public double getUserDefine1() {
		return userDefine1;
	}

	public void setUserDefine1(double userDefine1) {
		this.userDefine1 = userDefine1;
	}

	public double getOpUser1Alarm1() {
		return opUser1Alarm1;
	}

	public void setOpUser1Alarm1(double opUser1Alarm1) {
		this.opUser1Alarm1 = opUser1Alarm1;
	}

	public double getOpUser1Alarm2() {
		return opUser1Alarm2;
	}

	public void setOpUser1Alarm2(double opUser1Alarm2) {
		this.opUser1Alarm2 = opUser1Alarm2;
	}

	public double getUserDefine2() {
		return userDefine2;
	}

	public void setUserDefine2(double userDefine2) {
		this.userDefine2 = userDefine2;
	}

	public double getOpUser2Alarm1() {
		return opUser2Alarm1;
	}

	public void setOpUser2Alarm1(double opUser2Alarm1) {
		this.opUser2Alarm1 = opUser2Alarm1;
	}

	public double getOpUser2Alarm2() {
		return opUser2Alarm2;
	}

	public void setOpUser2Alarm2(double opUser2Alarm2) {
		this.opUser2Alarm2 = opUser2Alarm2;
	}

	public double getUserDefine3() {
		return userDefine3;
	}

	public void setUserDefine3(double userDefine3) {
		this.userDefine3 = userDefine3;
	}

	public double getOpUser3Alarm1() {
		return opUser3Alarm1;
	}

	public void setOpUser3Alarm1(double opUser3Alarm1) {
		this.opUser3Alarm1 = opUser3Alarm1;
	}

	public double getOpUser3Alarm2() {
		return opUser3Alarm2;
	}

	public void setOpUser3Alarm2(double opUser3Alarm2) {
		this.opUser3Alarm2 = opUser3Alarm2;
	}

	public double getUserDefine4() {
		return userDefine4;
	}

	public void setUserDefine4(double userDefine4) {
		this.userDefine4 = userDefine4;
	}

	public double getOpUser4Alarm1() {
		return opUser4Alarm1;
	}

	public void setOpUser4Alarm1(double opUser4Alarm1) {
		this.opUser4Alarm1 = opUser4Alarm1;
	}

	public double getOpUser4Alarm2() {
		return opUser4Alarm2;
	}

	public void setOpUser4Alarm2(double opUser4Alarm2) {
		this.opUser4Alarm2 = opUser4Alarm2;
	}

	public double getUserDefine5() {
		return userDefine5;
	}

	public void setUserDefine5(double userDefine5) {
		this.userDefine5 = userDefine5;
	}

	public double getOpUser5Alarm1() {
		return opUser5Alarm1;
	}

	public void setOpUser5Alarm1(double opUser5Alarm1) {
		this.opUser5Alarm1 = opUser5Alarm1;
	}

	public double getOpUser5Alarm2() {
		return opUser5Alarm2;
	}

	public void setOpUser5Alarm2(double opUser5Alarm2) {
		this.opUser5Alarm2 = opUser5Alarm2;
	}
	
	
}
