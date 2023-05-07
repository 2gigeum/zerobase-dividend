package com.example.dividend.persist_entity;

import com.example.dividend.persist_entity.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity,Long> {
        boolean existsByTicker(String ticker);
}
