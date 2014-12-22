/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.eurismar.app1.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eurismar
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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


     @Test
     public void testJPA() {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
         EntityManager em = emf.createEntityManager();
         Usuario u = new Usuario();
         u.setNome("Eurismar");
         u.setLogin("euris");
         u.setSenha("123");
         em.getTransaction().begin();
         em.persist(u);
         em.getTransaction().commit();
         em.close();
         emf.close();
         
         
     }
}
