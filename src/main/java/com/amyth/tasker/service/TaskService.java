package com.amyth.tasker.service;

import com.amyth.tasker.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);

}
