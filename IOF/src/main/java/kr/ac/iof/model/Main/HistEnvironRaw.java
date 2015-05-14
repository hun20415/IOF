/**                                                                                 	           **/
/**                                File Name   : HistEnvironRaw.java                	              **/  		
/**                                Description : hist_environ_raw  환경이력데이터(raw)                   **/ 
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
@Table(name = "hist_environ_raw")
public class HistEnvironRaw {
	
	@Id
	@Column(name = "SEQ_NO") //10 primary key
	private int seqNo ;
	@Id
	@Column(name = "FARM_ID") //4 primary key, FOREIGN KEY
	private int farmId;
	@Id
	@Column(name = "FARM_SECTION_ID") //11 primary key
	private int farmSectionId;
	
	@Column(name = "DATA_INQ_DATE") //DATETIME
	private Date dataInqDate;
	
	@Column(name = "EQ_ID") //4 , FOREIGN KEY
	private int eqId;
	
	@Column(name = "EQ_VALUE") //DOUBLE(10,2)
	private double eqValue;
	
	@Column(name = "SYS_DATE") //TIMESTAMP
	private Date sysDate;
	
		
	public HistEnvironRaw () {

	    }


	public HistEnvironRaw(int seqNo, int farmId, int farmSectionId,
			Date dataInqDate, int eqId, double eqValue, Date sysDate) {
		super();
		this.seqNo = seqNo;
		this.farmId = farmId;
		this.farmSectionId = farmSectionId;
		this.dataInqDate = dataInqDate;
		this.eqId = eqId;
		this.eqValue = eqValue;
		this.sysDate = sysDate;
	}


	public int getSeqNo() {
		return seqNo;
	}


	public int getFarmId() {
		return farmId;
	}


	public int getFarmSectionId() {
		return farmSectionId;
	}


	public Date getDataInqDate() {
		return dataInqDate;
	}


	public int getEqId() {
		return eqId;
	}


	public double getEqValue() {
		return eqValue;
	}


	public Date getSysDate() {
		return sysDate;
	}


	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}


	public void setFarmId(int farmId) {
		this.farmId = farmId;
	}


	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}


	public void setDataInqDate(Date dataInqDate) {
		this.dataInqDate = dataInqDate;
	}


	public void setEqId(int eqId) {
		this.eqId = eqId;
	}


	public void setEqValue(double eqValue) {
		this.eqValue = eqValue;
	}


	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}
	
	
	
}
