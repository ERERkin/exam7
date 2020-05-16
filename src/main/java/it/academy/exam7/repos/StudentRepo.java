package it.academy.exam7.repos;

import it.academy.exam7.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {
    List<Student> getAllByName(String name);
}
