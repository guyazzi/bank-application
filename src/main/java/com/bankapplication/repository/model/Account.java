package com.bankapplication.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    private long id;

    @Column
    private String type;

    @Column
    private String currency;

    @Column
    private double balance;


}
