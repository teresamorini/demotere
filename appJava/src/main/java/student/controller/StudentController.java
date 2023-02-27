package student.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<String> retrieveAllStudents() {
        return Arrays.asList("Teresa", "Marco");
    }

    
}