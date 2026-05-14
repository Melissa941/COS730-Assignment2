package cos730.assignment.submit_and_review.repository;

import cos730.assignment.submit_and_review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
