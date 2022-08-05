package com.proyecto.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String user;
    private String password;    
    private String token;
}
