package com.om.photoapp.api.users.service;

import com.om.photoapp.api.users.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {

	UserDto createUser(UserDto userDetails);
}
