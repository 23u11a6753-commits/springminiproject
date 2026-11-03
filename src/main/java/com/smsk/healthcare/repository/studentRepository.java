package com.smsk.healthcare.repository;

import com.smsk.healthcare.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<student,Long > {
}
