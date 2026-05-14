package cos730.assignment.submit_and_review.service;

import cos730.assignment.submit_and_review.entity.Review;
import cos730.assignment.submit_and_review.entity.Reviewer;
import cos730.assignment.submit_and_review.entity.Submission;
import cos730.assignment.submit_and_review.repository.ReviewRepository;
import cos730.assignment.submit_and_review.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionService {
    @Autowired private ValidationService validationService;
    @Autowired private ReviewerService reviewerService;
    @Autowired private ReviewerAssignmentService reviewerAssignmentService;
    @Autowired private FinalDecisionService finalDecisionService;
    @Autowired private NotificationService notificationService;
    @Autowired private SubmissionRepository submissionRepository;
    @Autowired private ReviewRepository reviewRepository;


    public String submitForReview(Submission submission){

        boolean valid = validationService.validate(submission);
        boolean reviewOutcome = false;
        if(valid) {
            List<Reviewer> reviewers = reviewerAssignmentService.assignReviewer();
            reviewOutcome = reviewerService.review(submission, reviewers);
        }

        String accepted = finalDecisionService.decide(valid, reviewOutcome);
        submissionRepository.save(submission);

       return accepted;
    }
}
