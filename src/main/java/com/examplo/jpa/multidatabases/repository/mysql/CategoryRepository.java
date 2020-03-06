package com.examplo.jpa.multidatabases.repository.mysql;

import com.examplo.jpa.multidatabases.domain.mysql.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {


}
