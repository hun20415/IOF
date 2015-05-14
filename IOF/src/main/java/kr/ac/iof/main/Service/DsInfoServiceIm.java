/**                                                                                 	           		**/
/**                                File Name   : DsInfoService.java                	               	**/  		
/**                                Description : dsInfo에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;


import kr.ac.iof.main.dao.DsInfoDao;
import kr.ac.iof.model.Main.DsInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class DsInfoServiceIm implements DsInfoService{
	
	@Autowired
	private DsInfoDao dsInfoDao ;
	 
    public void setDsInfoDao(DsInfoDao dsInfoDao) {
        this.dsInfoDao = dsInfoDao;
    }
 
    @Override
    @Transactional
    public void add(DsInfo p) {
    	System.out.println("addserviceimple");
        this.dsInfoDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(DsInfo p) {
        this.dsInfoDao.update(p);
    }
 
    @Override
    @Transactional
    public List<DsInfo> getAll() {
    	System.out.println("dsInfoServicelm");
        return this.dsInfoDao.getAll();
    }
 
    @Override
    @Transactional
    public DsInfo getById(int id) {
        return this.dsInfoDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int dsInfoId) {
        this.dsInfoDao.delete(dsInfoId);
    }

}
