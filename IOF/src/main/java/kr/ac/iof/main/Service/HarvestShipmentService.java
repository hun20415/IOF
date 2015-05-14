/**                                                                                 	           **/
/**                                File Name   : HarvestShipmentService.java                	               **/  		
/**                                Description : harvestShipment에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.HarvestShipment;
  
public interface HarvestShipmentService {
 
	public void add(HarvestShipment harvestShipment);

	public void delete(int harvestShipmentId);

	public void update(HarvestShipment harvestShipment);

	public List<HarvestShipment> getAll();

	public HarvestShipment getById(int harvestShipmentId);
     
}