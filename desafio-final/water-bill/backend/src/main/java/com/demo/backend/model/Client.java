package com.demo.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @Column(name="cpf")
    private Integer cpf;

    @Column(name="name_first")
    private String firstName;

    @Column(name="name_last")
    private String lastName;

    public  Client() {}

    public Client(Integer cpf, String firstName, String lastName) {
        this.cpf = cpf;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
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

    @Override
    public String toString() {
        return "Client{" +
                "cpf=" + cpf +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
