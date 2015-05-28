/**                                                                                 	           		**/
/**                                File Name   : FarmCultivateInfoService.java                	               	**/  		
/**                                Description : farmCultivateInfo에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)    	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;


import kr.ac.iof.main.dao.FarmCultivateInfoDao;
import kr.ac.iof.model.Main.FarmCultivateInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class FarmCultivateInfoServiceIm implements FarmCultivateInfoService{
	
	@Autowired
	private FarmCultivateInfoDao farmCultivateInfoDao ;
	 
    public void setFarmCultivateInfoDao(FarmCultivateInfoDao farmCultivateInfoDao) {
        this.farmCultivateInfoDao = farmCultivateInfoDao;
    }
 
    //songlock: 2015-05-28   
    @Override
    @Transactional
    public void add(Integer m_farmId, String m_userId, Integer m_cropSpeciesId, FarmCultivateInfo p) {
    	System.out.println("addserviceimple");
        this.farmCultivateInfoDao.add(m_farmId, m_userId, m_cropSpeciesId, p);
    }
 
    //songlock: 2015-05-28
    @Override
    @Transactional
    public void update(Integer m_farmId, String m_userId, Integer m_cropSpeciesId, FarmCultivateInfo p) {
        this.farmCultivateInfoDao.update(m_farmId, m_userId, m_cropSpeciesId, p);
    }
 
    @Override
    @Transactional
    public List<FarmCultivateInfo> getAll() {
    	System.out.println("farmCultivateInfoServicelm");
        return this.farmCultivateInfoDao.getAll();
    }
 
    @Override
    @Transactional
    public FarmCultivateInfo getById(int id) {
        return this.farmCultivateInfoDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int farmCultivateInfoId) {
        this.farmCultivateInfoDao.delete(farmCultivateInfoId);
    }

}
