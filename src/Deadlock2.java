import java.util.Random;

public class Deadlock2 extends Thread {

    private static Integer sCount = 0;
    private Random mRand = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Deadlock2 threads = new Deadlock2();
            threads.setName("teste " + i);
            threads.start();
        }
    }

    @Override
    public void run() {
        while (true){
            addOrRemove();
            addOrRemove();
            synchronized (mRand){
                try {
                    mRand.wait(mRand.nextInt(5));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.getName() + " = "+sCount);
            addOrRemove();
            addOrRemove();
        }
    }

    private synchronized void addOrRemove() {
        if (mRand.nextBoolean()) {
            sCount++;
        } else {
            sCount--;
        }
    }


}
