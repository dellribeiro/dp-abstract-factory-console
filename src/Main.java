public class Main {
    public static void main(String[] args) {

        Customer client = new Customer("A", true);
        Factory factory = getFactory(client);
        Console console = factory.create(client.getGradeRequest());
    }

    private static Factory getFactory(Customer client) {
        if (client.hasCompanyContract()) {
            return new ContractFactory();
        }
        return new NoContract();
    }
}