package org.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passsenger extends BaseModel {

    public String name;

    @OneToMany(mappedBy = "passsenger")
    private List<Booking> bookings=new ArrayList<>();
}
