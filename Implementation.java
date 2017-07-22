/*
 *Hee Sung Kim and Kyung Taek Lee
 *Fishing App implementation
 *7/22/2017
*/

import java.util.Scanner;

public class Implementation{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Location, Fish Species, Weather, Temperature: ");
    while (scanner.hasNext()){
      String data = scanner.nextLine();
      System.out.println("You typed: " + data);
    }
  }
}
