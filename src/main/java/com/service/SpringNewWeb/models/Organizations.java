package com.service.SpringNewWeb.models;

import javax.persistence.*;

@Entity
public class Organizations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    private String segment;
    private String organization_id;
    private String type_client;
    private String short_name;
    private String full_name;
    private String branch;
    private String account_name;
    private String emb_name;
    private String created_at;
    private String updated_at;
    private String creator;
    private String code_word;
    private Boolean albo;
    private Boolean party;
    private String governing;
    private String egrul;
    private String phone;
    private String manager;
    private String manage_corp;
    private String date_contragent;
    private String date_client;
    private String date_actualization;
    private String white_list;
    private String country_registration;
    private String country_current;
    private Boolean mdm;
    private Boolean client;
    private String place_birthday;
    private String state_registration_number;
    private String state_registration_date;
    private String ifns_number;
    private String ifns_country;
    private String ifns_series_cert_reg;
    private String ifns_number_cert_reg;
    private String phone_mobil;
    private String phone_operator;
    private String email;
    private String date_change_resident;
    private String country_risk;
    private String country_internal_risk;
    private String lang_document;
    private String country_location;
    private String code_okfs;
    private String code_okpf;
    private String code_okpf_old;
    private String code_okved;
    private String code_okog;
    private String code_okato;
    private String code_okpo;
    private Boolean blocked_trade;
    private Boolean closed;
    private Boolean died_liquid;
    private Boolean no_active;
    private Boolean visible_from_credit;
    private Boolean special_condition;
    private Boolean work_by_client_bank;
    private Boolean electronic_banking_service;
    private String registration_tp_cms;
    private Boolean client_nrb;
    private Boolean black_list;
    private String black_list_date;
    private String reason_black_list_1;
    private String reason_black_list_2;
    private String credit_rating;
    private String type_account_opics;
    private String classify_account_opics;
    private Boolean change_customer_account;
    private String assignment_ogrn_series;
    private String assignment_ogrn_number;
    private String code_tax_authority;
    private Boolean symptom_migration;
    private String date_beginning;
    private String registration_authority_1;
    private String registration_authority_2;
    private String name_registration_authority;
    private String code_registration_authority;
    private String state_place_registration;
    private String full_name_client_open_account;
    private String position_client_open_account;
    private String code_ip;

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(String organization_id) {
        this.organization_id = organization_id;
    }

    public String getType_client() {
        return type_client;
    }

    public void setType_client(String type_client) {
        this.type_client = type_client;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getEmb_name() {
        return emb_name;
    }

    public void setEmb_name(String emb_name) {
        this.emb_name = emb_name;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCode_word() {
        return code_word;
    }

    public void setCode_word(String code_word) {
        this.code_word = code_word;
    }

    public Boolean getAlbo() {
        return albo;
    }

    public void setAlbo(Boolean albo) {
        this.albo = albo;
    }

    public Boolean getParty() {
        return party;
    }

    public void setParty(Boolean party) {
        this.party = party;
    }

    public String getGoverning() {
        return governing;
    }

    public void setGoverning(String governing) {
        this.governing = governing;
    }

    public String getEgrul() {
        return egrul;
    }

    public void setEgrul(String egrul) {
        this.egrul = egrul;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManage_corp() {
        return manage_corp;
    }

    public void setManage_corp(String manage_corp) {
        this.manage_corp = manage_corp;
    }

    public String getDate_contragent() {
        return date_contragent;
    }

    public void setDate_contragent(String date_contragent) {
        this.date_contragent = date_contragent;
    }

    public String getDate_client() {
        return date_client;
    }

    public void setDate_client(String date_client) {
        this.date_client = date_client;
    }

    public String getDate_actualization() {
        return date_actualization;
    }

    public void setDate_actualization(String date_actualization) {
        this.date_actualization = date_actualization;
    }

    public String getWhite_list() {
        return white_list;
    }

    public void setWhite_list(String white_list) {
        this.white_list = white_list;
    }

    public String getCountry_registration() {
        return country_registration;
    }

    public void setCountry_registration(String country_registration) {
        this.country_registration = country_registration;
    }

    public String getCountry_current() {
        return country_current;
    }

    public void setCountry_current(String country_current) {
        this.country_current = country_current;
    }

    public Boolean getMdm() {
        return mdm;
    }

    public void setMdm(Boolean mdm) {
        this.mdm = mdm;
    }

    public Boolean getClient() {
        return client;
    }

    public void setClient(Boolean client) {
        this.client = client;
    }

    public String getPlace_birthday() {
        return place_birthday;
    }

    public void setPlace_birthday(String place_birthday) {
        this.place_birthday = place_birthday;
    }

    public String getState_registration_number() {
        return state_registration_number;
    }

    public void setState_registration_number(String state_registration_number) {
        this.state_registration_number = state_registration_number;
    }

    public String getState_registration_date() {
        return state_registration_date;
    }

    public void setState_registration_date(String state_registration_date) {
        this.state_registration_date = state_registration_date;
    }

    public String getIfns_number() {
        return ifns_number;
    }

    public void setIfns_number(String ifns_number) {
        this.ifns_number = ifns_number;
    }

    public String getIfns_country() {
        return ifns_country;
    }

    public void setIfns_country(String ifns_country) {
        this.ifns_country = ifns_country;
    }

    public String getIfns_series_cert_reg() {
        return ifns_series_cert_reg;
    }

    public void setIfns_series_cert_reg(String ifns_series_cert_reg) {
        this.ifns_series_cert_reg = ifns_series_cert_reg;
    }

    public String getIfns_number_cert_reg() {
        return ifns_number_cert_reg;
    }

    public void setIfns_number_cert_reg(String ifns_number_cert_reg) {
        this.ifns_number_cert_reg = ifns_number_cert_reg;
    }

    public String getPhone_mobil() {
        return phone_mobil;
    }

    public void setPhone_mobil(String phone_mobil) {
        this.phone_mobil = phone_mobil;
    }

    public String getPhone_operator() {
        return phone_operator;
    }

    public void setPhone_operator(String phone_operator) {
        this.phone_operator = phone_operator;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_change_resident() {
        return date_change_resident;
    }

    public void setDate_change_resident(String date_change_resident) {
        this.date_change_resident = date_change_resident;
    }

    public String getCountry_risk() {
        return country_risk;
    }

    public void setCountry_risk(String country_risk) {
        this.country_risk = country_risk;
    }

    public String getCountry_internal_risk() {
        return country_internal_risk;
    }

    public void setCountry_internal_risk(String country_internal_risk) {
        this.country_internal_risk = country_internal_risk;
    }

    public String getLang_document() {
        return lang_document;
    }

    public void setLang_document(String lang_document) {
        this.lang_document = lang_document;
    }

    public String getCountry_location() {
        return country_location;
    }

    public void setCountry_location(String country_location) {
        this.country_location = country_location;
    }

    public String getCode_okfs() {
        return code_okfs;
    }

    public void setCode_okfs(String code_okfs) {
        this.code_okfs = code_okfs;
    }

    public String getCode_okpf() {
        return code_okpf;
    }

    public void setCode_okpf(String code_okpf) {
        this.code_okpf = code_okpf;
    }

    public String getCode_okpf_old() {
        return code_okpf_old;
    }

    public void setCode_okpf_old(String code_okpf_old) {
        this.code_okpf_old = code_okpf_old;
    }

    public String getCode_okved() {
        return code_okved;
    }

    public void setCode_okved(String code_okved) {
        this.code_okved = code_okved;
    }

    public String getCode_okog() {
        return code_okog;
    }

    public void setCode_okog(String code_okog) {
        this.code_okog = code_okog;
    }

    public String getCode_okato() {
        return code_okato;
    }

    public void setCode_okato(String code_okato) {
        this.code_okato = code_okato;
    }

    public String getCode_okpo() {
        return code_okpo;
    }

    public void setCode_okpo(String code_okpo) {
        this.code_okpo = code_okpo;
    }

    public Boolean getBlocked_trade() {
        return blocked_trade;
    }

    public void setBlocked_trade(Boolean blocked_trade) {
        this.blocked_trade = blocked_trade;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean getDied_liquid() {
        return died_liquid;
    }

    public void setDied_liquid(Boolean died_liquid) {
        this.died_liquid = died_liquid;
    }

    public Boolean getNo_active() {
        return no_active;
    }

    public void setNo_active(Boolean no_active) {
        this.no_active = no_active;
    }

    public Boolean getVisible_from_credit() {
        return visible_from_credit;
    }

    public void setVisible_from_credit(Boolean visible_from_credit) {
        this.visible_from_credit = visible_from_credit;
    }

    public Boolean getSpecial_condition() {
        return special_condition;
    }

    public void setSpecial_condition(Boolean special_condition) {
        this.special_condition = special_condition;
    }

    public Boolean getWork_by_client_bank() {
        return work_by_client_bank;
    }

    public void setWork_by_client_bank(Boolean work_by_client_bank) {
        this.work_by_client_bank = work_by_client_bank;
    }

    public Boolean getElectronic_banking_service() {
        return electronic_banking_service;
    }

    public void setElectronic_banking_service(Boolean electronic_banking_service) {
        this.electronic_banking_service = electronic_banking_service;
    }

    public String getRegistration_tp_cms() {
        return registration_tp_cms;
    }

    public void setRegistration_tp_cms(String registration_tp_cms) {
        this.registration_tp_cms = registration_tp_cms;
    }

    public Boolean getClient_nrb() {
        return client_nrb;
    }

    public void setClient_nrb(Boolean client_nrb) {
        this.client_nrb = client_nrb;
    }

    public Boolean getBlack_list() {
        return black_list;
    }

    public void setBlack_list(Boolean black_list) {
        this.black_list = black_list;
    }

    public String getBlack_list_date() {
        return black_list_date;
    }

    public void setBlack_list_date(String black_list_date) {
        this.black_list_date = black_list_date;
    }

    public String getReason_black_list_1() {
        return reason_black_list_1;
    }

    public void setReason_black_list_1(String reason_black_list_1) {
        this.reason_black_list_1 = reason_black_list_1;
    }

    public String getReason_black_list_2() {
        return reason_black_list_2;
    }

    public void setReason_black_list_2(String reason_black_list_2) {
        this.reason_black_list_2 = reason_black_list_2;
    }

    public String getCredit_rating() {
        return credit_rating;
    }

    public void setCredit_rating(String credit_rating) {
        this.credit_rating = credit_rating;
    }

    public String getType_account_opics() {
        return type_account_opics;
    }

    public void setType_account_opics(String type_account_opics) {
        this.type_account_opics = type_account_opics;
    }

    public String getClassify_account_opics() {
        return classify_account_opics;
    }

    public void setClassify_account_opics(String classify_account_opics) {
        this.classify_account_opics = classify_account_opics;
    }

    public Boolean getChange_customer_account() {
        return change_customer_account;
    }

    public void setChange_customer_account(Boolean change_customer_account) {
        this.change_customer_account = change_customer_account;
    }

    public String getAssignment_ogrn_series() {
        return assignment_ogrn_series;
    }

    public void setAssignment_ogrn_series(String assignment_ogrn_series) {
        this.assignment_ogrn_series = assignment_ogrn_series;
    }

    public String getAssignment_ogrn_number() {
        return assignment_ogrn_number;
    }

    public void setAssignment_ogrn_number(String assignment_ogrn_number) {
        this.assignment_ogrn_number = assignment_ogrn_number;
    }

    public String getCode_tax_authority() {
        return code_tax_authority;
    }

    public void setCode_tax_authority(String code_tax_authority) {
        this.code_tax_authority = code_tax_authority;
    }

    public Boolean getSymptom_migration() {
        return symptom_migration;
    }

    public void setSymptom_migration(Boolean symptom_migration) {
        this.symptom_migration = symptom_migration;
    }

    public String getDate_beginning() {
        return date_beginning;
    }

    public void setDate_beginning(String date_beginning) {
        this.date_beginning = date_beginning;
    }

    public String getRegistration_authority_1() {
        return registration_authority_1;
    }

    public void setRegistration_authority_1(String registration_authority_1) {
        this.registration_authority_1 = registration_authority_1;
    }

    public String getRegistration_authority_2() {
        return registration_authority_2;
    }

    public void setRegistration_authority_2(String registration_authority_2) {
        this.registration_authority_2 = registration_authority_2;
    }

    public String getName_registration_authority() {
        return name_registration_authority;
    }

    public void setName_registration_authority(String name_registration_authority) {
        this.name_registration_authority = name_registration_authority;
    }

    public String getCode_registration_authority() {
        return code_registration_authority;
    }

    public void setCode_registration_authority(String code_registration_authority) {
        this.code_registration_authority = code_registration_authority;
    }

    public String getState_place_registration() {
        return state_place_registration;
    }

    public void setState_place_registration(String state_place_registration) {
        this.state_place_registration = state_place_registration;
    }

    public String getFull_name_client_open_account() {
        return full_name_client_open_account;
    }

    public void setFull_name_client_open_account(String full_name_client_open_account) {
        this.full_name_client_open_account = full_name_client_open_account;
    }

    public String getPosition_client_open_account() {
        return position_client_open_account;
    }

    public void setPosition_client_open_account(String position_client_open_account) {
        this.position_client_open_account = position_client_open_account;
    }

    public String getCode_ip() {
        return code_ip;
    }

    public void setCode_ip(String code_ip) {
        this.code_ip = code_ip;
    }

}
