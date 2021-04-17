package com.amyth.tasker.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Optional;

@Entity
@AllArgsConstructor
@Data
public class Task {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dueDate;

    private Boolean completed;

    public Task() {}
}
