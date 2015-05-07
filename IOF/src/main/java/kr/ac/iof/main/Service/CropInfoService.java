/**                                                                                 	           		**/
/**                                File Name   : CropInfoService.java                	               	**/  		
/**                                Description : cropinfo interface 	                           		**/
/**                                Update      : 2015.05.07(박정훈)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.CropInfo;

public interface CropInfoService {
	public void add(CropInfo cropinfo);

	public void delete(int cropid);

	public void update(CropInfo cropinfo);

	public List<CropInfo> getAll();

	public CropInfo getById(int cropid);
}
