public class NoContract extends Factory {
    @Override
    Console retrieveConsole(String requestGrade) {
        if ("A".equals(requestGrade)) {
            return new XboxConsole("Zen3", "32gb", 2160, 4096);
        }
        return null;
    }
}
