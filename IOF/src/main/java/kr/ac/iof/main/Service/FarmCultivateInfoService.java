/**                                                                                 	           **/
/**                                File Name   : FarmCultivateInfoService.java                	               **/  		
/**                                Description : farmCultivateInfo에 대한 Dao, 쿠리문 처리 		                   **/ 
/**                                Update      : 2015.05.14(옥정윤)    	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/
package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.FarmCultivateInfo;
  
public interface FarmCultivateInfoService {
 
	public void add(Integer m_farmId, String m_userId, Integer m_cropSpeciesId, FarmCultivateInfo farmCultivateInfo);

	public void delete(int farmCultivateInfoId);

	public void update(Integer m_farmId, String m_userId, Integer m_cropSpeciesId, FarmCultivateInfo farmCultivateInfo);

	public List<FarmCultivateInfo> getAll();

	public FarmCultivateInfo getById(int farmCultivateInfoId);
     
}