package com.vincent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.vincent.dto.UserDTO;
import com.vincent.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Reference
	private UserService userService;

	@GetMapping("/{userId}")
	public UserDTO queryById(@PathVariable Long userId) {
		UserDTO userDto = this.userService.queryById(userId);
		return userDto;
	}

	@PatchMapping("/{userId}")
	public void update(@PathVariable Long userId,
			@RequestBody UserDTO userDTO) {
		this.userService.updateById(userId, userDTO);
		System.out.println("更新完毕");
	}

}
