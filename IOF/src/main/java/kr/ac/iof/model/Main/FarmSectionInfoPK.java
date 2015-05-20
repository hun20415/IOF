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
	private int farmId;
	public FarmSectionInfoPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FarmSectionInfoPK(int farmSectionId, int farmInfo) {
		super();
		this.farmSectionId = farmSectionId;
		this.farmId = farmInfo;
	}
	public int getFarmSectionId() {
		return farmSectionId;
	}
	public void setFarmSectionId(int farmSectionId) {
		this.farmSectionId = farmSectionId;
	}
	public int getFarmInfo() {
		return farmId;
	}
	public void setFarmInfo(int farmId) {
		this.farmId = farmId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + farmId;
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
		if (farmId != other.farmId)
			return false;
		if (farmSectionId != other.farmSectionId)
			return false;
		return true;
	}
	
	
	
}
