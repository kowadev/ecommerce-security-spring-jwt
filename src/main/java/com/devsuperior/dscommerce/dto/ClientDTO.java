package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;

public class ClientDTO {
    private Long id;
    private String name;

    public ClientDTO(){}

    public ClientDTO(User client){
        id = client.getId();
        name = client.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
