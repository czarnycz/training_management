package com.sda.j92.academy.controller;

import com.sda.j92.academy.model.AcademyTraining;
import com.sda.j92.academy.service.AcademyTrainingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/trainings")
@RequiredArgsConstructor
public class AcademyTrainingController {
    private final AcademyTrainingService academyTrainingService;

    @CrossOrigin()
    @GetMapping("")
    public List<AcademyTraining> get(){
        return academyTrainingService.findAll();
    }

    @CrossOrigin()
    @PostMapping("")
    public void add(@RequestBody AcademyTraining training){
        academyTrainingService.add(training);
    }

    @CrossOrigin()
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        academyTrainingService.delete(id);
    }

}
