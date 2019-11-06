package tech.carlosestrada.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.carlosestrada.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike,  Long> {
}
