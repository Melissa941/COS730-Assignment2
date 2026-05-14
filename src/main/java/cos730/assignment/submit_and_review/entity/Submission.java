package cos730.assignment.submit_and_review.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "submissions")
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "artefact_name")
    private String artefactName;

    @Column(name = "introduction")
    private boolean introduction;

    @Column(name = "literature_review")
    private boolean literatureReview;

    @Column(name = "conclusion")
    private boolean conclusion;

    @Column(name = "references")
    private boolean references;

    @Column(name = "reviewer_name")
    private String reviewerName;

    @Column(name = "evaluation_score")
    private Integer evaluationScore;

    @Column(name = "evaluation_result")
    private String evaluationResult;

    @Column(name = "final_outcome")
    private String finalOutcome;
}
