package com.example.experiment;

import com.example.experiment.entity.Exam;
import com.example.experiment.service.ExamService;
import com.example.experiment.service.UpdateUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExperimentApplicationTests {
    @Autowired
    private UpdateUserService updateUserService;
    @Autowired
    private ExamService examService;
    @Test
    public void contextLoads() {


        Exam exam = examService.getExamByClass("丹青302");
        System.out.println(exam.getId());
    }

}
