package kr.ac.iof.main.Service;

import java.util.List;


import kr.ac.iof.main.dao.CropCateDao;
import kr.ac.iof.model.Main.CropCate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class CropCateServiceIm implements CropCateService{
	
	@Autowired
	private CropCateDao cropcateDao ;
	 
    public void setCropCateDao(CropCateDao cropcateDao) {
        this.cropcateDao = cropcateDao;
    }
 
    @Override
    @Transactional
    public void addCropCate(CropCate p) {
    	System.out.println("addserviceimple");
        this.cropcateDao.addCropCate(p);
    }
 
    @Override
    @Transactional
    public void updateUser(CropCate p) {
        this.cropcateDao.updateUser(p);
    }
 
    @Override
    @Transactional
    public List<CropCate> getAllUsers() {
    	System.out.println("cripcateServicelm");
        return this.cropcateDao.getAllUsers();
    }
 
    @Override
    @Transactional
    public CropCate getUserById(int id) {
        return this.cropcateDao.getUserById(id);
    }
 
    @Override
    @Transactional
    public void deleteUser(int cropcateid) {
        this.cropcateDao.deleteUser(cropcateid);
    }

}
