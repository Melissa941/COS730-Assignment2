package cos730.assignment.submit_and_review.service;

import cos730.assignment.submit_and_review.entity.Review;
import cos730.assignment.submit_and_review.entity.Reviewer;
import cos730.assignment.submit_and_review.entity.Submission;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewerService {

    public Boolean review(Submission submission, List<Reviewer> reviewers){

        List<Review> reviews = new ArrayList<>();
        for (int i = 0; i < reviewers.size(); i++) {

            Review review = new Review();
            Reviewer reviewer = reviewers.get(i);
            if(reviewers.get(i).getAvailable() ){
                review.setScore(3);
                review.setSubmissionId(submission.getId());
            }
            reviews.add(review);
        }

        var sum = 0;
        for (int i = 0; i < reviews.size(); i++) {
            Review reviewer = reviews.get(i);
            sum = sum + reviews.get(i).getScore();
        }
        Integer average = sum/reviews.size();

        return average >= 3;
    }
}
