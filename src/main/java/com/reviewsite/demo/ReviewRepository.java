package com.reviewsite.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

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
