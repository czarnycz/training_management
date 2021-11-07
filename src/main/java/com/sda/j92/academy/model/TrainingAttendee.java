package com.sda.j92.academy.model;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TrainingAttendee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;

    private String pesel;
    private String email;
    private String address;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany(mappedBy = "attendees", fetch = FetchType.LAZY)
    private Set<AcademyTraining> trainings;
}
