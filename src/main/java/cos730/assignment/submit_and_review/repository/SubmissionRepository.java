package cos730.assignment.submit_and_review.repository;

import cos730.assignment.submit_and_review.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionRepository extends JpaRepository<Submission,Long> {
}
