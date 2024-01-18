package dao;

import java.util.List;

import entity.Department;

public interface IDeptDao {

	public int insert(Department dept);  //parameter is entity class object
	public int update(Department dept);
	
	
	public Department selectOne(int dno);
	public List<Department> selectAll();
	public int deleteOne(int dno);
}
