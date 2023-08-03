package factories;

import consoles.Console;
import contracts.ContractFactory;
import contracts.NoContract;
import customers.Customer;
import utils.RequestGrade;

public abstract class Factory {

    public Console create(RequestGrade requestGrade) {
        Console console = retrieveConsole(requestGrade);
        console = prepareConsole(console);
        return console;
    }

    private Console prepareConsole(Console console) {
        console.dataSheet();
        console.powerOn();
        console.startGame("Elden Ring");
        console.stopGame("Elden Ring");
        console.powerOff();
        return console;
    }


    public static Factory getFactory(Customer client) {
        if (client.hasCompanyContract()) {
            return new ContractFactory();
        }
        return new NoContract();
    }

    protected abstract Console retrieveConsole(RequestGrade requestGrade);
}
