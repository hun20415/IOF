/**                                                                             				                **/
/**                                File Name   : DsInfoDao.java       	    		            		   	**/  		
/**                                Description : DsInfo Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                               				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.DsInfo;

public interface DsInfoDao {
	public void add(DsInfo dsInfo);

	public void delete(int dsInfoId);

	public void update(DsInfo dsInfo);

	public List<DsInfo> getAll();

	public DsInfo getById(int dsInfoId);
}
