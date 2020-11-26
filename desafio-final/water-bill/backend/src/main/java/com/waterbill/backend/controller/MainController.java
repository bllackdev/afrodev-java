package com.waterbill.backend.controller;

import com.waterbill.backend.model.Bill;
import com.waterbill.backend.model.Client;
import com.waterbill.backend.repository.BillRepository;
import com.waterbill.backend.repository.ClientRepository;
import org.hibernate.jdbc.Expectation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class MainController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private BillRepository billRepository;

    // Metódos Client
    @GetMapping(path = "/client/all")
    public List<Client> list() {
        return clientRepository.findAll();
    }

    @GetMapping(path = "/client/{idClient}")
    public ResponseEntity<Client> getClientById(@PathVariable Integer idClient) {
        Optional<Client> client = clientRepository.findById(idClient);
        try {
            return new ResponseEntity<>(client.get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/client/add")
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        try {
            Client _client = clientRepository
                    .save(new Client(client.getCpf(), client.getFirstName(), client.getLastName()));
            return new ResponseEntity<>(_client, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(path = "/client/update/{idClient}")
    public ResponseEntity<Client> updateClient(@PathVariable("idClient") Integer idClient, @RequestBody Client client) {
        Optional<Client> clientData = clientRepository.findById(idClient);
        if (clientData.isPresent()) {
            Client _client = clientData.get();
            _client.setCpf(client.getCpf());
            _client.setFirstName(client.getFirstName());
            _client.setLastName(client.getLastName());
            return new ResponseEntity<>(clientRepository.save(_client), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/client/remove/{idClient}")
    public ResponseEntity<HttpStatus> deleteClient(@PathVariable("idClient") Integer idClient) {
        try {
            clientRepository.deleteById(idClient);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(path = "/client/remove/all")
    public ResponseEntity<HttpStatus> deleteAllClient() {
        try {
            clientRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    // Metódos Bill
    @GetMapping(path = "/bill/all")
    public  List<Bill> listBill() {
        return billRepository.findAll();
    }

    @GetMapping(path = "/bill/{idBill}")
    public ResponseEntity<Bill> getBillById(@PathVariable Integer idBill) {
        Optional<Bill> bill = billRepository.findById(idBill);
        try {
            return new ResponseEntity<>(bill.get(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/bill/add")
    public ResponseEntity<Bill> createBill(@RequestBody Bill bill) {
        try {
            Bill _bill = billRepository
                    .save(new Bill(bill.getCpfClient(), bill.getReadingOld(), bill.getReadingNew(),
                            bill.getConsume(), bill.getMonth()));
            return new ResponseEntity<>(_bill, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(path = "/bill/update/{idBill}")
    public ResponseEntity<Bill> updateBill(@PathVariable("idBill") Integer idBill, @RequestBody Bill bill) {
        Optional<Bill> billData = billRepository.findById(idBill);
        if (billData.isPresent()) {
            Bill _bill = billData.get();
            _bill.setReadingNew(bill.getReadingNew());
            _bill.setMonth(bill.getMonth());
            return new ResponseEntity<>(billRepository.save(_bill), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/bill/remove/{idBill}")
    public ResponseEntity<HttpStatus> deleteBill(@PathVariable("idBill") Integer idBill) {
        try {
            billRepository.deleteById(idBill);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(path = "/bill/remove/all")
    public ResponseEntity<HttpStatus> deleteAllBill() {
        try {
            billRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
