public class Unit implements Runnable {
    private String id;
    private Position position;
    private boolean active = true;

    // Constructor
    public Unit(String id) {
        this.id = id;
        this.position = new Position(0, 0); 
    }


    public void run() {
        while (active) {
            try {
                Thread.sleep(1000);  // Wait 1 second
                moveRandomly();      
                System.out.println(id + " is at " + position);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();  // Handle thread interrupt
            }
        }
    }

    private void moveRandomly() {
        int dx = (int)(Math.random() * 3 - 1); 
        int dy = (int)(Math.random() * 3 - 1); 
        position.move(dx, dy);                // Apply movement
    }

    // Getter methods
    public Position getPosition() {
        return position;
    }

    public String getId() {
        return id;
    }
}