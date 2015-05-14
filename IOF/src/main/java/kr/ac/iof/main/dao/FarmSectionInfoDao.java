/**                                                                             				                **/
/**                                File Name   : FarmSectionInfoDao.java       	    		            		   	**/  		
/**                                Description : FarmSectionInfo Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.FarmSectionInfo;

public interface FarmSectionInfoDao {
	public void add(FarmSectionInfo farmSectionInfo);

	public void delete(int farmSectionInfoId);

	public void update(FarmSectionInfo farmSectionInfo);

	public List<FarmSectionInfo> getAll();

	public FarmSectionInfo getById(int farmSectionInfoId);
}
