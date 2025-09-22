package org.example.uberreviewservice.Services;

import org.apache.catalina.Store;
import org.example.uberreviewservice.Repositories.ReviewRepository;
import org.example.uberreviewservice.Repositories.driverRepository;
import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Driver;
import org.example.uberreviewservice.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewServices implements CommandLineRunner {

    private final BookingRepository bookingRepository;


    private final driverRepository driverRepository;


    private ReviewRepository reviewRepository;

    public ReviewServices(ReviewRepository reviewRepository, BookingRepository bookingRepository, driverRepository driverRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
        this.driverRepository = driverRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("**************");
//
//        Review r=Review.builder()
//                .content("Amazing ride......")
//                .rating(5.0)
//                .build();  // create a  plain java object
//
//        Booking b=Booking
//                .builder()
//                .driverReview(r)
//                .endTime(new Date())
//                .build();
//
//        bookingRepository.save(b);
//
//        r.setCreatedAt( new Date() );
//        r.setUpdatedAt( new Date() );
//        System.out.println(r);
//        reviewRepository.save(r);  // this code executes sql queries
//        System.out.println(r.getId());
//
//        List<Review> reviews=reviewRepository.findAll();
//
//        for(Review review : reviews){
//            System.out.println(review.getContent());
//        }

//        List<Driver> drivers= driverRepository.findAll();

//        Optional<Driver> driver=driverRepository.findById(1L);
//        if(driver.isPresent()){
//            System.out.println(driver.get().getName());
//            List<Booking> b=driver.get().getBookings();
//
//
//            for(Booking booking:b){
//                System.out.println(booking.getId());
//            }

//        }
        Optional<Driver> d=driverRepository.findByIdAndLicenseNo(1L,"DL121112");
        System.out.println(d.get().getName());
    }
}
