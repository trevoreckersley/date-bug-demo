package com.example.datebugdemo.repository;

import com.example.datebugdemo.entity.EntityWithLocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityWithLocalDateTimeRepository extends JpaRepository<EntityWithLocalDateTime, Integer> {
}
