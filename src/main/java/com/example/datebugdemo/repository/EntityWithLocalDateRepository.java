package com.example.datebugdemo.repository;

import com.example.datebugdemo.entity.EntityWithLocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityWithLocalDateRepository extends JpaRepository<EntityWithLocalDate, Integer> {
}
