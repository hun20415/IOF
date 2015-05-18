/**                                                                                 	           **/
/**                                File Name   : FarmCultivateInfo.java               	              **/  		
/**                                Description : farm_cultivate_info 온실재배정보                                                          **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.util.Date;

import kr.ac.iof.model.User;

@Entity
@Table(name = "farm_cultivate_info")
public class FarmCultivateInfo {
	
	@Id
	@Column(name = "TNO")//4 primary key
	private int tno;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID") //20 FOREIGN KEY
	private User user;
	
	@Column(name = "FARM_ID")//4 FOREIGN KEY
	private int farmId;
	@Column(name = "FARM_SECTION_ID")//2
	private int farmSectionId;
	@Column(name = "CROP_SPECIES_ID")//4 FOREIGN KEY
	private int cropSpeciesId;
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
	

	public FarmCultivateInfo(int tno, User user, int farmId,
			int farmSectionId, int cropSpeciesId, Date plantTime,
			Date productTimePlan, Date productTimeReal, Date endTime,
			String activeYn) {
		super();
		this.tno = tno;
		this.user = user;
		this.farmId = farmId;
		this.farmSectionId = farmSectionId;
		this.cropSpeciesId = cropSpeciesId;
		this.plantTime = plantTime;
		this.productTimePlan = productTimePlan;
		this.productTimeReal = productTimeReal;
		this.endTime = endTime;
		this.activeYn = activeYn;
	}


	public int getTno() {
		return tno;
	}

	public User getUser() {
		return user;
	}

	public int getFarmId() {
		return farmId;
	}

	public int getFarmSectionId() {
		return farmSectionId;
	}

	public int getCropSpeciesId() {
		return cropSpeciesId;
	}

	public Date getPlantTime() {
		return plantTime;
	}

	public Date getProductTimePlan() {
		return productTimePlan;
	}

	public Date getProductTimeReal() {
		return productTimeReal;
	}

	public Date getEndTime() {
		return endTime;
	}

	public String getActiveYn() {
		return activeYn;
	}
	public String getUserName1() {
		return user.getUserName();
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setFarmId(int farmId) {
		this.farmId = farmId;
	}

	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}

	public void setCropSpeciesId(int cropSpeciesId) {
		this.cropSpeciesId = cropSpeciesId;
	}

	public void setPlantTime(Date plantTime) {
		this.plantTime = plantTime;
	}

	public void setProductTimePlan(Date productTimePlan) {
		this.productTimePlan = productTimePlan;
	}

	public void setProductTimeReal(Date productTimeReal) {
		this.productTimeReal = productTimeReal;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public void setActiveYn(String activeYn) {
		this.activeYn = activeYn;
	}
	

	
}
