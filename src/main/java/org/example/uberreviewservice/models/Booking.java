package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Enumeration;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{


    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Review driverReview; //we have defined a 1:1 relationships betwwen booking and review

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private Long TotalDistance;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    private Passsenger passsenger;

}
