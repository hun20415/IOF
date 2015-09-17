/**                                                                                 	           **/
/**                                File Name   : HistEnvironRaw.java                	              **/  		
/**                                Description : hist_environ_raw  환경이력데이터(raw)                   **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class HistEnvironRawPK implements Serializable {
	
	private int seqNo ;
	private FarmInfo farmInfo;
	private int farmSectionId;
	
	public HistEnvironRawPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HistEnvironRawPK(int seqNo, FarmInfo farmInfo, int farmSectionId) {
		super();
		this.seqNo = seqNo;
		this.farmInfo = farmInfo;
		this.farmSectionId = farmSectionId;
	}
	
	public int getSeqNo() {
		return seqNo;
	}
	
	public void setSeqNo(int seqNo) {
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
		HistEnvironRawPK other = (HistEnvironRawPK) obj;
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
