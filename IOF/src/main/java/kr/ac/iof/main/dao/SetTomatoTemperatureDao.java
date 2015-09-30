/**                                                                             				                **/
/**                                File Name   : HistWaterDao.java       	    		            		   	**/  		
/**                                Description : HistWater Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(?¥ì????)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.SetTomatoTemperature;

public interface SetTomatoTemperatureDao {
	public void add(SetTomatoTemperature setTomatoTemperature);

	public void delete(int farmId, int seqNo);

	public void update(SetTomatoTemperature setTomatoTemperature);

	public List<SetTomatoTemperature> getAll();

	public SetTomatoTemperature getById(int farmId, int seqNo);
}
