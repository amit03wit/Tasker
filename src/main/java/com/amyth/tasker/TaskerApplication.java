package com.amyth.tasker;

import com.amyth.tasker.domain.Task;
import com.amyth.tasker.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.smartcardio.CommandAPDU;
import java.time.LocalDate;

@SpringBootApplication
public class TaskerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskerApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
           taskService.save(new Task(1L,"Create Openshift Project", LocalDate.now(),true));
           taskService.save(new Task(2L,"Create TC Agent", LocalDate.now(),false));
           taskService.save(new Task(3L,"Create Runitime Build", LocalDate.now(),false));
           taskService.save(new Task(4L,"Create Docker image", LocalDate.now(),false));
           taskService.save(new Task(5L,"Create Deployment Config", LocalDate.now(),false));
           taskService.save(new Task(6L,"Create Secrets", LocalDate.now(),false));
           taskService.save(new Task(7L,"Deploy App", LocalDate.now(),false));
        };
    }

}
