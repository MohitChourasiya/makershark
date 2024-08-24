package com.makershark.makershark.repo;

import com.makershark.makershark.entity.Supplier;
import com.makershark.makershark.payload.ManufacturingProcess;
import com.makershark.makershark.payload.NatureOfBusiness;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
            String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcess);
}