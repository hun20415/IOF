package kr.ac.iof.model.Main;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


class HistWaterPK implements Serializable {
	private int farmId;
	private int seqNo;
	
	public HistWaterPK() {
		
	}
	public HistWaterPK(int farmId, int seqNo) {
		this.farmId = farmId;
		this.seqNo = seqNo;
	}
	
	public int getFarmId() {
		return farmId;
	}
	public void setFarmId(int farmId) {
		this.farmId = farmId;
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
		result = prime * result + farmId;
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
		if (farmId != other.farmId)
			return false;
		if (seqNo != other.seqNo)
			return false;
		return true;
	}
	
}
