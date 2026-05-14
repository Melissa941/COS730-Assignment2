package cos730.assignment.submit_and_review.service;

import cos730.assignment.submit_and_review.entity.Reviewer;
import cos730.assignment.submit_and_review.repository.ReviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewerAssignmentService {

    @Autowired
    private ReviewerRepository reviewerRepository;

    public List<Reviewer> assignReviewer(){
        //get reviewer list for BD
        List<Reviewer> reviewerList = reviewerRepository.findAll();
        for (int i = 0; i < reviewerList.size(); i++) {
            Reviewer reviewer = reviewerList.get(i);
            if(!reviewer.getAvailable()){
                reviewerList.remove(i);
            }
        }

        //filtered reviewer list
        return reviewerList;
    }
}
