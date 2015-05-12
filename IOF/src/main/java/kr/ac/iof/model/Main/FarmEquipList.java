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
import javax.persistence.Table;

@Entity
@Table(name = "farm_equip_list")
public class FarmEquipList {
	
	@Id
	@Column(name = "FARM_ID") //4 primary key FOREIGN KEY
	private int farmId;
	@Column(name = "FARM_SECTION_ID") //2
	private int farmSectionId;
	@Id
	@Column(name = "EQ_ID") //4 primary key
	private int eqId;
	@Column(name = "EQ_TYPE_ID") //3  FOREIGN KEY
	private int eqTypeId;
	
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


	public FarmEquipList(int farmId, int farmSectionId, int eqId, int eqTypeId,
			String eqCompany, String eqModel, String eqSwVersion,
			String eqDiscription) {
		super();
		this.farmId = farmId;
		this.farmSectionId = farmSectionId;
		this.eqId = eqId;
		this.eqTypeId = eqTypeId;
		this.eqCompany = eqCompany;
		this.eqModel = eqModel;
		this.eqSwVersion = eqSwVersion;
		this.eqDiscription = eqDiscription;
	}


	public int getFarmId() {
		return farmId;
	}


	public int getFarmSectionId() {
		return farmSectionId;
	}


	public int getEqId() {
		return eqId;
	}


	public int getEqTypeId() {
		return eqTypeId;
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


	public void setFarmId(int farmId) {
		this.farmId = farmId;
	}


	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}


	public void setEqId(int eqId) {
		this.eqId = eqId;
	}


	public void setEqTypeId(int eqTypeId) {
		this.eqTypeId = eqTypeId;
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
	
	
}
