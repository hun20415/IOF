/**                                                                                 	           **/
/**                                File Name   : HarvestShipment.java                	              **/  		
/**                                Description : harvest_shipment  출하 정보                                                        **/ 
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
@Table(name = "harvest_shipment")
public class HarvestShipment {
	
	@Id
	@Column(name = "TNO") //10 primary key
	private int tno;
	
	@Column(name = "SHIP_DATE") //DATETIME
	private Date shipDate;
	
	@Column(name = "FARM_ID") //4 FOREIGN KEY
	private int farmId;
	@Column(name = "BUYER_ID") //4 FOREIGN KEY
	private int buyerId;
	@Column(name = "SPECIES_ID") //4 FOREIGN KEY
	private int speciesId;
	@Column(name = "QUALITY_LEVEL") //1
	private int qualityLevel;
	
	@Column(name = "PACKAGE_KG") //DOUBLE(10,2)
	private double packageKg;
	@Column(name = "PACKAGE_PRICE") //DOUBLE(10,2)
	private double packagePrice;
	
	@Column(name = "PACKAGE_NUM") //4
	private int packageNum;
	
	@Column(name = "TOTAL_AMOUNT") //DOUBLE(10,2)
	private double totalAmount;
	@Column(name = "TOTAL_PRICE") //DOUBLE(10,2)
	private double totalPrice ;
		
	public HarvestShipment () {

	    }

	public HarvestShipment(int tno, Date shipDate, int farmId, int buyerId,
			int speciesId, int qualityLevel, double packageKg,
			double packagePrice, int packageNum, double totalAmount,
			double totalPrice) {
		super();
		this.tno = tno;
		this.shipDate = shipDate;
		this.farmId = farmId;
		this.buyerId = buyerId;
		this.speciesId = speciesId;
		this.qualityLevel = qualityLevel;
		this.packageKg = packageKg;
		this.packagePrice = packagePrice;
		this.packageNum = packageNum;
		this.totalAmount = totalAmount;
		this.totalPrice = totalPrice;
	}

	public int getTno() {
		return tno;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public int getFarmId() {
		return farmId;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public int getSpeciesId() {
		return speciesId;
	}

	public int getQualityLevel() {
		return qualityLevel;
	}

	public double getPackageKg() {
		return packageKg;
	}

	public double getPackagePrice() {
		return packagePrice;
	}

	public int getPackageNum() {
		return packageNum;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public void setFarmId(int farmId) {
		this.farmId = farmId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public void setSpeciesId(int speciesId) {
		this.speciesId = speciesId;
	}

	public void setQualityLevel(int qualityLevel) {
		this.qualityLevel = qualityLevel;
	}

	public void setPackageKg(double packageKg) {
		this.packageKg = packageKg;
	}

	public void setPackagePrice(double packagePrice) {
		this.packagePrice = packagePrice;
	}

	public void setPackageNum(int packageNum) {
		this.packageNum = packageNum;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
