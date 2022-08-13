package com.bankapplication.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "CUSTOMER")

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    @OneToMany(cascade = CascadeType.ALL)
    private List<Account> accounts;
}
