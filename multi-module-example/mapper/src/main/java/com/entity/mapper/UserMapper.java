package com.entity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.entities.User;
import com.example.domain.UserDTO;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);

}
