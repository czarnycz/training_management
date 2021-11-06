package com.sda.j92.carrentalbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sda.j92.carrentalbackend.model.AcademyTraining;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademyTrainingRepository extends JpaRepository<AcademyTraining, Long> {
}
