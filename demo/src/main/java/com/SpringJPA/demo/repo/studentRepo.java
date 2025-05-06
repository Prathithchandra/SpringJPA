package com.SpringJPA.demo.repo;

import com.SpringJPA.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends JpaRepository<Student,Integer>
{

}
