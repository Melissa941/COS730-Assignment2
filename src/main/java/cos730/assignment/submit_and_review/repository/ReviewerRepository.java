package cos730.assignment.submit_and_review.repository;

import cos730.assignment.submit_and_review.entity.Reviewer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewerRepository extends JpaRepository<Reviewer,Long> {
}
