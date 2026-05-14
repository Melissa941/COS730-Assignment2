package cos730.assignment.submit_and_review.RequestRoutes.submissionRoutes.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionRequest {
    private String artefactName;
    private boolean introduction;
    private boolean literatureReview;
    private boolean conclusion;
    private boolean references;
}
