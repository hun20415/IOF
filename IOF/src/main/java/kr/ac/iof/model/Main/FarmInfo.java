/**                                                                                 	           **/
/**                                File Name   : FarmInfo.java                	              **/  		
/**                                Description : farm_info  온실 정보                                                        **/ 
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
@Table(name = "farm_info")
public class FarmInfo {
	
	@Id
	@Column(name = "FARM_ID") //4 primary key
	private int farmId;
	@Column(name = "FARM_NAME") //200
	private String farmName;
	@Column(name = "OWNER_ID") //20 FOREIGN KEY
	private String ownerId;
	@Column(name = "EMPLOYEE_ID") //20 FOREIGN KEY
	private String employeeId;

	@Column(name = "AREA_PYUNG") //DOUBLE(10,2)
	private double areaPyung;
	@Column(name = "AREA_MSQUARE") //DOUBLE(10,2)
	private double areaMsquare;
	@Column(name = "WIDTH") //DOUBLE(10,2)
	private double width;
	@Column(name = "LENGTH") //DOUBLE(10,2)
	private double length;
	@Column(name = "HEIGHT_MIN") //DOUBLE(10,2)
	private double heightMin;
	@Column(name = "HEIGHT_MAX") //DOUBLE(10,2)
	private double heightMax;
	
	@Column(name = "DIRECTION") //2
	private String direction;
	@Column(name = "MATERIAL_TYPE") //1
	private String materialType;
	@Column(name = "IFCONNECTED") //1
	private String ifConnected;
	
	@Column(name = "CONNECTED_NUM") //3
	private int connectedNum;
	@Column(name = "SECTION_NUM") //2
	private int sectionNum;
	
	@Column(name = "CULTIVATION_TYPE") //1
	private String cultivationType;
	@Column(name = "FARM_ZIPCODE") //6
	private String farmZipcode;
	@Column(name = "FARM_ADDR") //200
	private String farmAddr;
	
	@Column(name = "BUILD_DATE") //DATE
	private Date buildDate;

	
	public FarmInfo () {

	    }


	public FarmInfo(int farmId, String farmName, String ownerId,
			String employeeId, double areaPyung, double areaMsquare,
			double width, double length, double heightMin, double heightMax,
			String direction, String materialType, String ifConnected,
			int connectedNum, int sectionNum, String cultivationType,
			String farmZipcode, String farmAddr, Date buildDate) {
		super();
		this.farmId = farmId;
		this.farmName = farmName;
		this.ownerId = ownerId;
		this.employeeId = employeeId;
		this.areaPyung = areaPyung;
		this.areaMsquare = areaMsquare;
		this.width = width;
		this.length = length;
		this.heightMin = heightMin;
		this.heightMax = heightMax;
		this.direction = direction;
		this.materialType = materialType;
		this.ifConnected = ifConnected;
		this.connectedNum = connectedNum;
		this.sectionNum = sectionNum;
		this.cultivationType = cultivationType;
		this.farmZipcode = farmZipcode;
		this.farmAddr = farmAddr;
		this.buildDate = buildDate;
	}


	public int getFarmId() {
		return farmId;
	}


	public String getFarmName() {
		return farmName;
	}


	public String getOwnerId() {
		return ownerId;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public double getAreaPyung() {
		return areaPyung;
	}


	public double getAreaMsquare() {
		return areaMsquare;
	}


	public double getWidth() {
		return width;
	}


	public double getLength() {
		return length;
	}


	public double getHeightMin() {
		return heightMin;
	}


	public double getHeightMax() {
		return heightMax;
	}


	public String getDirection() {
		return direction;
	}


	public String getMaterialType() {
		return materialType;
	}


	public String getIfConnected() {
		return ifConnected;
	}


	public int getConnectedNum() {
		return connectedNum;
	}


	public int getSectionNum() {
		return sectionNum;
	}


	public String getCultivationType() {
		return cultivationType;
	}


	public String getFarmZipcode() {
		return farmZipcode;
	}


	public String getFarmAddr() {
		return farmAddr;
	}


	public Date getBuildDate() {
		return buildDate;
	}


	public void setFarmId(int farmId) {
		this.farmId = farmId;
	}


	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}


	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public void setAreaPyung(double areaPyung) {
		this.areaPyung = areaPyung;
	}


	public void setAreaMsquare(double areaMsquare) {
		this.areaMsquare = areaMsquare;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public void setHeightMin(double heightMin) {
		this.heightMin = heightMin;
	}


	public void setHeightMax(double heightMax) {
		this.heightMax = heightMax;
	}


	public void setDirection(String direction) {
		this.direction = direction;
	}


	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}


	public void setIfConnected(String ifConnected) {
		this.ifConnected = ifConnected;
	}


	public void setConnectedNum(int connectedNum) {
		this.connectedNum = connectedNum;
	}


	public void setSectionNum(int sectionNum) {
		this.sectionNum = sectionNum;
	}


	public void setCultivationType(String cultivationType) {
		this.cultivationType = cultivationType;
	}


	public void setFarmZipcode(String farmZipcode) {
		this.farmZipcode = farmZipcode;
	}


	public void setFarmAddr(String farmAddr) {
		this.farmAddr = farmAddr;
	}


	public void setBuildDate(Date buildDate) {
		this.buildDate = buildDate;
	}
	
	
}
