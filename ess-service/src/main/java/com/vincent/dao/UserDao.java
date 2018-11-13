package com.vincent.dao;

import org.apache.ibatis.annotations.Mapper;

import com.vincent.po.UserPo;

@Mapper
public interface UserDao {

	public UserPo queryById(Long userId);

	public void update(UserPo userPo);

}
