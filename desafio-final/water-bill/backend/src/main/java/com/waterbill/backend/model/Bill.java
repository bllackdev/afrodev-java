package com.waterbill.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_bill")
    private Integer idBill;

    @JoinColumn
    @Column(name = "cpf_client")
    private String cpfClient;

    @Column(name = "reading_old")
    private Double readingOld;

    @Column(name = "reading_new")
    private Double readingNew;

    @Column(name = "consume")
    private Double consume;

    @Column(name = "month")
    private String month;

    public Bill() {}

    public Bill(String cpfClient, Double readingOld, Double readingNew, Double consume, String month) {
        this.cpfClient = cpfClient;
        this.readingOld = readingOld;
        this.readingNew = readingNew;
        this.consume = consume;
        this.month = month;
    }

    public Integer getIdBill() {
        return idBill;
    }

    public void setIdBill(Integer idBill) {
        this.idBill = idBill;
    }

    public String getCpfClient() {
        return cpfClient;
    }

    public void setCpfClient(String cpfClient) {
        this.cpfClient = cpfClient;
    }

    public Double getReadingOld() {
        return readingOld;
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

    public Double setConsume(Double readingOld, Double readingNew) {

        this.consume = readingNew - readingOld;
        return consume;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "idBill=" + idBill +
                ", cpfClient='" + cpfClient + '\'' +
                ", readingOld=" + readingOld +
                ", readingNew=" + readingNew +
                ", consume=" + consume +
                ", month='" + month + '\'' +
                '}';
    }
}
