/**                                                                             				                **/
/**                                File Name   : FarmInfoDao.java       	    		            		   	**/  		
/**                                Description : FarmInfo Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                            				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.FarmInfo;

public interface FarmInfoDao {
	public void add(FarmInfo farmInfo);

	public void delete(int farmInfoId);

	public void update(FarmInfo farmInfo);

	public List<FarmInfo> getAll();
	public List<String> getAllId(); 
	public FarmInfo getById(int farmInfoId);
}
