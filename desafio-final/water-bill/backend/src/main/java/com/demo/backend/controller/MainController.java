package com.demo.backend.controller;

import com.demo.backend.repository.AddressRepository;
import com.demo.backend.repository.BillRepository;
import com.demo.backend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/index")
public class MainController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private BillRepository billRepository;


}
