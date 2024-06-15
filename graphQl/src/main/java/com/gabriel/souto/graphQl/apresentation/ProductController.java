package com.gabriel.souto.graphQl.apresentation;

import com.gabriel.souto.graphQl.domain.model.product.Product;
import com.gabriel.souto.graphQl.domain.model.product.input.ProductInput;
import com.gabriel.souto.graphQl.domain.repositorys.IProductRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Iterator;
import java.util.List;

@Controller
public class ProductController {

    private final IProductRepository _productRepository;

    public ProductController(IProductRepository productRepository) {
        _productRepository = productRepository;
    }
    @MutationMapping
    Product addProduct(@Argument ProductInput productInput){
        return _productRepository.save(new Product(productInput.getName(),
                productInput.getPrice(), productInput.getCategoryId()));
    }
    @QueryMapping()
    List<Product> products(){
        return _productRepository.findAll();
    }
}
