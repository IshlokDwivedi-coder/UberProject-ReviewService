package org.example.uberreviewservice.Repositories;

import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface driverRepository extends JpaRepository<Driver,Long> {

    Optional<Driver> findByIdAndLicenseNo(Long id,String licenseNo);

    @Query(nativeQuery = true,value = "SELECT * FROM driver where id= :id and license_no= :license")  //raw mysql query ,error thrown at runtime
    Optional<Driver> rawfindByIdAndLicenseNo(Long id,String licenseNo);

}
