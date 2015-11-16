/*********************************************************************************************************/
/*************************cropinfo에 대한 service controller에서 처리되어야 하는 기능은 이곳에 서 처리 (데이터 처리 포함*****************/
/*************************2015-05-06 박정훈 *****************************************************************/
/*********************************************************************************************************/
package kr.ac.iof.main.Service.impl;

import java.util.List;






import kr.ac.iof.main.Service.CropInfoService;
import kr.ac.iof.main.dao.CropInfoDao;
import kr.ac.iof.model.Main.CropInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service
@Transactional(propagation = Propagation.SUPPORTS)  
public class CropInfoServiceIm implements CropInfoService{
	
	@Autowired
	private CropInfoDao cropInfoDao ;
	 
    public void setCropCateDao(CropInfoDao cropInfoDao) {
        this.cropInfoDao = cropInfoDao;
    }
 
    @Override
    @Transactional
    public void add(CropInfo p) {
        this.cropInfoDao.add(p);
    }
 
    @Override
    @Transactional
    public void update(CropInfo p) {
        this.cropInfoDao.update(p);
    }
 
    @Override
    @Transactional
    public List<CropInfo> getAll() {
    	System.out.println("cropInfoServicelm");
        return this.cropInfoDao.getAll();
    }
 
    @Override
    @Transactional
    public CropInfo getById(int id) {
        return this.cropInfoDao.getById(id);
    }
 
    @Override
    @Transactional
    public void delete(int cropId) {
        this.cropInfoDao.delete(cropId);
    }

}
