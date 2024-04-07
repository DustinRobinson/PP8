public class App {
    public static void main(String[] args) throws Exception {

        // create instances of the MultiThreadingCountUp and MultiThreadingCountDown classes
        MultiThreadingCountUp countUp = new MultiThreadingCountUp();
        MultiThreadingCountDown countDown = new MultiThreadingCountDown();

        // create threads for the countUp and countDown instances
        Thread t1 = new Thread(countUp);
        Thread t2 = new Thread(countDown);

        // start and join the threads
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}
