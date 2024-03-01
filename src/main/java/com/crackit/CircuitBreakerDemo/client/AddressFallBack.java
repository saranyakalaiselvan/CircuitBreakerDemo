package com.crackit.CircuitBreakerDemo.client;

import com.crackit.CircuitBreakerDemo.dto.AddressDTO;
import org.springframework.stereotype.Component;

@Component
public class AddressFallBack implements AddressFeignClient{

    @Override
    public AddressDTO getAddress(Integer employeeId) {
        return null;
    }
}
