package com.service.SpringNewWeb.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Supports {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    @Getter
    @Setter
    private String  inn, kpp, created_at, updated_at, ogrn, date_ogrn;
}
