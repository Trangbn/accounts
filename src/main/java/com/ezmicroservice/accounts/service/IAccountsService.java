package com.ezmicroservice.accounts.service;

import com.ezmicroservice.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto
     */
    void  createAccount(CustomerDto customerDto);
}
