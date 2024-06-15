package com.gabriel.souto.graphQl.apresentation;

import com.gabriel.souto.graphQl.domain.model.category.Category;
import com.gabriel.souto.graphQl.domain.model.category.request.CategoryInput;
import com.gabriel.souto.graphQl.domain.repositorys.ICategoryRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CategoryController {
    private final ICategoryRepository _categoryRepository;


    public CategoryController(ICategoryRepository categoryRepository) {
        _categoryRepository = categoryRepository;
    }
    @MutationMapping
    Category addCategory(@Argument CategoryInput categoryInput){
       return _categoryRepository.save(new Category(categoryInput.getName()));
    }
   @QueryMapping
    Optional<Category> categoryById(@Argument Integer id){
        return _categoryRepository.findById(id);
   }


}
