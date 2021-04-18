import java.lang.*;

class Main {

  boolean running;
  DisplayManager dm;

  public Main() {
  }



  public void run() throws java.io.IOException, java.lang.InterruptedException {
    while (running) {
      long startTime = System.currentTimeMillis();

      dm.clear();

      dm.render();

      while (System.currentTimeMillis() - startTime < 1000) {

      }
    }
  }

  public void start() throws java.io.IOException, java.lang.InterruptedException {
    running = true;
    dm = new DisplayManager(80, 23);

    dm.displayWindowSize();

    run();
  }

  public static void main(String[] args) throws java.io.IOException, java.lang.InterruptedException {
    Main main = new Main();
    main.start();
  }
}