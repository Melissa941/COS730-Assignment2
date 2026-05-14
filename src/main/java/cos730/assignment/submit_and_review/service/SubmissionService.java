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
    @Autowired private EvaluationService evaluationService;
    @Autowired private NotificationService notificationService;
    @Autowired private SubmissionRepository submissionRepository;
    @Autowired private ReviewRepository reviewRepository;


    public String submitForReview(Submission submission){

        boolean valid = validationService.validate(submission);
        if(!valid){
            return "Invalid submission Format";
        }

        //save the submission data to DB
        Submission currSubmission = submissionRepository.save(submission);

        List<Reviewer> reviewers = reviewerAssignmentService.assignReviewer();
        List<Review> reviews = reviewerService.review(currSubmission,reviewers);

        boolean accepted = evaluationService.evaluate(reviews);
        //calling the notification service
        String notification = notificationService.sendNotification(accepted);

       return notification;
    }
}