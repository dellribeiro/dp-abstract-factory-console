public abstract class Factory {

    public Console create(String requestGrade) {
        Console console = retrieveConsole(requestGrade);
        console = prepareConsole(console);
        return console;
    }

    private Console prepareConsole(Console console) {
        console.powerOn();
        console.checkStorageSpace();
        console.startGame("Elden Ring");
        console.stopGame("Elden Ring");
        console.powerOff();
        return console;
    }

    abstract Console retrieveConsole(String requestGrade);
}
