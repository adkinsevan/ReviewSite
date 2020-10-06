package com.reviewsite.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepository;

    @RequestMapping("/reviews")
    public String findAllReviews(Model model) {
        model.addAttribute("reviewsModel", reviewRepository.findAll());
        return "reviewsTemplate";
    }

    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value = "id") long id, Model model) throws ReviewNotFoundException {

        if (reviewRepository.findReview(id) == null) {
            throw new ReviewNotFoundException();
        }

        model.addAttribute("reviewModel", reviewRepository.findReview(id));
        return "reviewTemplate";
    }
}