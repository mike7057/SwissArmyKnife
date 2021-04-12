import java.util.ArrayList;

class OneSecondSleeperFast extends Thread {
    private int sleepNumber;
    OneSecondSleeperFast(int sleepNumberIn) {
        sleepNumber = sleepNumberIn;
    }

    public void sleep() {
        System.out.println(sleepNumber + " - Going to sleep");
        try {
            Thread.sleep(1000); // Sleep for one second. 
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("... " + sleepNumber + " - Done sleeping");
    }

    public void run() {
        sleep();
    }
}

public class SleepFast {
    public static void sleepFast() {
        System.out.println("Starting Sleep...");

        OneSecondSleeperFast sleeper0 = new OneSecondSleeperFast(0);
        OneSecondSleeperFast sleeper1 = new OneSecondSleeperFast(1);

        System.out.println("\nNon-threaded Sleep");
        long start = System.currentTimeMillis();
        sleeper0.sleep();
        sleeper1.sleep();
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - start) + "\n");

        System.out.println("\nThreaded Sleep");
        start = System.currentTimeMillis();
        sleeper0.start();
        sleeper1.start();

        try {
            sleeper0.join();
            sleeper1.join();
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - start) + "\n");

        // Sleeping ArrayList
        ArrayList<OneSecondSleeperFast> sleeperList = new ArrayList<OneSecondSleeperFast>();
        for (int i=1; i<11; i++) {
            sleeperList.add(new OneSecondSleeperFast(i));
        }

        System.out.println("\nNon-threaded ArrayList sleep:");
        start = System.currentTimeMillis();
        for (OneSecondSleeperFast s: sleeperList) {
            s.sleep();
        }
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - start));

        System.out.println("\nThreaded ArrayList sleep:");
        start = System.currentTimeMillis();
        for (OneSecondSleeperFast s: sleeperList) {
            s.start();
        }

        try {
            for (OneSecondSleeperFast s: sleeperList) {
                s.join();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("Elapsed time = "+(System.currentTimeMillis()-start));
    }
}