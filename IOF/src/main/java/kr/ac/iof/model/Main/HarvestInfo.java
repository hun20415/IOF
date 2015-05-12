/**                                                                                 	           **/
/**                                File Name   : HarvestInfo.java                	              **/  		
/**                                Description : harvest_info  수확 정보                                                        **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "harvest_info")
public class HarvestInfo {
	
	@Id
	@Column(name = "TNO") //10 primary key
	private int tno;
	@Column(name = "CULTIVATE_ID") //10 FOREIGN KEY
	private int cultivateId;
	@Column(name = "HARVEST_DATE") //DATE
	private Date harvestDate;

	@Column(name = "FARM_ID") //4  FOREIGN KEY
	private int farmId;
	@Column(name = "FARM_SECTION_ID") //2 
	private int farmSectionId;
	@Column(name = "FARM_SECTION_LINE") //2 
	private int farmSectionLine;
	@Column(name = "HARVEST_AMOUNT") //DOUBLE(10,2)
	private double harvestAmount;
	
	public HarvestInfo () {

	    }

	public HarvestInfo(int tno, int cultivateId, Date harvestDate, int farmId,
			int farmSectionId, int farmSectionLine, double harvestAmount) {
		super();
		this.tno = tno;
		this.cultivateId = cultivateId;
		this.harvestDate = harvestDate;
		this.farmId = farmId;
		this.farmSectionId = farmSectionId;
		this.farmSectionLine = farmSectionLine;
		this.harvestAmount = harvestAmount;
	}

	public int getTno() {
		return tno;
	}

	public int getCultivateId() {
		return cultivateId;
	}

	public Date getHarvestDate() {
		return harvestDate;
	}

	public int getFarmId() {
		return farmId;
	}

	public int getFarmSectionId() {
		return farmSectionId;
	}

	public int getFarmSectionLine() {
		return farmSectionLine;
	}

	public double getHarvestAmount() {
		return harvestAmount;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public void setCultivateId(int cultivateId) {
		this.cultivateId = cultivateId;
	}

	public void setHarvestDate(Date harvestDate) {
		this.harvestDate = harvestDate;
	}

	public void setFarmId(int farmId) {
		this.farmId = farmId;
	}

	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}

	public void setFarmSectionLine(int farmSectionLine) {
		this.farmSectionLine = farmSectionLine;
	}

	public void setHarvestAmount(double harvestAmount) {
		this.harvestAmount = harvestAmount;
	}
	
	
	
}
