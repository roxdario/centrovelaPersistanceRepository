package ross.dario.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ross.dario.persistence.entity.Reservation;



/**
 * UserRepository
 * 
 * It allows the management of the question table, through insert, delete,
 * update and insert question The connection with Database is made by ConfigDB
 * java class
 * 
 * @author dario
 */

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	
	

}