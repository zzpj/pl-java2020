package java.proxy;

import java.util.ArrayList;
import java.util.List;

public class DatabaseWriter {

    private List<Client> database = new ArrayList<>();

    public void save(List<Client> clients) {
        database.addAll(clients);
    }

    public List<Client> getAllClients() {
        //TODO fetch all clients from DB, let's assume
        // this operation costs quite a lot
        System.out.println("Returning all clients from DB");
        return database;
    }
}
