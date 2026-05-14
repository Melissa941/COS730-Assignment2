package cos730.assignment.submit_and_review.controller;

import cos730.assignment.submit_and_review.entity.Submission;
import cos730.assignment.submit_and_review.service.SubmissionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/submissions")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @PostMapping("/submit")
    public String submit(@RequestBody Submission submission){
        return submissionService.submitForReview(submission);
    }
}
