package kr.ac.iof.model.Main;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


public class HistWaterPK implements Serializable {
	
	private FarmInfo farmInfo;
	private int seqNo;
	
	public HistWaterPK() {
		
	}
	
	public HistWaterPK(FarmInfo farmInfo, int seqNo) {
		this.farmInfo = farmInfo;
		this.seqNo = seqNo;
	}
	
	public FarmInfo getFarmInfo() {
		return farmInfo;
	}
	
	public void setFarmInfo(FarmInfo farmInfo) {
		this.farmInfo = farmInfo;
	}
	
	public int getSeqNo() {
		return seqNo;
	}
	
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((farmInfo == null) ? 0 : farmInfo.hashCode());
		result = prime * result + seqNo;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistWaterPK other = (HistWaterPK) obj;
		if (farmInfo == null) {
			if (other.farmInfo != null)
				return false;
		} else if (!farmInfo.equals(other.farmInfo))
			return false;
		if (seqNo != other.seqNo)
			return false;
		return true;
	}
	
}
