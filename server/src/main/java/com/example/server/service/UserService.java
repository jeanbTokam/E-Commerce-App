package com.example.server.service;

import com.example.server.dto.UserDTO;
import com.example.server.mapper.EntityMapper;
import com.example.server.model.User;
import com.example.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private EntityMapper entityMapper;
    @Autowired
    private UserRepository userRepository;

    public UserDTO addUser(UserDTO userDTO){

        User user =  entityMapper.userDTOToUser(userDTO);
        User savedUser = userRepository.save(user);
        return entityMapper.userToUserDTO(savedUser);
    }

    public List<UserDTO> getAllUsers(){
        return userRepository.findAll().stream()
                .map(entityMapper::userToUserDTO).collect(Collectors.toList());
    }

    public Optional<UserDTO> getUserById(Long id){
        return userRepository.findById(id)
                .map(entityMapper::userToUserDTO);
    }

    public void deleteUser(Long id ){
        userRepository.deleteById(id);
    }

}
