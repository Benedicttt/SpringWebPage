package com.service.SpringNewWeb.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Accounts implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    private Long id;
    private String account_number_full;
    private String type_account;
    private String currency;
    private String account_info;
    private String account_branch;
    private String account_suffix;
    private String balance_number;
    private String account_tariff;
    private String group;
    private String short_account_number;
    private String masked_account_number;
    private String created_at;
    private String updated_at;
    private String buh;

    public String getAccount_number_full() {
        return account_number_full;
    }

    public void setAccount_number_full(String account_number_full) {
        this.account_number_full = account_number_full;
    }

    public String getType_account() {
        return type_account;
    }

    public void setType_account(String type_account) {
        this.type_account = type_account;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccount_info() {
        return account_info;
    }

    public void setAccount_info(String account_info) {
        this.account_info = account_info;
    }

    public String getAccount_branch() {
        return account_branch;
    }

    public void setAccount_branch(String account_branch) {
        this.account_branch = account_branch;
    }

    public String getAccount_suffix() {
        return account_suffix;
    }

    public void setAccount_suffix(String account_suffix) {
        this.account_suffix = account_suffix;
    }

    public String getBalance_number() {
        return balance_number;
    }

    public void setBalance_number(String balance_number) {
        this.balance_number = balance_number;
    }

    public String getAccount_tariff() {
        return account_tariff;
    }

    public void setAccount_tariff(String account_tariff) {
        this.account_tariff = account_tariff;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getShort_account_number() {
        return short_account_number;
    }

    public void setShort_account_number(String short_account_number) {
        this.short_account_number = short_account_number;
    }

    public String getMasked_account_number() {
        return masked_account_number;
    }

    public void setMasked_account_number(String masked_account_number) {
        this.masked_account_number = masked_account_number;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getBuh() {
        return buh;
    }

    public void setBuh(String buh) {
        this.buh = buh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }
}
