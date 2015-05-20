/**                                                                                 	           **/
/**                                File Name   : FarmSectionInfo.java                	              **/  		
/**                                Description : farm_section_info  온실 구역 정보                                                        **/ 
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

@Entity
@Table(name = "farm_section_info")
@IdClass(FarmSectionInfo.class)
public class FarmSectionInfo {
	
	@Id
	@Column(name = "FARM_SECTION_ID") //2 primary key
	private int farmSectionId;
	@Id
	@ManyToOne
	@JoinColumn(name = "FARM_ID", referencedColumnName="FARM_ID") //4 primary key FOREIGN KEY
	private FarmInfo farmInfo;
	
	@Column(name = "DISCRIPTION") //300
	private String discription;

	
	public FarmSectionInfo () {

	}

	public FarmSectionInfo(int farmSectionId, FarmInfo farmInfo,
			String discription) {
		super();
		this.farmSectionId = farmSectionId;
		this.farmInfo = farmInfo;
		this.discription = discription;
	}


	public int getFarmSectionId() {
		return farmSectionId;
	}

	public FarmInfo getFarmInfo() {
		return farmInfo;
	}

	public String getDiscription() {
		return discription;
	}


	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}

	public void setFarmInfo(FarmInfo farmInfo) {
		this.farmInfo = farmInfo;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
}
