package services.db;

public class SimpleDataStore implements DataStore {

    @Override
    public void saveOrder(String email) {
        System.out.println("Order for " + email + " store in DB.");
    }

}
