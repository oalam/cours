/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedao;

import employeedao.Department;
import employeedao.FileDepartementDao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adminl
 */
public class DepartementDaoTest {

    public DepartementDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of save method, of class DepartementDao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Department dep = new Department("dev");
        FileDepartementDao dao = new FileDepartementDao();

        dep.addEmployee("tom", "rue lepic", 18999.2);
        dep.addEmployee("jerry", "rue bernardin", 18.28);

        dao.save(dep);

        Department dep2 = new Department("dev");

        assertNull(dep2.find("tom"));
        assertNull(dep2.find("jerry"));
        dao.load(dep2);

        assertNotNull(dep2.find("tom"));
        assertEquals(dep2.find("tom").getSalary(),18999.2, 0.001);
        assertNotNull(dep2.find("jerry"));
        assertNull(dep2.find("plik"));
    }
}
