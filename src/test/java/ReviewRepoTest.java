import com.reviewsite.demo.Review;
import com.reviewsite.demo.ReviewRepository;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepoTest {

    private ReviewRepository repoTest;
    Review testReviewOne = new Review(1L, "This is an album review", "This is the first album",
            "testYear","testGenre","TestUrl",
            "This is a test album review");

    Review testReviewTwo = new Review(2L, "This is an album review", "This is the second album",
            "testYear","testGenre","TestUrl",
            "This is a test album review");

    @Test
    public void findingReviewOne(){
        repoTest = new ReviewRepository(testReviewOne);
        Review foundReview = repoTest.findReview(1L);
        assertEquals(foundReview, testReviewOne);
    }
    @Test
    public void findingCollectionOfReviews(){
        repoTest = new ReviewRepository(testReviewOne,testReviewTwo);
        Collection<Review> foundReviews = repoTest.findAll();
        assertThat(foundReviews).contains(testReviewOne,testReviewTwo);
    }
}
