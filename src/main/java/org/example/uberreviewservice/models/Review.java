package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookingReview")   // This annotation will affect on database only not affect on pojo
public class Review {

    @Id // This annotation make the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity means auto_Increment
    // by default primary key chahiye to @GeneratedValue(strategy = GenerationType.something jo tummhe chahiye lagate hain
    private Long id;

    @Column(nullable = false)
    private String content;


    private Double rating;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)  // this annotaion tells spring about the formats of Date object to be stored i.e. Date/Time ? Timestamp
    @CreatedDate    // This annotation tells spring only handle it for object creation
    private Date createdAt;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate   // This annotation tells spring only handle it for object update
    private Date updatedAt;

    @Override
    public String toString() {
        return "Review: "+this.content+" "+this.rating+" "+this.createdAt;
    }

}
