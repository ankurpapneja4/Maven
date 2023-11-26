package com.example.webapp.controller;

import com.entity.mapper.UserMapper;
import com.example.entities.User;
import com.example.domain.UserDTO;

public class UserController {

    public User saveUser(UserDTO userDTO){

        return UserMapper.INSTANCE.userDTOToUser(userDTO);
    }
}
