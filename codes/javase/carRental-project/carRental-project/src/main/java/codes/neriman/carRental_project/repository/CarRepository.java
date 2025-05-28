package codes.neriman.carRental_project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codes.neriman.carRental_project.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long>{

}

