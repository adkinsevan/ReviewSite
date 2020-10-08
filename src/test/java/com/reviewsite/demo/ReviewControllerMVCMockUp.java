package com.reviewsite.demo;

import com.reviewsite.demo.Review;
import com.reviewsite.demo.ReviewController;
import com.reviewsite.demo.ReviewRepository;


import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.mockito.Mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



@WebMvcTest(ReviewController.class)
public class ReviewControllerMVCMockUp {

        @Autowired
        MockMvc mockMvc;

        @MockBean
        private ReviewRepository reviewRepository;

        @Mock
        private Review reviewOne;

        @Mock
        private Review reviewTwo;

        @Test
        public void shouldBeOKStatusForAllReviewsInModel() throws Exception{
            mockMvc.perform(get("/reviews")).andExpect(status().isOk())
                    .andExpect(view().name("reviewsTemplate"));
        }
        @Test
        public void shouldFindAllReviewsInModel() throws Exception{
                Collection<Review> allReviewsInModel = Arrays.asList(reviewOne,reviewTwo);
                when(reviewRepository.findAll()).thenReturn(allReviewsInModel);
                mockMvc.perform(get("/reviews"))
                        .andExpect(model().attribute("reviewsModel", allReviewsInModel));
        }
        @Test
        public void shouldBeOkForOneReviewInTemplate() throws Exception{
                Long reviewOneId = 1L;
                when(reviewRepository.findReview(reviewOneId)).thenReturn(reviewOne);
                mockMvc.perform(get("/review?id=1")).andExpect(status().isOk())
                        .andExpect(view().name("reviewTemplate"));
        }
        @Test
        public void shouldFindOneReviewInTemplate() throws Exception{
                Long reviewOneId = 1L;
                when(reviewRepository.findReview(reviewOneId)).thenReturn(reviewOne);
                mockMvc.perform(get("/review?id=1")).andExpect(status().isOk())
                        .andExpect(model().attribute("reviewModel", reviewOne));
        }
        @Test
        public void shouldNotBeFoundForNoRequestInModel() throws Exception{
                Long reviewTwoId = 2L;
                when(reviewRepository.findReview(reviewTwoId)).thenReturn(reviewTwo);
                mockMvc.perform(get("/review?id=3")).andExpect(status().isNotFound());
        }



    }
