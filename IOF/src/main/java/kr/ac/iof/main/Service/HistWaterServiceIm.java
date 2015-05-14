/**                                                                                 	           		**/
/**                                File Name   : HistWaterService.java                	               	**/  		
/**                                Description : histWater에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.14(옥정윤)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service;

import java.util.List;


import kr.ac.iof.main.dao.HistWaterDao;
import kr.ac.iof.model.Main.HistWater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class HistWaterServiceIm implements HistWaterService{
	
	@Autowired
	private HistWaterDao histWaterDao ;
	 
    public void setHistWaterDao(HistWaterDao histWaterDao) {
        this.histWaterDao = histWaterDao;
    }
 
    @Override
    @Transactional
    public void add(HistWater p) {
    	System.out.println("addserviceimple");
        this.histWaterDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(HistWater p) {
        this.histWaterDao.update(p);
    }
 
    @Override
    @Transactional
    public List<HistWater> getAll() {
    	System.out.println("histWaterServicelm");
        return this.histWaterDao.getAll();
    }
 
    @Override
    @Transactional
    public HistWater getById(int id) {
        return this.histWaterDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int histWaterId) {
        this.histWaterDao.delete(histWaterId);
    }

}
