package com.sda.j92.academy.repository;

import com.sda.j92.academy.model.AcademyTraining;
import com.sda.j92.academy.model.TrainingAttendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendeeRepository extends JpaRepository<TrainingAttendee, Long> {

    List<TrainingAttendee> findAllByTrainings(AcademyTraining training);
}
