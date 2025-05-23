package codes.neriman.carRental_project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import codes.neriman.carRental_project.entity.Car;

@Repository
public class CarRepository extends JpaRepository<Car, Long>{

	public Optional<Car> findById(Long id) {
		return null;
	}

	public List<Car> findAll() {
		return null;
	}

	public Car save(Car car) {
		return null;
	}

	public void deleteById(Long id) {
		
	}

}
