package com.waterbill.backend.controller;

import com.waterbill.backend.model.Bill;
import com.waterbill.backend.model.Client;
import com.waterbill.backend.repository.BillRepository;
import com.waterbill.backend.repository.ClientRepository;
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
}
