public class ContractFactory extends Factory {

    @Override
    Console retrieveConsole(String requestGrade) {
        if ("A".equals(requestGrade)) {
            return new PlaystationConsole("Zen 3", "32gb", 2160, 2048);
        }
        return null;
    }
}
