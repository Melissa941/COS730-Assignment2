package cos730.assignment.submit_and_review.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public String sendNotification(Boolean valid){
        if(valid){
            return "Submission Successful";
        }else{
            return "Submission Failed";
        }
    }
}
