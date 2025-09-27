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
@Inheritance (strategy = InheritanceType.JOINED)
public class Review extends BaseModel{


    @Column(nullable = false)
    private String content;


    private Double rating;


    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Booking booking; // we have defined a 1:1 relationship between booking and review

    @Override
    public String toString() {
        return "Review: "+this.content+" "+this.rating+" "+this.createdAt;
    }

}
