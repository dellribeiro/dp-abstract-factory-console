import consoles.Console;
import customers.Customer;
import factories.Factory;
import utils.RequestGrade;

import static factories.Factory.getFactory;

public class Main {
    public static void main(String[] args) {

        Customer client = new Customer(RequestGrade.PRO, true);
        Factory factory = getFactory(client);
        Console console = factory.create(client.getGradeRequest());
    }

}