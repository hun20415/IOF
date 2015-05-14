/**                                                                                 	           		**/
/**                                File Name   : HistEnvironSumService.java                	               	**/  		
/**                                Description : histEnvironSum에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;


import kr.ac.iof.main.dao.HistEnvironSumDao;
import kr.ac.iof.model.Main.HistEnvironSum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class HistEnvironSumServiceIm implements HistEnvironSumService{
	
	@Autowired
	private HistEnvironSumDao histEnvironSumDao ;
	 
    public void setHistEnvironSumDao(HistEnvironSumDao histEnvironSumDao) {
        this.histEnvironSumDao = histEnvironSumDao;
    }
 
    @Override
    @Transactional
    public void add(HistEnvironSum p) {
    	System.out.println("addserviceimple");
        this.histEnvironSumDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(HistEnvironSum p) {
        this.histEnvironSumDao.update(p);
    }
 
    @Override
    @Transactional
    public List<HistEnvironSum> getAll() {
    	System.out.println("histEnvironSumServicelm");
        return this.histEnvironSumDao.getAll();
    }
 
    @Override
    @Transactional
    public HistEnvironSum getById(int id) {
        return this.histEnvironSumDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int histEnvironSumId) {
        this.histEnvironSumDao.delete(histEnvironSumId);
    }

}
