package com.vincent.service;

import com.vincent.dto.UserDTO;

public interface UserService {

	public UserDTO queryById(Long userId);

	public void updateById(Long userId, UserDTO userDTO);

}
