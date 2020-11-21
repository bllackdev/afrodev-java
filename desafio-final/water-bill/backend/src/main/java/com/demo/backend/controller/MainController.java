package com.demo.backend.controller;

/**
 * @Author Raphael.Renato
 */

import com.demo.backend.model.Address;
import com.demo.backend.model.Bill;
import com.demo.backend.model.Client;
import com.demo.backend.repository.AddressRepository;
import com.demo.backend.repository.BillRepository;
import com.demo.backend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/index")
public class MainController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private BillRepository billRepository;

    // Metódos Bill
    @GetMapping(path = "/bill/all")
    public @ResponseBody Iterable<Bill> getAllBill() {
        return billRepository.findAll();
    }

    @PostMapping(path = "/bill/add")
    public @ResponseBody String addNewBill (@RequestParam String cpfClient,
                                            @RequestParam String month,
                                            @RequestParam Double readingOld,
                                            @RequestParam Double  readingNew) {
        Bill b = new Bill();
        b.setCpfClient(cpfClient);
        b.setMonth(month);
        b.getReadingOld(readingOld);
        b.setReadingNew(readingNew);
        b.setConsume(b.getConsume());
        billRepository.save(b);
        return "Saved!!!";
    }

    @PutMapping("/bill/update")
    public @ResponseBody String updateBill(@RequestParam Integer numBill, @RequestParam Double readingNew) {
        Optional<Bill> foundBill = billRepository.findById(numBill);
        if (!foundBill.isPresent())
                throw new IllegalArgumentException();
        Bill bill = foundBill.get();
        bill.setReadingNew(readingNew);
        billRepository.save(bill);
        return "Updated!!!";
    }

    @DeleteMapping(path = "/bill/remove")
    public @ResponseBody String removeOneBill(@RequestParam Integer numBill) {
        billRepository.deleteById(numBill);
        return "Deleted!!!";
    }

    // Métodos Client
    @GetMapping(path = "/client/all")
    public @ResponseBody Iterable<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @PostMapping(path = "/client/add")
    public @ResponseBody String addNewClient (@RequestParam String cpfClient,
                                              @RequestParam String firstName,@RequestParam String lastName) {
        Client c = new Client();
        c.setCpf(cpfClient);
        c.setFirstName(firstName);
        c.setLastName(lastName);
        clientRepository.save(c);
        return "Saved!!!";
    }

    @PutMapping("/client/update")
    public @ResponseBody String updateClient(@RequestParam String cpfClient,
                                             @RequestParam String firstName,@RequestParam String lastName) {
        Optional<Client> foundClient = clientRepository.findById(Integer.valueOf(cpfClient));
        if (!foundClient.isPresent())
            throw new IllegalArgumentException();
        Client client = foundClient.get();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        clientRepository.save(client);
        return "Updated!!!";
    }

    @DeleteMapping(path = "/client/remove")
    public @ResponseBody String removeOneClient(@RequestParam String cpfClient) {
        clientRepository.deleteById(Integer.valueOf(cpfClient));
        return "Deleted!!!";
    }

    // Métodos Address
    @GetMapping(path = "/address/all")
    public @ResponseBody Iterable<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @PostMapping(path = "/address/add")
    public @ResponseBody String addNewAddress (@RequestParam Integer idAddress,
                                               @RequestParam String street, @RequestParam String city,
                                               @RequestParam String state,  @RequestParam String cpfClient) {
        Address a = new Address();
        a.setIdAddress(idAddress);
        a.setStreet(street);
        a.setCity(city);
        a.setState(state);
        a.setCpfClient(cpfClient);
        addressRepository.save(a);
        return "Saved!!!";
    }

    @PutMapping("/address/update")
    public @ResponseBody String updateAddress (@RequestParam Integer idAddress,
                                               @RequestParam String street, @RequestParam String city,
                                               @RequestParam String state) {
        Optional<Address> foundAddress = addressRepository.findById(idAddress);
        if (!foundAddress.isPresent())
            throw new IllegalArgumentException();
        Address address = foundAddress.get();
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        addressRepository.save(address);
        return "Updated!!!";
    }

    @DeleteMapping(path = "/address/remove")
    public @ResponseBody String removeOneAddress(@RequestParam Integer idAddress) {
        addressRepository.deleteById(idAddress);
        return "Deleted!!!";
    }
}
