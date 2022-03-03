public class Demo {


    public static void main(String[] args) {

      for (int i = 1; i < 5; i++) {
         System.out.print("*");
         for (int j = 1; j < i; j++) {
              System.out.print("-");
         }
         for (int j = 1; j < 5 - i; j++) {
              System.out.print("+");
         }
         System.out.println("*");
     }

     for (int i = 1; i <= 3; i++) {
          for (int j = 1; j <= 2; j++) {
              for (int k = 1; k <= 4; k++) {
                  System.out.print("*");
              }
              System.out.print("-");
          }
          System.out.println("!");
    }
  
           for (int i = 1; i <= 3; i++) {
              for (int j = 1; j <= i; j++) {
                   for (int k = 1; k <= i; k++) {
                       System.out.print("*");
                    }
                    System.out.print("-");
              }
              System.out.println("!");
          }

           for (int i = 1; i <= 3; i++) {
              for (int j = 1; j <= i; j++) {
                   for (int k = 1; k <= j; k++) {
                       System.out.print("*");
                    }
                    System.out.print("-");
              }
              System.out.println("!");
          }

        
        
    } // end main

}
