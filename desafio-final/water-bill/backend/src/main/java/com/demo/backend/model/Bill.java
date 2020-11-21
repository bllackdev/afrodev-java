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
    private String cpfClient;

    @JoinColumn
    @Column(name = "address_fk")
    private Integer idAddress;

    @Column(name = "month")
    private String month;

    @Column(name = "reading_old")
    private Double readingOld;

    @Column(name = "reading_new")
    private Double readingNew;

    @Column(name = "consume")
    private Double consume;

    public Double getConsume() {
        return consume;
    }

    public void setConsume(Double consume) {
        this.consume = this.readingNew - this.readingOld;
    }

    public Integer getBill() {
        return idBill;
    }

    public void setBill(Integer bill) {
        this.idBill = bill;
    }

    public String getCpfClient() {
        return cpfClient;
    }

    public void setCpfClient(String cpfClient) {
        this.cpfClient = cpfClient;
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

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


}
