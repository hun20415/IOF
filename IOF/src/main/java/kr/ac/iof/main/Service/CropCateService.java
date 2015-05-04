package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.CropCate;
  
public interface CropCateService {
 
	public void addCropCate(CropCate cropcate);

	public void deleteUser(int cropcateid);

	public void updateUser(CropCate cropcate);

	public List<CropCate> getAllUsers();

	public CropCate getUserById(int cropcateid);
     
}