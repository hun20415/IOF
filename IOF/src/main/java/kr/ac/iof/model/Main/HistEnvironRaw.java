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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;

import java.util.Date;


@Entity
@Table(name = "hist_environ_raw")
@IdClass(HistEnvironRawPK.class)
public class HistEnvironRaw {
	
	@Id
	@Column(name = "SEQ_NO") //10 primary key
	private int seqNo ;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "FARM_ID", referencedColumnName = "FARM_ID") //4 primary key, FOREIGN KEY
	private FarmInfo farmInfo;
	
	@Id
	@Column(name = "FARM_SECTION_ID") //11 primary key
	private int farmSectionId;
	
	@Column(name = "DATA_INQ_DATE") //DATETIME
	private Date dataInqDate;
	
	@ManyToOne
	@JoinColumnsOrFormulas(value = {
		//@JoinColumn(name = "FARM_ID", referencedColumnName = "FARM_ID", insertable = false, updatable=false), //4 , FOREIGN KEY
			@JoinColumnOrFormula(formula = @JoinFormula(value="FARM_ID", referencedColumnName="FARM_ID")),
			@JoinColumnOrFormula(column = @JoinColumn(name = "EQ_ID", referencedColumnName="EQ_ID"))
					
	})
	private FarmEquipList farmEquipList;
	/*
	@Column(name = "EQ_ID") //DOUBLE(10,2)
	private int eqId;*/
	
	@Column(name = "EQ_VALUE") //DOUBLE(10,2)
	private double eqValue;
	
	@Column(name = "SYS_DATE") //TIMESTAMP
	private Date sysDate;
	
		
	public HistEnvironRaw () {

	}
	public HistEnvironRaw(int seqNo, FarmInfo farmInfo, int farmSectionId,
			Date dataInqDate, FarmEquipList farmEquipList, double eqValue,
			Date sysDate) {
		super();
		this.seqNo = seqNo;
		this.farmInfo = farmInfo;
		this.farmSectionId = farmSectionId;
		this.dataInqDate = dataInqDate;//데이터상 시간
		this.farmEquipList = farmEquipList;
		this.eqValue = eqValue;
		this.sysDate = sysDate;//기록시간
	}
	/*public HistEnvironRawbak(int seqNo, FarmInfo farmInfo, int farmSectionId,
			Date dataInqDate, int eqId, double eqValue,
			Date sysDate) {
		super();
		this.seqNo = seqNo;
		this.farmInfo = farmInfo;
		this.farmSectionId = farmSectionId;
		this.dataInqDate = dataInqDate;
		this.eqId = eqId;
		this.eqValue = eqValue;
		this.sysDate = sysDate;
	}

	public int getEqId() {
		return eqId;
	}

	public void setEqId(int eqId) {
		this.eqId = eqId;
	}*/
	
	

	public int getSeqNo() {
		return seqNo;
	}

	public int getFarmSectionId() {
		return farmSectionId;
	}

	public Date getDataInqDate() {
		return dataInqDate;
	}

	public double getEqValue() {
		return eqValue;
	}

	public Date getSysDate() {
		return sysDate;
	}

	public FarmInfo getFarmInfo() {
		return farmInfo;
	}

	public void setFarmInfo(FarmInfo farmInfo) {
		this.farmInfo = farmInfo;
	}

	public FarmEquipList getFarmEquipList() {
		return farmEquipList;
	}

	public void setFarmEquipList(FarmEquipList farmEquipList) {
		this.farmEquipList = farmEquipList;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}

	public void setDataInqDate(Date dataInqDate) {
		this.dataInqDate = dataInqDate;
	}

	public void setEqValue(double eqValue) {
		this.eqValue = eqValue;
	}

	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}
	
}
