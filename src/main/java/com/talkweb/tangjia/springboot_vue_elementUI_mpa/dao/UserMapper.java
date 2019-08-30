package com.talkweb.tangjia.springboot_vue_elementUI_mpa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.talkweb.tangjia.springboot_vue_elementUI_mpa.model.User;

public interface UserMapper {
	public int insertUser(User user);
	
	public List<User> selectAllUsers();
	
	public Page<User> selectUsersByPage();
	
	public int deleteUser(@Param("id") int id);
	
}
