package lesson15;


public class Main {
    public static void main(String[] args) throws InterruptedException {

       Thread thread = new Threads();

       process(thread);




    }

        public static void process(Thread thread) {
            switch (thread.getState()) {
                case NEW:
                    thread.start();
                    break;
                case WAITING:
                    thread.interrupt();
                    break;
                case RUNNABLE:
                    thread.isInterrupted();
                    break;
                case TERMINATED:
                    System.out.println(thread.getPriority());
                    break;
            }
        }
}
