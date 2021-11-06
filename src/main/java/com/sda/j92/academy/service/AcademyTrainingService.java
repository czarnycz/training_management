package com.sda.j92.academy.service;

import com.sda.j92.academy.model.AcademyTraining;
import com.sda.j92.academy.model.TrainingAttendee;
import com.sda.j92.academy.model.TrainingDto;
import com.sda.j92.academy.repository.AcademyTrainingRepository;
import com.sda.j92.academy.repository.AttendeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class AcademyTrainingService {
    private final AcademyTrainingRepository academyTrainingRepository;
    private final AttendeeRepository attendeeRepository;

    public List<AcademyTraining> findAll() {
        List<AcademyTraining> trainings = academyTrainingRepository.findAll();
        log.info("GetAll : " + trainings);
        return trainings;
    }

    public void add(AcademyTraining training) {
        log.info("Add : " + training);
        academyTrainingRepository.save(training);
    }

    public TrainingDto getById(Long id) {
        Optional<AcademyTraining> academyTrainingOptional = academyTrainingRepository.findById(id);
        if (academyTrainingOptional.isPresent()) {
            AcademyTraining academyTraining = academyTrainingOptional.get();

            TrainingDto dto = TrainingDto.builder()
                    .id(academyTraining.getId())
                    .trainer(academyTraining.getTrainer())
                    .length(academyTraining.getLength())
                    .timeStart(academyTraining.getTimeStart())
                    .build();

            List<TrainingAttendee> attendees = attendeeRepository.findAllByTrainings(academyTraining);
            dto.setAttendees(new HashSet<>(attendees));
            return dto;
        }
        throw new EntityNotFoundException("Not found: " + id);
    }

    public void delete(Long id) {
        log.info("Get : " + id);
        academyTrainingRepository.deleteById(id);
    }
}
