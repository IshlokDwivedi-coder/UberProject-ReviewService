package org.example.uberreviewservice.Services;

import org.example.uberreviewservice.Repositories.ReviewRepository;
import org.example.uberreviewservice.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewServices implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    public ReviewServices(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("**************");
        Review r=Review.builder()
                .content("Amazing ride......")
                .rating(5.0)
                .build();  // create a  plain java object

        r.setCreatedAt( new Date() );
        r.setUpdatedAt( new Date() );
        System.out.println(r);
        reviewRepository.save(r);  // this code executes sql queries
        System.out.println(r.getId());

        List<Review> reviews=reviewRepository.findAll();

        for(Review review : reviews){
            System.out.println(review.getContent());
        }
    }
}
