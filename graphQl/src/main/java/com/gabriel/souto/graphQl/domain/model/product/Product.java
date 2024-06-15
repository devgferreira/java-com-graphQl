package com.gabriel.souto.graphQl.domain.model.product;

import com.gabriel.souto.graphQl.domain.model.category.Category;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private BigDecimal price;
    @ManyToMany()
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Category category;
    @Column(name = "category_id")
    private Integer categoryId;

    public Product(String name, BigDecimal price, Integer categoryId) {
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }
}
