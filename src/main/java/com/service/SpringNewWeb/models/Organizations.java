package com.service.SpringNewWeb.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Organizations {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    @Getter
    @Setter
    private Boolean albo, party, mdm, client, blocked_trade,
                    closed, died_liquid, no_active, visible_from_credit,
                    special_condition, work_by_client_bank,
                    electronic_banking_service, client_nrb,
                    symptom_migration, change_customer_account, black_list;

    @Getter
    @Setter
    private String segment, organization_id, type_client, short_name,
                   full_name, branch, account_name, emb_name, created_at,
                   updated_at, creator, code_word, place_birthday,
                   governing, egrul, phone, manager, manage_corp,
                   date_contragent, date_client, date_actualization,
                   white_list, country_registration, country_current,
                   state_registration_number, state_registration_date,
                   ifns_number, ifns_country, ifns_series_cert_reg,
                   ifns_number_cert_reg, phone_mobil, phone_operator,
                   email, date_change_resident, country_risk, country_internal_risk,
                   lang_document, country_location, code_okfs, code_okpf,
                   code_okpf_old, code_okved, code_okog, code_okato,
                   code_okpo, black_list_date, registration_tp_cms, reason_black_list_1,
                   reason_black_list_2, credit_rating, type_account_opics,
                   classify_account_opics, assignment_ogrn_series, assignment_ogrn_number,
                   code_tax_authority, date_beginning, registration_authority_1,
                   registration_authority_2, name_registration_authority,
                   code_registration_authority, state_place_registration,
                   full_name_client_open_account, position_client_open_account, code_ip;
}
