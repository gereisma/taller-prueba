package uy.edu.cei.taller.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import uy.edu.cei.taller.bean.UserBean;

@Mapper
public interface UserMapper {

	public List<UserBean> all();
	
}
