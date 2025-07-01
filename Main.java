public class Main {
    public static void main(String[] args) {
        CommandCenter cc = new CommandCenter();
        cc.launchSimulation(3);

        try {
            Thread.sleep(10000); // run simulation for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        cc.shutdown();
    }
}

