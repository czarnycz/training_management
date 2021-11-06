package com.sda.j92.academy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrainingDto {
    private Long id;

    private String name;
    private LocalDate timeStart;
    private int length;

    private String trainer;
    private Set<TrainingAttendee> attendees;
}
