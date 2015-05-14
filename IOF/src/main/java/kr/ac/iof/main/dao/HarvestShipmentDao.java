/**                                                                             				                **/
/**                                File Name   : HarvestShipmentDao.java       	    		            		   	**/  		
/**                                Description : HarvestShipment Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.HarvestShipment;

public interface HarvestShipmentDao {
	public void add(HarvestShipment harvestShipment);

	public void delete(int harvestShipmentId);

	public void update(HarvestShipment harvestShipment);

	public List<HarvestShipment> getAll();

	public HarvestShipment getById(int harvestShipmentId);
}
