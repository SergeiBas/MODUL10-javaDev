package other;

import entities.Client;
import entities.Planet;
import entities.Ticket;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {

    private static final Hibernate INSTANCE;

    private SessionFactory sessionFactory;

    static {
        INSTANCE = new Hibernate();
    }

    private Hibernate() {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Planet.class)
                .addAnnotatedClass(Ticket.class)
                .buildSessionFactory();
    }

    public static Hibernate getInstance() {
        return INSTANCE;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void close() {
        sessionFactory.close();
    }
}
