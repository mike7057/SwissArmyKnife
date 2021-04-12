import java.time.Duration;
import java.time.Instant;

public class sak {
    
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println("");
        System.out.println("");

        //Outputs text and -help if argument length is less than 1, basically if no argument was input
        //Checks argument length is less than 1
        if (args.length < 1) {  
            System.out.println("It appears you did not input an argument. You can use 'java sak -Help' for a list of commands");
            System.out.println("");
            //Calls printHelp in Help.java
            Help.printHelp(); 

        //Outputs -Help text showing user commands if -Help argument is used
        //Checks if args is equal to -Help and ignores any case used
        } else if  (args[0].equalsIgnoreCase("-Help")) {
            System.out.println("Help to the rescue!!!");
            //Calls printHelp in Help.java
            Help.printHelp(); 


        } else if  (args[0].equalsIgnoreCase("-SleepFastImplementsRunnable")) {
            System.out.println("Sleeping faster implementing Runnable...");
            SleepFastImplementsRunnable.sleepRunnable();
        
        } else if  (args[0].equalsIgnoreCase("-SleepFast")) {
            System.out.println("Sleeping faster...");
            SleepFast.sleepFast();

        } else if  (args[0].equalsIgnoreCase("-Sleep")) {
            System.out.println("Sleeping...");
            Sleep.sleep();

        
        } else if (args[0].equalsIgnoreCase("-HttpRequest")) { //Checks if args is equal to -HttpRequest
            System.out.println("Executing HttpRequest...");

            if (args.length < 2) { //Checks for args length of less than 2
                System.out.println("In order to use -HttpRequest you need to provide a valid URL as the second parameter");

            //If args length is more than 2, the URL is passed to HttpRequest.java to get the websites data
            } else { 
                String URL = args[1];
                HttpRequest request = new HttpRequest();

                if (request.readURL(URL)) {
                    System.out.println(request);
                    System.out.println("index printed");
                }
            }
        } 

        System.out.println("");
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start,end);
        System.out.print("Overall elapsed time in milliseconds: ");
        System.out.println(timeElapsed.toMillis());
        

         
        
    } 
} 