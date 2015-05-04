package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.CropInfo;

public interface CropInfoDao {
	public void add(CropInfo cropinfo);

	public void delete(int cropid);

	public void update(CropInfo cropinfo);

	public List<CropInfo> getAll();

	public CropInfo getById(int cropid);
}
