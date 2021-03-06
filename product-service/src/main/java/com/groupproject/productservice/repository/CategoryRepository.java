package com.groupproject.productservice.repository;

import com.groupproject.productservice.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
