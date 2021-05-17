public class MultiThreading implements Runnable {

    public static void main(String[] args) {

        Thread thread1 = new Thread("Kiran");
        Thread thread2 = new Thread("Kumar");

        thread1.start();
        thread2.start();

        System.out.println("Thread names are following:");

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
    }
    @Override
    public void run() {

    }
}

