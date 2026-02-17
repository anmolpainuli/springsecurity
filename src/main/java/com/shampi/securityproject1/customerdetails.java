package com.shampi.securityproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class customerdetails implements UserDetailsService {
    @Autowired
    private Repository repoo;

    public UserDetails loadUserByUsername(String users) throws UsernameNotFoundException {

        entities user = repoo.findByUser(users).orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return User.builder()
                .username(user.getUser())
                .password(user.getPassword()) // 🔑 fetched from DB
                .authorities(user.getRole())
                .build();


    }
}
