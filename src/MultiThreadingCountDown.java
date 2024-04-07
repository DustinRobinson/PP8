public class MultiThreadingCountDown implements Runnable{
    
    // implements run method
    @Override
    public void run() {
        // try block
        try {
            // for loop to count down from 20 and print the thread id and the count to the console
            for (int i = 20; i > 0; i--) {
                System.out.println(i + " " + Thread.currentThread().threadId());
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
