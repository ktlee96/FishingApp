/*
 *Hee Sung Kim and Kyung Taek Lee
 *Fishing App implementation
 *7/22/2017
*/

import java.util.Scanner;
import java.util.*;

public class Implementation{
  public static void main(String[] args){
    HashMap table = new HashMap<ArrayList<String>, Integer>();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Fish Species, Weather, Temperature, Water color: ");
    while (scanner.hasNext()){
      String data = scanner.nextLine();
      ArrayList<String> list = new ArrayList<String>();
      while (data.contains(",")){
        list.add(data.substring(0,data.indexOf(",")));
        data = data.substring(data.indexOf(",")+2);
      }
      list.add(data);
      System.out.println(table.get(list));
      if(table.get(list) == null){
        table.put(list,1);
      }else{
        int i = (Integer) table.get(list);
        table.put(list, i + 1);
      }
      System.out.println(table.toString());
    }
  }
}
