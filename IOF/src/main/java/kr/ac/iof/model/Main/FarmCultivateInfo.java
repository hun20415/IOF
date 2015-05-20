/**                                                                                 	           **/
/**                                File Name   : FarmCultivateInfo.java               	              **/  		
/**                                Description : farm_cultivate_info 온실재배정보                                                          **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kr.ac.iof.model.User;

@Entity
@Table(name = "farm_cultivate_info")
public class FarmCultivateInfo {
	
	@Id
	@Column(name = "TNO")//4 primary key
	private int tno;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID") //20 FOREIGN KEY
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "FARM_ID", referencedColumnName = "FARM_ID")//4 FOREIGN KEY
	private FarmInfo farmInfo;	
	
	@Column(name = "FARM_SECTION_ID")//4
	private int farmSectionId;
	
	@ManyToOne
	@JoinColumn(name = "CROP_SPECIES_ID", referencedColumnName = "SPECIES_ID")//4 FOREIGN KEY
	private CropSpeciesInfo cropSpeciesInfo;
	
	@Column(name = "PLANT_TIME")//
	private Date plantTime;
	
	@Column(name = "PRODUCT_TIME_PLAN")//
	private Date productTimePlan;
	
	@Column(name = "PRODUCT_TIME_REAL")//
	private Date productTimeReal;
	
	@Column(name = "END_TIME")//
	private Date endTime;
	
	@Column(name = "ACTIVE_YN")//1
	private String activeYn;
	
	public FarmCultivateInfo () {

	}

	public FarmCultivateInfo(int tno, User user, FarmInfo farmInfo,
			int farmSectionId, CropSpeciesInfo cropSpeciesInfo, Date plantTime,
			Date productTimePlan, Date productTimeReal, Date endTime,
			String activeYn) {
		super();
		this.tno = tno;
		this.user = user;
		this.farmInfo = farmInfo;
		this.farmSectionId = farmSectionId;
		this.cropSpeciesInfo = cropSpeciesInfo;
		this.plantTime = plantTime;
		this.productTimePlan = productTimePlan;
		this.productTimeReal = productTimeReal;
		this.endTime = endTime;
		this.activeYn = activeYn;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}

	public CropSpeciesInfo getCropSpeciesInfo() {
		return cropSpeciesInfo;
	}

	public void setCropSpeciesInfo(CropSpeciesInfo cropSpeciesInfo) {
		this.cropSpeciesInfo = cropSpeciesInfo;
	}

	public Date getPlantTime() {
		return plantTime;
	}

	public void setPlantTime(Date plantTime) {
		this.plantTime = plantTime;
	}

	public Date getProductTimePlan() {
		return productTimePlan;
	}

	public void setProductTimePlan(Date productTimePlan) {
		this.productTimePlan = productTimePlan;
	}

	public Date getProductTimeReal() {
		return productTimeReal;
	}

	public void setProductTimeReal(Date productTimeReal) {
		this.productTimeReal = productTimeReal;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getActiveYn() {
		return activeYn;
	}

	public void setActiveYn(String activeYn) {
		this.activeYn = activeYn;
	}

	//get farmName from FarmInfo table
	public String getFarmName() {
		return farmInfo.getFarmName();
	} 
	//get farmName from FarmInfo table
		public int getFarmId() {
			return farmInfo.getFarmId();
		}
	//get userName from User table
	public String getUserName() {
		return user.getUserName();
	}
	
	//get cropSpeciesName from CropSpecies table
	public String getCropSpeciesName() {
		return cropSpeciesInfo.getSpeciesName();
	} 
	
}
