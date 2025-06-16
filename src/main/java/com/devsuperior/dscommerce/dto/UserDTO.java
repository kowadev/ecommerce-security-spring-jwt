package com.devsuperior.dscommerce.dto;


import com.devsuperior.dscommerce.entities.Role;
import com.devsuperior.dscommerce.entities.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;

    private List<String> roles = new ArrayList<>();

    public UserDTO(User user) {
        id = user.getId();
        email = user.getEmail();
        name = user.getName();
        for(GrantedAuthority role: user.getRoles()){
            roles.add(role.getAuthority());
        }

    }

    public Long getId() {
        return id;
    }

    public List<String> getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }


}
