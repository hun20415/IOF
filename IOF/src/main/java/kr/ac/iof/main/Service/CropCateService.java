package kr.ac.iof.main.Service;

import java.util.List;

import kr.ac.iof.model.Main.CropCate;
  
public interface CropCateService {
 
	public void add(CropCate cropcate);

	public void delete(int cropcateid);

	public void update(CropCate cropcate);

	public List<CropCate> getAll();

	public CropCate getById(int cropcateid);
     
}