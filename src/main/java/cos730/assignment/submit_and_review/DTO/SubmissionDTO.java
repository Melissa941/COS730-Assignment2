package cos730.assignment.submit_and_review.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionDTO {
    private String researcherName;
    private boolean introduction;
    private boolean literatureReview;
    private boolean conclusion;
    private boolean references;
}
