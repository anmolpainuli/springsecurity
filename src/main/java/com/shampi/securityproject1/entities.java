package com.shampi.securityproject1;

import jakarta.persistence.*;

@Entity
@Table(name="db")
public class entities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String password;
    private String role;

    public entities() {

    }
    public Long getId () {
        return id;
    }
    public void setId (Long id) {
        this.id = id;
    }
    public String getUser () {
        return user;

    }
    public void setUser (String user) {
        this.user = user;

    }
    public String getPassword () {
        return password;
    }
    public void setPassword (String password) {
        this.password = password;
    }
    public String getRole () {
        return role;
    }
    public String setRole(String role) {
        this.role = role;
        return this.role;
    }


}
