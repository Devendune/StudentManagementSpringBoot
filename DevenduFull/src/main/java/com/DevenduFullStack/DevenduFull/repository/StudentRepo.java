package com.DevenduFullStack.DevenduFull.repository;

import com.DevenduFullStack.DevenduFull.modal.Student;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
