package com.vincent.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.vincent.dao.UserDao;
import com.vincent.dto.UserDTO;
import com.vincent.po.UserPo;
import com.vincent.service.UserService;

@com.alibaba.dubbo.config.annotation.Service
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Cacheable(value = "user_queryById", key = "#userId")
	public UserDTO queryById(Long userId) {
		System.out.println("打印语句则没有走缓存");
		UserPo userPo = userDao.queryById(userId);
		UserDTO userDto = new UserDTO();
		BeanUtils.copyProperties(userPo, userDto);
		return userDto;
	}

	@CacheEvict(value = "user_queryById", key = "#userId")
	public void updateById(Long userId, UserDTO userDTO){
		userDTO.setId(userId);
		UserPo userPo = new UserPo();
		BeanUtils.copyProperties(userDTO, userPo);
		userDao.update(userPo);
	}

}
