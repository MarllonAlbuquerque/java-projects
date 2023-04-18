package com.api.parkingcontrol2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol2.models.ParkingSpotModel;
import com.api.parkingcontrol2.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingspotrepository;

    @Autowired
    public ParkingSpotService(ParkingSpotRepository parkingspotrepository) {
        this.parkingspotrepository = parkingspotrepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingspotrepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingspotrepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingspotrepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingspotrepository.existsByApartmentAndBlock(apartment, block);
    }

    public List<ParkingSpotModel> findAll() {
        return parkingspotrepository.findAll();
    }

}
