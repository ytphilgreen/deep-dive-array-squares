package edu.cnm.deepdive.arrays;

import java.util.Arrays;

public class Squares {

  public static void main(String[] args) {
    int[] squares = new int[50];
    for (int i = 0; i < squares.length; i++) {
      squares[i] = i * i;
    } // end for
    System.out.println(Arrays.toString(squares));
  } // end array string

} // end class
