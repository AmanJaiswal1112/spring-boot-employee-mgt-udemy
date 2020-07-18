package com.example.prac.springbootprac.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee
{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "first_Name")
    private String firstName;

    @Column(name = "last_Name")
    private String last_Name;

    @Column(name = "email")
    private String email;
}
