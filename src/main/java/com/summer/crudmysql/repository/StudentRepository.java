package com.summer.crudmysql.repository;

import com.summer.crudmysql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
