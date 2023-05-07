package com.example.dividend.persist_entity;

import com.example.dividend.persist_entity.entity.DividendEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DividendRepository extends JpaRepository<DividendEntity,Long> {


}
