/**                                                                             				                **/
/**                                File Name   : HistWaterDao.java       	    		            		   	**/  		
/**                                Description : HistWater Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.HistWater;

public interface HistWaterInfoDao {
	public void add(HistWater histWater);

	public void delete(int histWaterId);

	public void update(HistWater histWater);

	public List<HistWater> getAll();

	public HistWater getById(int histWaterId);
}
