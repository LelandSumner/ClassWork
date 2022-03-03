public class Code {
  public Code() {
  }

  public void run() {
    p(10);
  }

  public void checkpoint1() {
    System.out.println("*******");
    System.out.println(" ***** ");
    System.out.println("  ***  ");
    System.out.println("   *   "); 
  }

  public void checkpoint2() { 
    for (int r = 0; r != 4; ++r) {
      for (int c = r; c != 0; --c) {
        System.out.print(" ");
      }
      for (int c = 3 - r; c != 0; --c) {
        System.out.print("*");
      }
      System.out.print("*");
      for (int c = 3 - r; c != 0; --c) {
        System.out.print("*");
      }      
      System.out.println();
    }
  }

  public void checkpoint3() {
    for (int i = 0; i != 10; ++i) {
      System.out.print(" " + i);
    }
    System.out.println();
    for (int j = 10; j != 0; --j) {
      System.out.print(" " + j);
    }
    System.out.println();
  }

  public static final int CUTOFF = 10;
  public static final int FULLWIDTH = 30;

  public void ts(boolean stars) {
    for (int c = 0; c != FULLWIDTH; ++c) {
      if (stars && (c < CUTOFF)) {
        System.out.print("*");
      } else {
        System.out.print("-");
      }
    }
    System.out.println();
    for (int c = 0; c != FULLWIDTH; ++c) {
      if (stars && (c < CUTOFF)) {
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
  
  public void os(boolean stars) {
    for (int c = 0; c != FULLWIDTH; ++c) {
      if (stars && (c < CUTOFF)) {
        System.out.print("*");
      } else {
        System.out.print("-");
      }
    }
    System.out.println();
  }

  public void what() {
    for (int tsCount = 0; tsCount != 6; ++tsCount) {
      ts(tsCount < 3);
    }
    os(false);
  }



  public void p(int x) {
    for (int i = 0; i != x; ++i) {
      if ((i % 3) == 0)  {
        for (int j = 0; j != x; ++j) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }

  public static void main(String [] args) {
    Code instance = new Code();
    instance.run();
  }
}
