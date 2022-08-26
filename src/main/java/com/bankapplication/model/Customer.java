package com.bankapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;


@Entity
@Table(name = "CUSTOMER")

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @NotBlank(message = "First name is mandatory")
    private String firstName;

    @Column
    @NotBlank(message = "Last name is mandatory")
    private String lastName;

    @Column
    @NotBlank(message = "Email is mandatory")
    @Email
    private String email;

    @Column
    @OneToMany(cascade = CascadeType.ALL)
    private List<Account> accounts;
}
