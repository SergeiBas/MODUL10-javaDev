import CRUD.ClientCrudService;
import CRUD.PlanetCrudService;
import CRUD.TicketCrudService;
import entities.Client;
import entities.Planet;
import other.Hibernate;
import other.Migration;

public class Main {
    public static void main(String[] args) {

        Migration.checkMigration();

        new ClientCrudService();
        new PlanetCrudService();
        new TicketCrudService();

        Hibernate.getInstance().close();

    }
}