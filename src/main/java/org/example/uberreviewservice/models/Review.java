package org.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Review {

    @Id // This annotation make the id property a primary key of our table
    Long id;
}
