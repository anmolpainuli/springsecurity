package com.shampi.securityproject1;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;


@RestController
public class controller {

    @Autowired
    private Servicess nav;

    @GetMapping("/hi")
    public String hello ()
    {
        return "Hello World";
    }
    @GetMapping("/cs")
    public CsrfToken getToken (HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
  //  @PreAuthorize("hasRole('USER')")
    @GetMapping("/user1")
    public String hello1 ()
    {
        return "Hello World 1";
    }
    @GetMapping("/admin")
    public String hello2 ()
    {
        return "Hello World2";
    }

    @PostMapping("/register")
    public entities registration(@RequestBody entities user) {

        return nav.saves(user);
    }
}
