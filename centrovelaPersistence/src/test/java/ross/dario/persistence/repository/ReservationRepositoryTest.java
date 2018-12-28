package ross.dario.persistence.repository;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ross.dario.CentrovelaPersistenceApplication;
import ross.dario.persistence.entity.Role;
import ross.dario.persistence.repository.RoleRepository;
import ross.dario.persistence.repository.UserRepository;
import ross.dario.persistence.entity.Reservation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Unit test for ReservationRepository.
 * 
 * @author dario
 *
 */
public class ReservationRepositoryTest{
	
//	private static final Logger logger = LogManager.getLogger(ReservationRepositoryTest.class);
//	
//
//	@Autowired
//	private RoleRepository roleR;
//	@Autowired
//	private UserRepository ur;
//	@Autowired
//	private ReservationRepository rr;
//	@Autowired
//	private CourseRepository cr;
//	
//	
//	/**
//     * initializeReservationTests() method inserts a new Reservation
//     * in order to be able to insert a new Reservation
//     */
//	@Before
//	@After
//    private void initializeReservationTests() {
//    	
//    	logger.info("ReservationRepositoryTest.initializeReservationTests - START");
//    	ur.deleteAll();
//    	roleR.deleteAll();
//		cr.deleteAll();
//		rr.deleteAll();
//
//		logger.info("ReservationRepositoryTest.initializeReservationTests - END");
//    }
//	
//
//	/**
//     * testSelectAllFilled() method tests if the method selectAll()
//     * is really able to select all tuples from a populated
//     * Reservation' table
//     */
//	@Test
//    public void testSelectAllFilled(){
//		logger.info("ReservationRepositoryTest.testSelectAllFilled() - START");
//		ur.save(getFakeUser());
//		assertTrue(ur.count() == 1);
//    }
//    
//    /**
//     * testSelectAllEmpty() method tests if the method selectAll()
//     * is really able to select all tuples from a empty
//     * Reservations' table
//     */
//	@Test
//    public void testSelectAllEmpty(){
//		
//		logger.info("ReservationRepositoryTest.testSelectAllEmpty() - START");
//		rr.deleteAllFull();
//		assertTrue(rr.selectAll().size()==0);
//    }
//    
//	/**
//     * testInsert() method tests if the method insert()
//     * really works
//     */
//	@Test
//	public void testInsert() {
//		
//		logger.info("ReservationRepositoryTest.testInsert() - START");
//		rr.deleteAllFull();
//		assertTrue(rr.selectAll().size()==0);
//		
//		rr.insert(getFakeReservation());
//		assertTrue(rr.selectAll().size()==1);
//		
////		assertEquals(list.get(0).toString(),Reservation.toString());
//		rr.deleteAllFull();
//	}
//
//	/**
//     * testSelectById() method tests if the method selectById()
//     * really works
//     */
//	@Test
//	public void testSelectById() {
//		
//		logger.info("ReservationRepositoryTest.testSelectById() - START");
//		rr.deleteAllFull();
//		Reservation r1 = getFakeReservation();
//		rr.insert(r1);
//		assertTrue(rr.selectById(r1.getId())!=null);
//	}
//	
//	/**
//     * testUpdate() method tests if the method update()
//     * really works
//     */
//	@Test
//	public void testUpdate() {
//		
//		logger.info("ReservationRepositoryTest.testUpdate() - START");
//		rr.deleteAllFull();
//		reservation = getFakeReservation();
//		rr.insert(reservation);
//		
//		reservation.setPaymentStatus("payed");
//		rr.update(reservation);
//		assertTrue(((Reservation) rr.selectById(reservation.getId())).getPaymentStatus().equals("payed"));
//	}
//
//	/**
//     * testDeleteById() method tests if the method deleteById()
//     * really works
//     */
//	@Test
//	public void testDeleteById() {
//
//		logger.info("ReservationRepositoryTest.testDeleteById() - START");
//		rr.deleteAllFull();
//		Reservation r1 = getFakeReservation();
//		rr.insert(r1);
//    	assertTrue(rr.selectAll().size()>0);
//    	rr.deleteByClassAndId(Reservation.class, r1.getId());
//		list=(ArrayList<Reservation>)rr.selectAll();
//		for(Reservation r : list) {
//			assertTrue(r.getId()!=r1.getId());
//		}
//	}
//	
//	/**
//     * testDeleteAll() method tests if the method deleteAll()
//     * really works
//     */
//	@Test
//	public void testDeleteAll () {
//		
//		logger.info("ReservationRepositoryTest.testDeleteAll() - START");
//		rr.insert(getFakeReservation());
//    	assertTrue(rr.selectAll().size()>0);
//    	rr.deleteAllFull();
//		assertTrue(rr.selectAll().size()==0);
//		logger.info("ReservationRepositoryTest.testDeleteAll() - END");
//	}
//	
//	public static Reservation getFakeReservation() {
//		
//		User u1= getFakeUser();
//		Course course = getFakeCourse();
//		Reservation reservation = new Reservation();
//		
//		reservation.setUser_id(u1.getId());
//		reservation.setCourse_id(course.getId());
//		
//		
//		reservation.setPaymentStatus("not_payed");
//		
//		return reservation;
//	}
//	
//
//	
//	public static User getFakeUser() {
//		/* create a "Role" because Role is defined "Not null" in the table */
//		if (roleR == null) {
//			roleR = new RoleRepository();
//		}
//		Role roleForTest = RoleRepositoryTest.getFakeRole();
//		roleR.insert(roleForTest);
//		/* get the Role's level */
//		roleForTest = (Role) roleR.selectAll().get(0);
//		/* create a user, fakeUser */
//		User a1 = new User();
//		/* unique email and "not null" defined */
//		a1.setEmail("new_aa hello");
//		a1.setPassword("new");
//		/* pass the getLevel value to my user's setRole() method */
//		a1.setRole(roleForTest.getLevel());
//		return a1;
//	}
//	
//	public static Course getFakeCourse() {
//		Course course = new Course();
//
//		course.setDescription("administrador");
//		course.setPrice(100);	
//		
//		return course;
//	}
//	
//	public void deleteFake() {
//		rr.deleteAll();
//	}
//	
//
//    
//
// 
//	
//	@After
//	public void restoreReservationTable () {
//		rr.deleteAllFull();
//	}
}
