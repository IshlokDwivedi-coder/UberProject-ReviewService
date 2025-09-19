package org.example.uberreviewservice.models;





//  Two ways to handle an enum :
//                   ---> first to store it into a number
//                   ----> Second way is to store it as a String


public enum BookingStatus {

    SCHEDULED,

    CANCELLED,

    CAB_ARRIVED,

    ASSIGNING_DRIVER,

    IN_RIDE,

    COMPLETED,
}
