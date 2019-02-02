
import bean.Sistema;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * @author Rafael Alipio Harada(rafhaharada@gmail.com)
 */
public class Dao {

    Configuration conf = new Configuration();
    StandardServiceRegistry ssr;
    SessionFactory factory;
    Transaction transaction;

    public void insert(String nome) {
        start();
        try {
            Session session = factory.openSession();
            transaction = session.getTransaction();
            transaction.begin();

            Sistema sistema = new Sistema();
            sistema.setNome(nome);
            //INSERT IN DB
            session.save(sistema);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            factory.close();
        }
    }

    public void update(int id, String nome) {
        start();
        try {
            Session session = factory.openSession();
            transaction = session.getTransaction();
            transaction.begin();

            Sistema sistema = new Sistema();
            sistema.setNome(nome);
            sistema.setId(id);
            session.update(sistema);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            factory.close();
        }
    }

    public List<Sistema> getAll() {
        start();
        List<Sistema> lista = new ArrayList<>();
        try {
            Session session = factory.openSession();
            transaction = session.getTransaction();
            transaction.begin();
            List resultados = session.createQuery("from Sistema").list();
            for (Sistema sistema : (List<Sistema>) resultados) {
                lista.add(sistema);
            }
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction.isActive()) {
                transaction.rollback();
                return null;
            }
        } finally {
            factory.close();
        }
        return lista;
    }

    public void delete(int id) {
        start();
        try {
            Session session = factory.openSession();
            transaction = session.getTransaction();
            transaction.begin();
            Sistema sistema = new Sistema();
            sistema.setId(id);
            session.remove(sistema);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            factory.close();
        }
    }

    public void start() {
        ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        factory = conf.buildSessionFactory(ssr);
        transaction = null;
    }

}
