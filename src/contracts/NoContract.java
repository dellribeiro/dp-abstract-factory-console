package contracts;

import consoles.Console;
import consoles.XboxConsole;
import factories.Factory;
import utils.RequestGrade;

public class NoContract extends Factory {
    @Override
    protected Console retrieveConsole(RequestGrade requestGrade) {
        switch (requestGrade){
            case BASE:
                return new XboxConsole("Xbox One", "AMD Jaguar", "8GB", 1080, 512);
            case SLIM:
                return new XboxConsole("Xbox One S", "AMD Jaguar", "8GB", 1080, 1024);
            case PRO:
                return new XboxConsole("Xbox One X", "Octa-core", "12GB", 2160, 2048);
        }
        return null;
    }
}
