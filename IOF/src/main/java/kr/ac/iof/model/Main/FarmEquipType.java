/**                                                                                 	           **/
/**                                File Name   : FarmEquipType.java                	              **/  		
/**                                Description : farm_equip_type  장비 유형 정보                                                        **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "farm_equip_type")
public class FarmEquipType {
	
	@Id
	@Column(name = "EQ_TYPE_ID") //3 primary key
	private int eqTypeId;
	@Column(name = "EQ_TYPE_NAME") //20
	private String eqTypeName;
	@Column(name = "DESCRIPTION") //200
	private String description;
	@Column(name = "CONTROL_SENSOR") //1
	private String controlSensor ;

	
	public FarmEquipType () {

	    }


	public FarmEquipType(int eqTypeId, String eqTypeName, String description,
			String controlSensor) {
		super();
		this.eqTypeId = eqTypeId;
		this.eqTypeName = eqTypeName;
		this.description = description;
		this.controlSensor = controlSensor;
	}


	public int getEqTypeId() {
		return eqTypeId;
	}


	public String getEqTypeName() {
		return eqTypeName;
	}


	public String getDescription() {
		return description;
	}


	public String getControlSensor() {
		return controlSensor;
	}


	public void setEqTypeId(int eqTypeId) {
		this.eqTypeId = eqTypeId;
	}


	public void setEqTypeName(String eqTypeName) {
		this.eqTypeName = eqTypeName;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setControlSensor(String controlSensor) {
		this.controlSensor = controlSensor;
	}
	
	
}
