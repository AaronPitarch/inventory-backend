package com.company.inventory.inventory.services;

import org.springframework.http.ResponseEntity;
import com.company.inventory.inventory.response.CategoryResponseRest;

public interface CategoryService {

    public ResponseEntity<CategoryResponseRest> search();

}
