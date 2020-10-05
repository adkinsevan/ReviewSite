package com.reviewsite.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(ReiewController.class)
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
            mockMvc.perform()
        }



    }
