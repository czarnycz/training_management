package com.sda.j92.carrentalbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AcademyTraining {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate timeStart;
    private int length;

    private String trainer;

    // trainings - nazwa pola w klasie TrainingAttendee
    //  podajemy ją żeby Hibernate "wiedział" że jest to wzajemna relacja
    @ManyToMany(mappedBy = "trainings", fetch = FetchType.LAZY)
    private Set<TrainingAttendee> attendees;
}
