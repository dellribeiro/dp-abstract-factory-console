package contracts;

import consoles.Console;
import consoles.PlaystationConsole;
import factories.Factory;
import utils.RequestGrade;

public class ContractFactory extends Factory {

    @Override
    protected Console retrieveConsole(RequestGrade requestGrade) {
        switch (requestGrade){
            case BASE:
                return new PlaystationConsole("PS4", "AMD Jaguar", "8GB", 1080, 512);
            case SLIM:
                return new PlaystationConsole("PS4 Slim", "AMD Jaguar", "8GB", 1080, 1024);
            case PRO:
                return new PlaystationConsole("PS4 Pro", "AMD Jaguar", "16GB", 2160, 2048);
        }
        return null;
    }

}
