package student.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @GetMapping("/email")
    public ResponseEntity<String> getStartBatch() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}
