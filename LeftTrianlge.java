public class LeftTrianlge {
  public static void main(String[] args) {

 

    // size of the triangle
    int size = 5;
    // loop to print the pattern
    for (int i = 0; i < size; i++) {
      // print column
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}