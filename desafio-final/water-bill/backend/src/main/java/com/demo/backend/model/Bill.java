package com.demo.backend.model;

import javax.persistence.*;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill")
    private Integer bill;

    @JoinColumn
    @Column(name = "cpf_client")
    private Integer cpf_client;

    @JoinColumn
    @Column(name = "id_address")
    private Integer id_address;

    @Column(name = "month")
    private String month;

    @Column(name = "reading_old")
    private Double reading_old;

    @Column(name = "reading_new")
    private Double reading_new;

    public Integer getBill() {
        return bill;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }

    public Integer getCpf_client() {
        return cpf_client;
    }

    public void setCpf_client(Integer cpf_client) {
        this.cpf_client = cpf_client;
    }

    public Integer getId_address() {
        return id_address;
    }

    public void setId_address(Integer id_address) {
        this.id_address = id_address;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getReading_old() {
        return reading_old;
    }

    public void setReading_old(Double reading_old) {
        this.reading_old = reading_old;
    }

    public Double getReading_new() {
        return reading_new;
    }

    public void setReading_new(Double reading_new) {
        this.reading_new = reading_new;
    }
}
