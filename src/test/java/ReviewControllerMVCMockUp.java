import com.reviewsite.demo.Review;
import com.reviewsite.demo.ReviewController;
import com.reviewsite.demo.ReviewRepository;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.mockito.Mock;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ReviewController.class)
public class ReviewControllerMVCMockUp {


        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private ReviewRepository reviewRepository;

        @Mock
        private Review reviewOne;

        @Mock
        private Review reviewTwo;

        @Test
        public void shouldBeOKStatusForAllReviewsInModel() throws Exception{
            mockMvc.perform(get("/review")).andExpect(status().isOk())
                    .andExpect(view().name("reviewTemplate"));
        }



    }
