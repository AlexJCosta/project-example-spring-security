package com.example.springsecurity.conf;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springsecurity.model.User;
import com.example.springsecurity.repository.UserRepository;

@Service
public class AuthService implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = repository.findByLogin(username);
		
		if (user.isPresent()) {
			return user.get();
		}
		
		throw new UsernameNotFoundException("Incorrect data!");
	}

}
