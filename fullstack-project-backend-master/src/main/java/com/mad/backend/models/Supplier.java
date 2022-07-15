package com.mad.backend.models;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Created by alex on 2/25/17.
 */
@Entity
public class Supplier {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(nullable = false)
    private Integer id;

    @Column(nullable = false) @Pattern(regexp = "^[!-~][ -~]{8,253}[!-~]$")
    private String name;

    @Column(nullable = false) @Pattern(regexp = "^[!-~][ -~]{8,253}[!-~]$")
    private String address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
    private List<Product> products;

    public Supplier() {
        // JPA constructor
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
