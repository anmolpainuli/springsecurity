package com.shampi.securityproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Servicess {


    @Autowired
    private Repository repo ;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public entities saves(entities user) {

        entities entity = new entities();
        entity.setUser(user.getUser());
        entity.setPassword(passwordEncoder.encode(user.getPassword()));
        entity.setRole(user.getRole());

        return repo.save(entity);
    }


}
