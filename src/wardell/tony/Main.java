package wardell.tony;

import java.util.Stack;

public class Main {
    
    static Stack<String> times;

    public static void main(String[] args) {
	// write your code here
        times = new Stack<>();
        int counter = 0;
        
        while (true) {
            try {
                Thread.sleep(10);
                String timeStamp = TimeStamper.stamp();
                System.out.println("Bidding my time at " + timeStamp);
                times.push(timeStamp);
                counter++;
                
                if (counter == 5000){
                    System.out.println("Clearing cache");
                    System.out.println("Clearing cache");
                    System.out.println("Clearing cache");
                    times = new Stack<>();
                    
                    Thread.sleep(10000);
                }
                
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
