package com.service.SpringNewWeb.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Accounts implements Serializable  {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String account_number_full, type_account, currency, account_info, account_branch, account_suffix, balance_number, account_tariff, group, short_account_number, masked_account_number, created_at, updated_at, buh;
}
