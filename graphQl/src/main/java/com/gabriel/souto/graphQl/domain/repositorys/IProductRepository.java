package com.gabriel.souto.graphQl.domain.repositorys;

import com.gabriel.souto.graphQl.domain.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {
}
