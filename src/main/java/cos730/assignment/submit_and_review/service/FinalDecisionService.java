package cos730.assignment.submit_and_review.service;

import org.springframework.stereotype.Service;


@Service
public class FinalDecisionService {

    public String decide(boolean valid, boolean reviewOutcome){

        if(!valid){
            return "Submission Rejected";
        }
        if(reviewOutcome){
            return "Submission Accepted";
        }else{
            return "Submission Rejected";
        }
    }

}
