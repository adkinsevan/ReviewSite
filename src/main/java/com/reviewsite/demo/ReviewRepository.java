package com.reviewsite.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review placeHolder1 = new Review(1L,"Place Holder","This is an album Review", "2020","genre");
        Review placeHolder2 = new Review(2L,"Place Holder","This is an album Review", "2020","genre");
        Review placeHolder3 = new Review(3L,"Place Holder","This is an album Review", "2020","genre");

        reviewList.put(placeHolder1.getId(),placeHolder1);
        reviewList.put(placeHolder2.getId(),placeHolder2);
        reviewList.put(placeHolder3.getId(),placeHolder3);
    }

    public ReviewRepository(Review ...reviewToAdd){
        for(Review review: reviewToAdd){
            reviewList.put(review.getId(),review);
        }
    }

    public Review findReview(long id) {
        return reviewList.get(id);
    }
    public Collection<Review> findAll(){
        return reviewList.values();
    }

}
