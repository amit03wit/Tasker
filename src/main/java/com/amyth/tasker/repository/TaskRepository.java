package com.amyth.tasker.repository;

import com.amyth.tasker.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {


}
