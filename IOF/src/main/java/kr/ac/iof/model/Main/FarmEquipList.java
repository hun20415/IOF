/**                                                                                 	           **/
/**                                File Name   : FarmEquipList.java                	              **/  		
/**                                Description : farm_equip_list 온실별 장비 목록                                                        **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kr.ac.iof.model.UserGroup;

@Entity
@Table(name = "farm_equip_list")
@IdClass(FarmEquipListPK.class)
public class FarmEquipList {
		
	@Id
	@ManyToOne
	@JoinColumn(name = "FARM_ID") //4 primary key FOREIGN KEY
	private FarmInfo farmInfo;
	
	@Column(name = "FARM_SECTION_ID") //2
	private int farmSectionId;
	
	@Id
	@Column(name = "EQ_ID") //4 primary key
	private int eqId;
	
	@ManyToOne
	@JoinColumn(name = "EQ_TYPE_ID") //3  FOREIGN KEY
	private FarmEquipType eqType;
	
	
	@Column(name = "EQ_COMPANY") //50
	private String eqCompany;
	@Column(name = "EQ_MODEL") //50
	private String eqModel;
	@Column(name = "EQ_SW_VERSION") //50
	private String eqSwVersion;
	@Column(name = "EQ_DISCRIPTION") //50
	private String eqDiscription;

	
	public FarmEquipList () {

	}


	public FarmEquipList(FarmInfo farmInfo, int farmSectionId, int eqId, FarmEquipType eqType, 
			String eqCompany, String eqModel, String eqSwVersion,
			String eqDiscription) {
		super();
		this.farmInfo = farmInfo;
		this.farmSectionId = farmSectionId;
		this.eqId = eqId;
		this.eqType = eqType;
		this.eqCompany = eqCompany;
		this.eqModel = eqModel;
		this.eqSwVersion = eqSwVersion;
		this.eqDiscription = eqDiscription;
	}
	
	//get farmName from FarmInfo table
	public String getFarmName() {
		return farmInfo.getFarmName();
	}
	
	//set farmName to FarmInfo table
	public void setFarmName(String farmName) {
		farmInfo.setFarmName(farmName);
	}
	
	//get farmID from FarmInfo table
	public int getFarmId() {
		return farmInfo.getFarmId();
	}
	
	//set farmID to FarmInfo table
	public void getFarmName(int farmId) {
		farmInfo.setFarmId(farmId);
	}
	
	//get farmEquipTypeName from FarmEquipType table
	public String getFarmEquipTypeName() {
		return eqType.getEqTypeName();
	}
	
	//set farmEquipTypeName to FarmEquipType table
	public void setFarmEquipTypeName(String eqTypeName) {
		eqType.setEqTypeName(eqTypeName);
	}
	
	public FarmInfo getFarmInfo() {
		return farmInfo;
	}


	public void setFarmInfo(FarmInfo farmInfo) {
		this.farmInfo = farmInfo;
	}


	public int getFarmSectionId() {
		return farmSectionId;
	}


	public int getEqId() {
		return eqId;
	}


	public FarmEquipType getEqType() {
		return eqType;
	}


	public String getEqCompany() {
		return eqCompany;
	}


	public String getEqModel() {
		return eqModel;
	}


	public String getEqSwVersion() {
		return eqSwVersion;
	}


	public String getEqDiscription() {
		return eqDiscription;
	}


	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}


	public void setEqId(int eqId) {
		this.eqId = eqId;
	}


	public void setEqType(FarmEquipType eqType) {
		this.eqType = eqType;
	}


	public void setEqCompany(String eqCompany) {
		this.eqCompany = eqCompany;
	}


	public void setEqModel(String eqModel) {
		this.eqModel = eqModel;
	}


	public void setEqSwVersion(String eqSwVersion) {
		this.eqSwVersion = eqSwVersion;
	}


	public void setEqDiscription(String eqDiscription) {
		this.eqDiscription = eqDiscription;
	}
	
	public String getEqTypeName() {
		return eqType.getEqTypeName();
	}
	
	
}
