import be.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("database-configuration");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            User newuser = new User();
            //newuser.setUserId(2);
            newuser.setFirstName("Alain");
            newuser.setLastName("Daria");
            newuser.setCity("leuven");
            newuser.setAddress("Nummer:7");
            entityManager.persist(newuser);

            transaction.commit();

        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }

            entityManager.close();
            entityManagerFactory.close();
        }
    }
}