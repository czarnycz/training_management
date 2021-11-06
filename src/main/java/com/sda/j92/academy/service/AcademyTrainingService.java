package com.sda.j92.academy.service;

import com.sda.j92.academy.model.AcademyTraining;
import com.sda.j92.academy.repository.AcademyTrainingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AcademyTrainingService {
    private final AcademyTrainingRepository academyTrainingRepository;

    public List<AcademyTraining> findAll(){
        List<AcademyTraining> trainings = academyTrainingRepository.findAll();
        log.info("GetAll : " + trainings);
        return trainings;
    }

    public void add(AcademyTraining training){
        log.info("Add : " + training);
        academyTrainingRepository.save(training);
    }

    public void delete(Long id){
        log.info("Remove : " + id);
        academyTrainingRepository.deleteById(id);
    }
}
