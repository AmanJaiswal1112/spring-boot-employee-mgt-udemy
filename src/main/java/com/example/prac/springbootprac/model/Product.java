package com.example.prac.springbootprac.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "product1")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product
{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "Product_Name")
    private String productName;

    @Column(name = "Company")
    private String company;

    @Column(name = "email")
    private String email;
}
