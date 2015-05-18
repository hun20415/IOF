/**                                                                                 	           **/
/**                                File Name   : HistEnvironSum.java                	              **/  		
/**                                Description : hist_environ_sum  환경이력데이터(요약)                   **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import java.io.Serializable;

public class HistEnvironSumPK implements Serializable{
	private FarmInfo farmInfo;
	private int farmSectionId;
	private int seqNo;
	
	public HistEnvironSumPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HistEnvironSumPK(FarmInfo farmInfo, int farmSectionId, int seqNo) {
		super();
		this.farmInfo = farmInfo;
		this.farmSectionId = farmSectionId;
		this.seqNo = seqNo;
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
		result = prime * result + farmSectionId;
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
		HistEnvironSumPK other = (HistEnvironSumPK) obj;
		if (farmInfo == null) {
			if (other.farmInfo != null)
				return false;
		} else if (!farmInfo.equals(other.farmInfo))
			return false;
		if (farmSectionId != other.farmSectionId)
			return false;
		if (seqNo != other.seqNo)
			return false;
		return true;
	}
	
}
