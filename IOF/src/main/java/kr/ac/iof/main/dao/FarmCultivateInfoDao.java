/**                                                                             				                **/
/**                                File Name   : FarmCultivateInfoDao.java       	    		            		   	**/  		
/**                                Description : FarmCultivateInfo Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                              				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.FarmCultivateInfo;

public interface FarmCultivateInfoDao {
	public void add(FarmCultivateInfo farmCultivateInfo);

	public void delete(int farmCultivateInfoId);

	public void update(FarmCultivateInfo farmCultivateInfo);

	public List<FarmCultivateInfo> getAll();

	public FarmCultivateInfo getById(int farmCultivateInfoId);
}
