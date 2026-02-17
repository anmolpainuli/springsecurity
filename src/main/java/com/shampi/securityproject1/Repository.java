package com.shampi.securityproject1;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Repository extends CrudRepository<entities, String> {
    Optional<entities> findByUser(String user);
}
