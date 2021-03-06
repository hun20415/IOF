/**                                                                                 	           		**/
/**                                File Name   : BuyerInfoService.java                	               	**/  		
/**                                Description : buyerInfo에 대한 service controller에서 처리되어야 하는 
 * 								            	 기능은 이곳에 서 처리 (데이터 처리 포함)dao와 메소드의 이름이 같다			     	**/ 
/**                                Update      : 2015.05.07(박정훈)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/
package kr.ac.iof.main.Service.impl;

import java.util.List;



import kr.ac.iof.main.Service.BuyerInfoService;
import kr.ac.iof.main.dao.BuyerInfoDao;
import kr.ac.iof.model.Main.BuyerInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class BuyerInfoServiceIm implements BuyerInfoService{
	
	@Autowired
	private BuyerInfoDao buyerInfoDao ;
	 
    public void setBuyerInfoDao(BuyerInfoDao buyerInfoDao) {
        this.buyerInfoDao = buyerInfoDao;
    }
 
    @Override
    @Transactional
    public void add(BuyerInfo p) {
    	System.out.println("addserviceimple");
        this.buyerInfoDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(BuyerInfo p) {
        this.buyerInfoDao.update(p);
    }
 
    @Override
    @Transactional
    public List<BuyerInfo> getAll() {
    	System.out.println("buyerInfoServicelm");
        return this.buyerInfoDao.getAll();
    }
 
    @Override
    @Transactional
    public BuyerInfo getById(int id) {
        return this.buyerInfoDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int buyerInfoId) {
        this.buyerInfoDao.delete(buyerInfoId);
    }

}
