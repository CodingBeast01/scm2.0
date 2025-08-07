package com.scm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.scm.entities.User;
import com.scm.repsitories.UserRepo;

@Service
public class SecurityUserCustomDetailService implements UserDetailsService {

    // This service can be used to load user-specific data for authentication
    // and authorization purposes.
    // Implement methods to load user by username, roles, etc.

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Logic to fetch user details from the database or any other source
       return userRepo.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + username));
    }

}
