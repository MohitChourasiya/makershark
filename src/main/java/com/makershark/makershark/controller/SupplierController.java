package com.makershark.makershark.controller;

import com.makershark.makershark.dto.SupplierSearchRequest;
import com.makershark.makershark.entity.Supplier;
import com.makershark.makershark.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/search")
    public List<Supplier> querySuppliers(@RequestBody SupplierSearchRequest request) {
        return supplierService.searchSuppliers(
                request.getLocation(),
                request.getNatureOfBusiness(),
                request.getManufacturingProcess(),
                request.getLimit()
        );
    }
}