class Main {
  //main
  public static void main(String[] args) {
    Semaphore sem1 = new Semaphore(0);
    Semaphore sem2 = new Semaphore(0);
    Semaphore sem3 = new Semaphore(0);
    Semaphore sem4 = new Semaphore(0);
    Semaphore sem5 = new Semaphore(0);

    //init thread 
    Thread P = new P(sem1, sem2, sem3, sem4, sem5);
    Thread Q = new Q(sem1, sem2, sem3, sem4, sem5);
    Thread R = new R(sem1, sem2, sem3, sem4, sem5);

    //startin thread
    P.start();
    Q.start();
    R.start();
  }
}
