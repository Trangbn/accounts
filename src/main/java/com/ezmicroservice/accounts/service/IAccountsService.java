package com.ezmicroservice.accounts.service;

import com.ezmicroservice.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto
     */
    void  createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return CustomerDto
     */
    CustomerDto fetchAccount(String mobileNumber);
}
