package cos730.assignment.submit_and_review.service;

import cos730.assignment.submit_and_review.entity.Review;
import cos730.assignment.submit_and_review.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluationService {

    @Autowired
    private ReviewRepository reviewRepository;

    public boolean evaluate(List<Review> reviews){
        //saving multiple reviews
        reviewRepository.saveAll(reviews);

        //TODO: calculate average
        var sum = 0;
        for (int i = 0; i < reviews.size(); i++) {
            Review reviewer = reviews.get(i);
            sum = sum + reviews.get(i).getScore();
        }
        var average = sum%reviews.size();

        return average >= 3;
    }

}
