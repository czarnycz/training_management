package com.sda.j92.academy.model;

import lombok.*;

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
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<TrainingAttendee> attendees;
}
