package ross.dario.persistence.repository;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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
import ross.dario.persistence.repository.RoleRepository;
import ross.dario.persistence.repository.UserRepository;



@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CentrovelaPersistenceApplication.class)
@SpringBootTest
public class RoleRepositoryTest {

	private static final Logger logger = LogManager.getLogger(RoleRepositoryTest.class);
	
	@Autowired
	private RoleRepository rr;
	@Autowired
	private UserRepository ur;
	@Autowired
//	private CandidateRepository cr;
//	@Autowired
//	private EmployeeRepository er;
	
	/**
	 * Provides to clean role table and all(previously) referenced tables:
	 * user, candidate and employee.
     * in order to be able to execute tests.
     * Execute clean before and after each test
     */
	@Before
	@After
	public void initializeRoleTests () {
		logger.info("RoleRepositoryTest.initializeRoleTests - START");		
//		er.deleteAll();
//		cr.deleteAll();
		ur.deleteAll();
		rr.deleteAll();
		logger.info("RoleRepositoryTest.initializeRoleTests - END");
	}

	/**
     * testSelectAllFilled() method tests if the method selectAll()
     * is really able to select all tuples from a populated(with one entity)
     * role table
     */
	@Test
    public void testSelectAllFilled(){
		logger.info("RoleRepositoryTest.testSelectAllFilled() - START");
    	rr.save(getFakeRole());
		assertTrue(rr.count() == 1);
    }
    
    /**
     * testSelectAllEmpty() method tests if the method selectAll()
     * is really able to select all tuples from a empty
     * roles' table
     */
	@Test
    public void testSelectAllEmpty(){
		logger.info("RoleRepositoryTest.testSelectAllEmpty() - START");
		assertTrue(rr.count()==0);
    }

	/**
     * testInsert() method tests if the method insert()
     * really works
     */
	@Test
	public void testInsert() {
		logger.info("RoleRepositoryTest.testInsert() - START");
		assertTrue(rr.count()==0);
		rr.save(getFakeRole());
		assertTrue(rr.count()==1);
	}

	/**
     * testSelectById() method tests if the method selectById()
     * really works
     */
	@Test
	public void testSelectById() {
		logger.info("RoleRepositoryTest.testSelectById() - START");
		Role currentRole = rr.save(getFakeRole());
		assertTrue(rr.findById(currentRole.getId()).isPresent());		
	}
	
	/**
     * testUpdate() method tests if the method update()
     * really works
     */
	@Test
	public void testUpdate() {
		logger.info("RoleRepositoryTest.testUpdate() - START");
		Role currentRole = rr.save(getFakeRole());
		currentRole.setLabel("developer");
		rr.save(currentRole);
		assertTrue(rr.findById(currentRole.getId()).isPresent());	
		assertTrue((rr.findById(currentRole.getId()).get().getLabel().equals("developer")));
	}

	/**
     * testDeleteById() method tests if the method deleteById()
     * really works
     */
	@Test
	public void testDeleteById() {
		logger.info("RoleRepositoryTest.testDeleteById() - START");
		Role currentRole = rr.save(getFakeRole());
    	assertTrue(rr.count()==1);
    	rr.deleteById(currentRole.getId());
    	assertTrue(rr.count()==0);
	}
	
	/**
     * testDeleteAll() method tests if the method deleteAll()
     * really works
     */
	@Test
	public void testDeleteAll () {
		logger.info("RoleRepositoryTest.testDeleteAll() - START");
		rr.save(getFakeRole());
    	assertTrue(rr.count()==1);
    	rr.deleteAll();
		assertTrue(rr.count()==0);
		logger.info("RoleRepositoryTest.testDeleteAll() - END");
	}
	
	public Role getFakeRole() {
		Role role = new Role();
		role.setLabel("admin");
		role.setDescription("administrador");
		role.setLevel(0);	
		return role;
	}
	
}