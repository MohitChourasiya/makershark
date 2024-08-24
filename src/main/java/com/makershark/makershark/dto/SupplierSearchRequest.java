package com.makershark.makershark.dto;

import com.makershark.makershark.payload.ManufacturingProcess;
import com.makershark.makershark.payload.NatureOfBusiness;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SupplierSearchRequest {
    private String location;
    private NatureOfBusiness natureOfBusiness;
    private ManufacturingProcess manufacturingProcess;
    private int limit;
}
