package com.amyth.tasker.service;

import com.amyth.tasker.domain.Task;
import com.amyth.tasker.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TaskServiceImpl implements TaskService{


    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        if(task.getDueDate() == null ){
            task.setDueDate(LocalDate.of(2021,04,17));
        }
        return this.taskRepository.save(task);
    }
}
