package uy.edu.cei.taller.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import uy.edu.cei.taller.bean.UsuarioBean;

@Mapper
public interface UsuarioMapper {

	public List<UsuarioBean> all();
	
}
