/**                                                                                 	           		**/
/**                                File Name   : CropSpeciesInfoService.java                	               	**/  		
/**                                Description : cropSpeciesInfo에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;


import kr.ac.iof.main.dao.CropSpeciesInfoDao;
import kr.ac.iof.model.Main.CropSpeciesInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class CropSpeciesInfoServiceIm implements CropSpeciesInfoService{
	
	@Autowired
	private CropSpeciesInfoDao cropSpeciesInfoDao ;
	 
    public void setCropSpeciesInfoDao(CropSpeciesInfoDao cropSpeciesInfoDao) {
        this.cropSpeciesInfoDao = cropSpeciesInfoDao;
    }
 
    @Override
    @Transactional
    public void add(CropSpeciesInfo p) {
    	System.out.println("addserviceimple");
        this.cropSpeciesInfoDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(CropSpeciesInfo p) {
        this.cropSpeciesInfoDao.update(p);
    }
 
    @Override
    @Transactional
    public List<CropSpeciesInfo> getAll() {
    	System.out.println("cropSpeciesInfoServicelm");
        return this.cropSpeciesInfoDao.getAll();
    }
 
    @Override
    @Transactional
    public CropSpeciesInfo getById(int id) {
        return this.cropSpeciesInfoDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int cropSpeciesInfoId) {
        this.cropSpeciesInfoDao.delete(cropSpeciesInfoId);
    }

}
