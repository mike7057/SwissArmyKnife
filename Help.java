public class Help {
    public static void printHelp() {
    System.out.println("Here is a helpful list of arguments to get you started in using SwissArmyKnife");
    System.out.println("");
    System.out.println("java sak -HttpRequest, followed by a URL will return websites data");
    System.out.println("java sak -HttpRequest [URL]");
    System.out.println("java sak -HttpRequest https://www.google.com");
    System.out.println("java sak -HttpRequest https://www.dominos.com");
    System.out.println("");
    System.out.println("");
    System.out.println("You can also sleep with the use of 3 different commands below");
    System.out.println("");
    System.out.println("java sak -Sleep");
    System.out.println("This cause the program to sleep and return the elapsed time, using single threads");
    System.out.println("");
    System.out.println("java sak -SleepFast");
    System.out.println("This cause the program to sleep and return the elapsed time, using both single and multithreads");
    System.out.println("");
    System.out.println("java sak -SleepFastImplementsRunnable");
    System.out.println("This cause the program to sleep and return the elapsed time, using both single and multithreads, executed by a thread");

    }
}
