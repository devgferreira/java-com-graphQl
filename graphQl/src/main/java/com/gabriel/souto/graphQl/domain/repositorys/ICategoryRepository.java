package com.gabriel.souto.graphQl.domain.repositorys;

import com.gabriel.souto.graphQl.domain.model.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
