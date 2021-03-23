package com.service.SpringNewWeb.models;

import javax.persistence.*;

@Entity
public class Supports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    private String  inn;
    private String  kpp;
    private String  created_at;
    private String  updated_at;
    private String  ogrn;
    private String  date_ogrn;


    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
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

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getDate_ogrn() {
        return date_ogrn;
    }

    public void setDate_ogrn(String date_ogrn) {
        this.date_ogrn = date_ogrn;
    }

}
