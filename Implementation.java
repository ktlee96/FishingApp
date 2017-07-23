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
    System.out.print("Fish Species, Weather, Temperature, Water color: \n");
    while (scanner.hasNext()){
      String data = scanner.nextLine();
      ArrayList<String> list = new ArrayList<String>();
      if (!data.contains(",")){
        System.out.println(table.toString());
      }else{
        while (data.contains(",")){
          list.add(data.substring(0,data.indexOf(",")));
          data = data.substring(data.indexOf(",")+2);
        }
        list.add(data);
        if(table.get(list) == null){
          table.put(list,1);
        }else{
          int i = (Integer) table.get(list);
          table.put(list, i + 1);
        }
      }
    }
  }
}
