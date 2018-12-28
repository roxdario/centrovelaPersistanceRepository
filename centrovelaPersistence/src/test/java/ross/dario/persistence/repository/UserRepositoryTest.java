package ross.dario.persistence.repository;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import ross.dario.CentrovelaPersistenceApplication;
import ross.dario.persistence.entity.Role;
import ross.dario.persistence.entity.User;
import ross.dario.persistence.repository.RoleRepository;
import ross.dario.persistence.repository.UserRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CentrovelaPersistenceApplication.class)
@SpringBootTest
public class UserRepositoryTest {

	private static final Logger logger = LogManager.getLogger(UserRepositoryTest.class);
	
	@Autowired
	private RoleRepository rr;
	@Autowired
	private UserRepository ur;
//	@Autowired
//	private CandidateRepository cr;
//	@Autowired
//	private EmployeeRepository er;
	
	/**
     * initializeUserTests() method inserts a new Role
     * in order to be able to insert a new Role
     */
	@Before
	@After
    public void initializeUserTests() {
    	
    	logger.info("UserRepositoryTest.initializeUserTests - START");
		
//		er.deleteAll();
//		cr.deleteAll();
		ur.deleteAll();	
		rr.deleteAll();

		logger.info("UserRepositoryTest.initializeUserTests - END");
    }

	/**
     * testSelectAllFilled() method tests if the method selectAll()
     * is really able to select all tuples from a populated(with one entity)
     * user table
     */
	@Test
    public void testSelectAllFilled(){
		logger.info("UserRepositoryTest.testSelectAllFilled() - START");
    	ur.save(getFakeUser());
		assertTrue(ur.count() == 1);
    }
    
    /**
     * testSelectAllEmpty() method tests if the method selectAll()
     * is really able to select all tuples from a empty
     * users' table
     */
	@Test
    public void testSelectAllEmpty(){
		
		logger.info("UserRepositoryTest.testSelectAllEmpty() - START");
		assertTrue(ur.count()==0);
    }
   
	/**
     * testInsert() method tests if the method insert()
     * really works
     */
	@Test
	public void testInsert() {
		logger.info("UserRepositoryTest.testInsert() - START");
		assertTrue(ur.count()==0);
		ur.save(getFakeUser());
		assertTrue(ur.count()==1);
	}

	/**
     * testSelectById() method tests if the method selectById()
     * really works
     */
	@Test
	public void testSelectById() {
		logger.info("UserRepositoryTest.testSelectById() - START");
		User currentUser = ur.save(getFakeUser());
		assertTrue(ur.findById(currentUser.getId()).isPresent());		
	}
	
	/**
     * testUpdate() method tests if the method update()
     * really works
     */
	@Test
	public void testUpdate() {
		logger.info("UserRepositoryTest.testUpdate() - START");
		User currentUser = ur.save(getFakeUser());
		currentUser.setPassword("pippopippo");
		ur.save(currentUser);
		assertTrue(ur.findById(currentUser.getId()).isPresent());	
		assertTrue(ur.findById(currentUser.getId()).get().getPassword().equals("pippopippo"));
	}
	
	/**
     * testDeleteById() method tests if the method deleteById()
     * really works
     */
	@Test
	public void testDeleteById() {
		logger.info("UserRepositoryTest.testDeleteById() - START");
		User currentUser = ur.save(getFakeUser());
    	assertTrue(ur.count()==1);
    	ur.deleteById(currentUser.getId());
    	assertTrue(ur.count()==0);
	}
	
	/**
     * testDeleteAll() method tests if the method deleteAll()
     * really works
     */
	@Test
	public void testDeleteAll () {
		logger.info("UserRepositoryTest.testDeleteAll() - START");
		ur.save(getFakeUser());
    	assertTrue(ur.count()==1);
    	ur.deleteAll();
		assertTrue(ur.count()==0);
		logger.info("UserRepositoryTest.testDeleteAll() - END");
	}
	
	private User getFakeUser() {
		/* create a "Role" because Role is defined "Not null" in the table */
		
		Role role = new Role();
		role.setLabel("admin");
		role.setDescription("administrador");
		role.setLevel(0);
		rr.save(role);
		
		/* create a user, fakeUser */
		User a1 = new User();
		/* unique email and "not null" defined */
		a1.setEmail("pippo@prova.com");
		a1.setCode("RSSDRA94R26D416X");
		a1.setPassword("pippo");
		a1.setFirstname("pippo");
		a1.setLastname("prova");
		a1.setDateofbirth(LocalDate.parse(("1989-10-21")));
		/* pass the getLevel value to my user's setRole() method */
		a1.setRole(role.getLevel());
		return a1;
	}

}