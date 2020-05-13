package it.academy.exam7.repos;

import it.academy.exam7.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepo extends JpaRepository<Log, Long> {
}
