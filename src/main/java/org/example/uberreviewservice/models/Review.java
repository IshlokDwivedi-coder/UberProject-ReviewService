package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "bookingReview")   // This annotation will affect on database only not affect on pojo
public class Review {

    @Id // This annotation make the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity means auto_Increment
    // by default primary key chahiye to @GeneratedValue(strategy = GenerationType.something jo tummhe chahiye lagate hain
    Long id;

    @Column(nullable = false)
    String content;
    Double rating;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)  // this annotaion tells spring about the formats of Date object to be stored i.e. Date/Time ? Timestamp
    @CreatedDate    // This annotation tells spring only handle it for object creation
    Date createdAt;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate   // This annotation tells spring only handle it for object update
    Date updatedAt;

}
