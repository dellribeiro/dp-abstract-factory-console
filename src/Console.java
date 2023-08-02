public abstract class Console {
    private String cpu;
    private String memory;
    private int resolution;
    private int storage;

    public Console(String cpu, String memory, int resolution, int storage) {
        this.cpu = cpu;
        this.memory = memory;
        this.resolution = resolution;
        this.storage = storage;
    }

    public void powerOn() {
        System.out.println("The console is powering on.");
    }

    public void powerOff() {
        System.out.println("The console is powering off.");
    }

    public void startGame(String game) {
        System.out.println("Installing game " + game + ".");
    }

    public void stopGame(String game) {
        System.out.println("Stoping game " + game + ".");
    }

    public void checkStorageSpace() {
        System.out.println(storage + " of space is available.");
    }
}
