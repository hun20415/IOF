/**                                                                             				                **/
/**                                File Name   : CropSpeciesInfoDao.java       	    		            		   	**/  		
/**                                Description : CropSpeciesInfo Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.CropSpeciesInfo;

public interface CropSpeciesInfoDao {
	public void add(CropSpeciesInfo cropSpeciesInfo);

	public void delete(int cropSpeciesInfoId);

	public void update(CropSpeciesInfo cropSpeciesInfo);

	public List<CropSpeciesInfo> getAll();

	public CropSpeciesInfo getById(int cropSpeciesInfoId);
}
