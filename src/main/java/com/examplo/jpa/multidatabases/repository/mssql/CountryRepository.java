package com.examplo.jpa.multidatabases.repository.mssql;

import com.examplo.jpa.multidatabases.domain.mssql.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {


}
