package com.talkweb.tangjia.springboot_vue_elementUI_mpa.service;

import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.talkweb.tangjia.springboot_vue_elementUI_mpa.dto.UserDto;
import com.talkweb.tangjia.springboot_vue_elementUI_mpa.model.User;

public interface UserService {
	public List<User> findAllUsers();
	
	public PageInfo<User> findUsersByPage(PageInfo<User> pageInfo);
	
	public boolean addUser(UserDto user);
	
	public boolean deleteUser(int id);
}
