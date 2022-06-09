package com.om.photoapp.api.users.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.om.photoapp.api.users.data.UserEntity;
import com.om.photoapp.api.users.data.UsersRepository;
import com.om.photoapp.api.users.shared.UserDto;

@Service
public class UsersServiceImpl implements UsersService {


	UsersRepository usersRepository;
	
	@Autowired
	public UsersServiceImpl(UsersRepository usersRepository){
		this.usersRepository=usersRepository;
	}
	@Override
	public UserDto createUser(UserDto userDetails) {
		userDetails.setUserId(UUID.randomUUID().toString());
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);
		userEntity.setEcryptedPassword("test");
		usersRepository.save(userEntity);
		return null;
	}

}
