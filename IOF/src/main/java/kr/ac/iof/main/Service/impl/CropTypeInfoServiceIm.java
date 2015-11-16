/**                                                                                 	           		**/
/**                                File Name   : CropTypeInfoService.java                	               	**/  		
/**                                Description : cropTypeInfo에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service.impl;

import java.util.List;



import kr.ac.iof.main.Service.CropTypeInfoService;
import kr.ac.iof.main.dao.CropTypeInfoDao;
import kr.ac.iof.model.Main.CropTypeInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class CropTypeInfoServiceIm implements CropTypeInfoService{
	
	@Autowired
	private CropTypeInfoDao cropTypeInfoDao ;
	 
    public void setCropTypeInfoDao(CropTypeInfoDao cropTypeInfoDao) {
        this.cropTypeInfoDao = cropTypeInfoDao;
    }
 
    @Override
    @Transactional
    public void add(CropTypeInfo p) {
    	System.out.println("addserviceimple");
        this.cropTypeInfoDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(CropTypeInfo p) {
        this.cropTypeInfoDao.update(p);
    }
 
    @Override
    @Transactional
    public List<CropTypeInfo> getAll() {
    	System.out.println("cropTypeInfoServicelm");
        return this.cropTypeInfoDao.getAll();
    }
 
    @Override
    @Transactional
    public CropTypeInfo getById(int id) {
        return this.cropTypeInfoDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int cropTypeInfoId) {
        this.cropTypeInfoDao.delete(cropTypeInfoId);
    }

}
