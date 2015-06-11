/**                                                                                 	           **/
/**                                File Name   : FarmEquipList.java                	              **/  		
/**                                Description : farm_equip_list 온실별 장비 목록                                                        **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class FarmEquipListPK implements Serializable{
		
	private FarmInfo farmInfo;	
	
	private int eqId;

	public FarmEquipListPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FarmEquipListPK(FarmInfo farmInfo, int eqId) {
		super();
		// TODO Auto-generated constructor stub
		this.farmInfo = farmInfo;
		this.eqId = eqId;
	}

	public FarmInfo getFarmInfo() {
		return farmInfo;
	}

	public void setFarmInfo(FarmInfo farmInfo) {
		this.farmInfo = farmInfo;
	}

	public int getEqId() {
		return eqId;
	}

	public void setEqId(int eqId) {
		this.eqId = eqId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eqId;
		result = prime * result
				+ ((farmInfo == null) ? 0 : farmInfo.hashCode());
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
		FarmEquipListPK other = (FarmEquipListPK) obj;
		if (eqId != other.eqId)
			return false;
		if (farmInfo == null) {
			if (other.farmInfo != null)
				return false;
		} else if (!farmInfo.equals(other.farmInfo))
			return false;
		return true;
	}
	
}
