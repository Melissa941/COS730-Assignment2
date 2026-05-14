package cos730.assignment.submit_and_review.service;

import cos730.assignment.submit_and_review.entity.Review;
import cos730.assignment.submit_and_review.entity.Reviewer;
import cos730.assignment.submit_and_review.entity.Submission;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewerService {

    public List<Review> review(Submission submission, List<Reviewer> reviewers){

        List<Review> reviews = new ArrayList<>();
        for (int i = 0; i < reviewers.size(); i++) {

            Review review = new Review();
            //TODO: assign review - add more conditions
            Reviewer reviewer = reviewers.get(i);
            if(reviewers.get(i).getAvailable() ){
                review.setScore(3);
                review.setSubmissionId(submission.getId());
            }
            reviews.add(review);
        }
        return reviews;
    }
}
