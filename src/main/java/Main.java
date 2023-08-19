import CRUD.ClientCrudService;
import CRUD.PlanetCrudService;
import entities.Client;
import entities.Planet;
import other.Hibernate;
import other.Migration;

public class Main {
    public static void main(String[] args) {

        Migration.checkMigration();

        PlanetCrudService planetService = new PlanetCrudService();

        Hibernate.getInstance().close();

    }
}