package com.makershark.makershark.service;

import com.makershark.makershark.entity.Supplier;
import com.makershark.makershark.payload.ManufacturingProcess;
import com.makershark.makershark.payload.NatureOfBusiness;
import com.makershark.makershark.repo.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> searchSuppliers(String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcess, int limit) {
        List<Supplier> suppliers = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
                location, natureOfBusiness, manufacturingProcess);
        return suppliers;
    }
}
