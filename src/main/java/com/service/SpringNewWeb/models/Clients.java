package com.service.SpringNewWeb.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Clients {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Organizations organization;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Supports support;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "client_id")
    private List<Accounts> accounts =new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "client_id")
    private List<InfoDuls> infoDuls =new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "client_id")
    private List<Cards> cards =new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "client_id")
    private List<ComplianceClients> compliance_clients =new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "client_id")
    private List<Comments> comments =new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    private Long   id;

    private Long   re_creation;
    private String type_client, first_name, middle_name, last_name, full_name, short_name, transliterated_name, creator, created_at, updated_at;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getRe_creation() { return re_creation; }

    public void setRe_creation(Long re_creation) {
        this.re_creation = re_creation;
    }

    public String getType_client() {
        return type_client;
    }

    public void setType_client(String type_client) {
        this.type_client = type_client;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() { return middle_name; }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getTransliterated_name() {
        return transliterated_name;
    }

    public void setTransliterated_name(String transliterated_name) {
        this.transliterated_name = transliterated_name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreated_at() { return created_at; }

    public void setCreated_at(String created_at) { this.created_at = created_at; }

    public String getUpdate_at() { return updated_at; }

    public void setUpdate_at(String update_at) { this.updated_at = update_at; }

    public Organizations getOrganization() {
        return organization;
    }

    public void setOrganization(Organizations organization) {
        this.organization = organization;
    }

    public Supports getSupport() {
        return support;
    }

    public void setSupport(Supports support) {
        this.support = support;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long clinet_id) {
        this.client_id = client_id;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    public List<InfoDuls> getInfoDuls() {
        return infoDuls;
    }

    public void setInfoDuls(List<InfoDuls> infoDuls) {
        this.infoDuls = infoDuls;
    }

    public List<Cards> getCards() {
        return cards;
    }

    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public List<ComplianceClients> getCompliance_clients() {
        return compliance_clients;
    }

    public void setCompliance_clients(List<ComplianceClients> compliance_clients) {
        this.compliance_clients = compliance_clients;
    }
}
