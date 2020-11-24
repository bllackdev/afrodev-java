package com.demo.backend.model;

import javax.persistence.*;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_bill")
    private Integer idBill;

    @JoinColumn
    @Column(name = "cpf_client")
    private Integer cpfClient;

//    @JoinColumn
//    @Column(name = "address_fk")
//    private Integer idAddress;

    @Column(name = "month")
    private String month;

    @Column(name = "reading_old")
    private Double readingOld;

    @Column(name = "reading_new")
    private Double readingNew;

    @Column(name = "consume")
    private Double consume;

    public Bill() {}

    public Bill(Integer cpfClient, String month, Double readingOld, Double readingNew, Double consume) {
        this.cpfClient = cpfClient;
        this.month = month;
        this.readingOld = readingOld;
        this.readingNew = readingNew;
        this.consume = consume;
    }

    public Integer getIdBill() {
        return idBill;
    }

    public void setIdBill(Integer idBill) {
        this.idBill = idBill;
    }

    public Integer getCpfClient() {
        return cpfClient;
    }

    public void setCpfClient(Integer cpfClient) {
        this.cpfClient = cpfClient;
    }

//    public Integer getIdAddress() {
//        return idAddress;
//    }
//
//    public void setIdAddress(Integer idAddress) {
//        this.idAddress = idAddress;
//    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getReadingOld(Double readingOld) {
        return this.readingOld;
    }

    public void setReadingOld(Double readingOld) {
        this.readingOld = readingOld;
    }

    public Double getReadingNew() {
        return readingNew;
    }

    public void setReadingNew(Double readingNew) {
        this.readingNew = readingNew;
    }

    public Double getConsume() {
        return consume;
    }

    public void setConsume(Double consume) {
        this.consume = consume;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "idBill=" + idBill +
                ", cpfClient='" + cpfClient + '\'' +
                ", month='" + month + '\'' +
                ", readingOld=" + readingOld +
                ", readingNew=" + readingNew +
                ", consume=" + consume +
                '}';
    }
}
