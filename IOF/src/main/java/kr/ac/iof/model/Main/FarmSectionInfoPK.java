/**                                                                                 	           **/
/**                                File Name   : FarmSectionInfo.java                	              **/  		
/**                                Description : farm_section_info  온실 구역 정보                                                        **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import java.io.Serializable;

public class FarmSectionInfoPK implements Serializable{
	private int farmSectionId;
	private FarmInfo farmInfo;
	public FarmSectionInfoPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FarmSectionInfoPK(int farmSectionId, FarmInfo farmInfo) {
		super();
		this.farmSectionId = farmSectionId;
		this.farmInfo = farmInfo;
	}
	public int getFarmSectionId() {
		return farmSectionId;
	}
	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}
	public FarmInfo getFarmInfo() {
		return farmInfo;
	}
	public void setFarmInfo(FarmInfo farmInfo) {
		this.farmInfo = farmInfo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((farmInfo == null) ? 0 : farmInfo.hashCode());
		result = prime * result + farmSectionId;
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
		FarmSectionInfoPK other = (FarmSectionInfoPK) obj;
		if (farmInfo == null) {
			if (other.farmInfo != null)
				return false;
		} else if (!farmInfo.equals(other.farmInfo))
			return false;
		if (farmSectionId != other.farmSectionId)
			return false;
		return true;
	}
	
	
}
