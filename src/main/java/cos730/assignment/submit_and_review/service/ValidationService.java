package cos730.assignment.submit_and_review.service;

import cos730.assignment.submit_and_review.RequestRoutes.ValidationRoutes.response.ValidationResponse;
import cos730.assignment.submit_and_review.entity.Submission;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    public boolean validate(Submission submission) {
        ValidationResponse validationResponse = new ValidationResponse();
        validationResponse.setValidFormat(false);
        //Checking all the validations/requirements for the submissions
        if(submission.isIntroduction() && submission.isLiteratureReview() &&
                submission.isConclusion()){
            validationResponse.setValidFormat(true);
        }else{
            //invalid format exception
            validationResponse.setValidFormat(false);
        }
        return validationResponse.getValidFormat();
    }
}
