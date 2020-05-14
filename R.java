//thread R

public class R extends Thread {
  Semaphore sem1;
  Semaphore sem2;
  Semaphore sem3;
  Semaphore sem4;
  Semaphore sem5;

  public R(Semaphore s1, Semaphore s2, Semaphore s3, Semaphore s4, Semaphore s5) {
    sem1 = s1;
    sem2 = s2;
    sem3 = s3;
    sem4 = s4;
    sem5 = s5;
  }

  @Override
  public void run() {
    sem3.P();
    System.out.println("o");
    sem4.V();
    sem5.P();
    System.out.println("e");
    sem5.V();
  }
}
