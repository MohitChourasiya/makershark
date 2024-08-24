package com.makershark.makershark.entity;

import com.makershark.makershark.payload.ManufacturingProcess;
import com.makershark.makershark.payload.NatureOfBusiness;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private String companyName;
    private String website;
    private String location;

    @Enumerated(EnumType.STRING)
    private NatureOfBusiness natureOfBusiness;

    private String manufacturingProcesses;
}