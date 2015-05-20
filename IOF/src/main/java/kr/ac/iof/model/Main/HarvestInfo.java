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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "harvest_info")
public class HarvestInfo {
	
	@Id
	@Column(name = "TNO") //10 primary key
	private int tno;
	
	@ManyToOne
	@JoinColumn(name = "CULTIVATE_ID", referencedColumnName = "TNO") //10 FOREIGN KEY
	private FarmCultivateInfo farmCultivateInfo;
	
	@Column(name = "HARVEST_DATE") //DATE
	private Date harvestDate;

	@ManyToOne
	@JoinColumn(name = "FARM_ID", referencedColumnName = "FARM_ID") //4  FOREIGN KEY
	private FarmInfo farmInfo;
	
	@Column(name = "FARM_SECTION_ID") //2 
	private int farmSectionId;
	
	@Column(name = "FARM_SECTION_LINE") //2 
	private int farmSectionLine;
	
	@Column(name = "HARVEST_AMOUNT") //DOUBLE(10,2)
	private double harvestAmount;
	
	public HarvestInfo () {

	}

	public HarvestInfo(int tno, FarmCultivateInfo farmCultivateInfo,
			Date harvestDate, FarmInfo farmInfo, int farmSectionId,
			int farmSectionLine, double harvestAmount) {
		super();
		this.tno = tno;
		this.farmCultivateInfo = farmCultivateInfo;
		this.harvestDate = harvestDate;
		this.farmInfo = farmInfo;
		this.farmSectionId = farmSectionId;
		this.farmSectionLine = farmSectionLine;
		this.harvestAmount = harvestAmount;
	}

	public int getTno() {
		return tno;
	}

	public Date getHarvestDate() {
		return harvestDate;
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

	public FarmCultivateInfo getFarmCultivateInfo() {
		return farmCultivateInfo;
	}

	public void setFarmCultivateInfo(FarmCultivateInfo farmCultivateInfo) {
		this.farmCultivateInfo = farmCultivateInfo;
	}

	public FarmInfo getFarmInfo() {
		return farmInfo;
	}

	public void setFarmInfo(FarmInfo farmInfo) {
		this.farmInfo = farmInfo;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public void setHarvestDate(Date harvestDate) {
		this.harvestDate = harvestDate;
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
