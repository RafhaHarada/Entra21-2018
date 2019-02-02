package database;

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
public class Conexao {

    private Configuration conf = new Configuration();
    private StandardServiceRegistry ssr = null;
    private SessionFactory factory = null;
    public Transaction transaction = null;
    public Session session = null;

    public boolean conectar() {
        ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        factory = conf.buildSessionFactory(ssr);
        transaction = null;
        try {
            session = factory.openSession();
            transaction = session.getTransaction();
            transaction.begin();
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction.isActive()) {
                transaction.rollback();
            }
            return false;
        }
    }

    public void desconectar() {
        if (session != null) {
            transaction.commit();
            session.close();
        }
    }

}
