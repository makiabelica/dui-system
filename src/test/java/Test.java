import model.DUI;
import model.User;
import org.apache.logging.log4j.LogManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.logging.Logger;

public class Test {
    //static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        test();

    }

    public static void test() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory ("DuiSys");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        DUI dui = new DUI();
         dui.setIdDui(00110);

        User user = new User();
        user.setNombres("test");
        user.setApellidos("Espinoza Campos");
        user.setCargo("Web dev");
        user.setGenero("F");
        user.setEdad(21);

        em.persist(user);
        tx.commit();
    }
}
