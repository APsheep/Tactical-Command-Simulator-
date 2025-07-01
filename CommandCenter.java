import java.util.*;

public class CommandCenter {
    private List<Thread> unitThreads = new ArrayList<>();

    // Launch simulation with given number of units
    public void launchSimulation(int unitCount) {
        for (int i = 1; i <= unitCount; i++) {
            Unit unit = new Unit("Unit-" + i);     // Create new unit
            Thread t = new Thread(unit);           // Wrap in thread
            unitThreads.add(t);                    // Save thread
            t.start();                              
        }
    }

    // Stop simulation (interrupt threads)
    public void shutdown() {
        for (Thread t : unitThreads) {
            t.interrupt();  // Stop each thread
        }
        System.out.println("Simulation ended.");
    }
}