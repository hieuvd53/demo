package hieuvd.demo.controller;

import hieuvd.demo.data.model.Task;
import hieuvd.demo.data.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TaskService taskService;


}
