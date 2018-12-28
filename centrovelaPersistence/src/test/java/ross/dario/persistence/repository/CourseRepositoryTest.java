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
import ross.dario.persistence.entity.Course;
import ross.dario.persistence.repository.CourseRepository;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Unit test for CourseRepository.
 * 
 * @author dario
 *
 */
public class CourseRepositoryTest{
	
//	private static final Logger logger = LogManager.getLogger(CourseRepositoryTest.class);
//
//	@Autowired
//	private RoleRepository rr;
//	@Autowired
//	private UserRepository ur;
//	@Autowired
//	private CourseRepository cr;
//
//	
//	/**
//     * initializeCourseTests() method inserts a new Course
//     * in order to be able to insert a new Course
//     */
//	@Before
//	@After
//    private void initializeCourseTests() {
//    	
//    	logger.info("CourseRepositoryTest.initializeCourseTests - START");
//    	ur.deleteAll();
//		rr.deleteAll();
//		cr.deleteAll();
//
//		logger.info("CourseRepositoryTest.initializeCourseTests - END");
//    }
//    
//
//
//	/**
//     * testSelectAllFilled() method tests if the method selectAll()
//     * is really able to select all tuples from a populated
//     * Course' table
//     */
//	@Test
//    public void testSelectAllFilled(){
//		logger.info("CourseRepositoryTest.testSelectAllFilled() - START");
//		ur.save(getFakeUser());
//		assertTrue(ur.count() == 1);
//    }
//    
//    /**
//     * testSelectAllEmpty() method tests if the method selectAll()
//     * is really able to select all tuples from a empty
//     * Courses' table
//     */
//	@Test
//    public void testSelectAllEmpty(){
//		
//		logger.info("CourseRepositoryTest.testSelectAllEmpty() - START");
//		cr.deleteAll();
//		assertTrue(cr.selectAll().size()==0);
//    }
//    
//	/**
//     * testInsert() method tests if the method insert()
//     * really works
//     */
//	@Test
//	public void testInsert() {
//		
//		logger.info("CourseRepositoryTest.testInsert() - START");
//		cr.deleteAll();
//		assertTrue(cr.selectAll().size()==0);
//		
//		cr.insert(getFakeCourse());
//		assertTrue(cr.selectAll().size()==1);
//		
////		assertEquals(list.get(0).toString(),Course.toString());
//		cr.deleteAll();
//	}
//
//	/**
//     * testSelectById() method tests if the method selectById()
//     * really works
//     */
//	@Test
//	public void testSelectById() {
//		
//		logger.info("CourseRepositoryTest.testSelectById() - START");
//		cr.deleteAll();
//		Course r1 = getFakeCourse();
//		cr.insert(r1);
//		assertTrue(cr.selectById(r1.getId())!=null);
//	}
//	
//	/**
//     * testUpdate() method tests if the method update()
//     * really works
//     */
//	@Test
//	public void testUpdate() {
//		
//		logger.info("CourseRepositoryTest.testUpdate() - START");
//		cr.deleteAll();
//		course = getFakeCourse();
//		cr.insert(course);
//		
//		course.setDescription("corso");
//		cr.update(course);
//		assertTrue(((Course) cr.selectById(course.getId())).getDescription().equals("corso"));
//	}
//
//	/**
//     * testDeleteById() method tests if the method deleteById()
//     * really works
//     */
//	@Test
//	public void testDeleteById() {
//
//		logger.info("CourseRepositoryTest.testDeleteById() - START");
//		cr.deleteAll();
//		Course r1 = getFakeCourse();
//		cr.insert(r1);
//    	assertTrue(cr.selectAll().size()>0);
//    	cr.deleteByClassAndId(Course.class, r1.getId());
//		list=(ArrayList<Course>)cr.selectAll();
//		for(Course r : list) {
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
//		logger.info("CourseRepositoryTest.testDeleteAll() - START");
////		cr.insert(getFakeCourse());
////    	assertTrue(cr.selectAll().size()>0);
////    	cr.deleteAllFull();
////		assertTrue(cr.selectAll().size()==0);
//		logger.info("CourseRepositoryTest.testDeleteAll() - END");
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
//		cr.deleteAll();
//	}
//	
//
//
// 
//	
//	@After
//	public void restoreCourseTable () {
//		cr.deleteAll();
//	}
}
