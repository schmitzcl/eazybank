package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto CustomerDto
     * @return boolean indication if the update of the Account details was successful
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber String
     * @return boolean indication if the delete of the Account details was successful
     */
    boolean deleteAccount(String mobileNumber);

}
