package org.datamapping.springdatajpamapping.dbrepository;

import org.datamapping.springdatajpamapping.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
