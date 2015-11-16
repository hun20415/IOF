/**                                                                                 	           		**/
/**                                File Name   : HistEnvironRawService.java                	               	**/  		
/**                                Description : histEnvironRaw에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service.impl;

import java.util.List;




import kr.ac.iof.main.Service.HistEnvironRawService;
import kr.ac.iof.main.dao.HistEnvironRawDao;
import kr.ac.iof.model.Main.HistEnvironRaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class HistEnvironRawServiceIm implements HistEnvironRawService{
	
	@Autowired
	private HistEnvironRawDao histEnvironRawDao ;
	 
    public void setHistEnvironRawDao(HistEnvironRawDao histEnvironRawDao) {
        this.histEnvironRawDao = histEnvironRawDao;
    }
 
    @Override
    @Transactional
    public void add(HistEnvironRaw p) {
    	System.out.println("addserviceimple");
        this.histEnvironRawDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(HistEnvironRaw p) {
        this.histEnvironRawDao.update(p);
    }
 
    @Override
    @Transactional
    public List<HistEnvironRaw> getAll() {
    	System.out.println("histEnvironRawServicelm");
        return this.histEnvironRawDao.getAll();
    }
 
    @Override
    @Transactional
    public HistEnvironRaw getById(int id) {
        return this.histEnvironRawDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int histEnvironRawId) {
        this.histEnvironRawDao.delete(histEnvironRawId);
    }
    
    @Override
    @Transactional
    public List<HistEnvironRaw> getSelectEq(String farmId, String sectionId, String eqId){
    	return this.histEnvironRawDao.getSelectEq(farmId, sectionId, eqId);
    }

}
