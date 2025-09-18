package org.example.uberreviewservice.Repositories;


import org.example.uberreviewservice.models.Review;
import org.springframework.boot.CommandLineRunner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//public class ReviewRepository implements CommandLineRunner {
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.print("***************************");
//        Review r=Review
//                .builder()
//                .content("Amazing ride quality")
//                .rating(5.0)
//                .build();
//    }

@Repository
public  interface ReviewRepository  extends JpaRepository<Review,Long> {

    // Repository is used for communicating to the database and execute queries
}




