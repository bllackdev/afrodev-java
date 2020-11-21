package com.demo.backend.model;

import org.springframework.boot.autoconfigure.r2dbc.ConnectionFactoryBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Entity
public class Client {

    @Id
    @Column(name="cpf")
    private String cpf;

    @Column(name="name_first")
    private String firstName;

    @Column(name="name_last")
    private String lastName;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

}
