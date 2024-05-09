package com.company.inventory.inventory.dao;

import org.springframework.data.repository.CrudRepository;
import com.company.inventory.inventory.model.Category;

public interface CategoryDao extends CrudRepository<Category, Long> {

}
