/*
 *Hee Sung Kim and Kyung Taek Lee
 *Fishing App implementation
 *7/24/2017
*/

import java.util.Scanner;
import java.util.*;

public class Implementation{
  public static void main(String[] args){
    HashMap table = new HashMap<String, HashMap<String, Integer>>();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Fish Species, Weather, Temperature, Water color, Bait: \n");
    while (scanner.hasNext()){
      String data = scanner.nextLine();
      String conditions = data.substring(0,data.lastIndexOf(","));
      String bait = data.substring(data.lastIndexOf(',')+2);
      if(table.get(conditions) == null){
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        list.put(bait,1);
        table.put(conditions, list);
        System.out.println(list.toString());
      }else{
        HashMap baitTable = (HashMap) table.get(conditions);
        System.out.println(baitTable.toString());
        if(baitTable.get(bait) == null){
          baitTable.put(bait,1);
          table.put(conditions, baitTable);
        }else{
          int i = (Integer) baitTable.get(bait);
          baitTable.put(bait, i + 1);
          table.put(conditions, baitTable);
        }
      }
      System.out.println(table.toString());
    }
  }

//Create method that sorts and updates hashMap<String, Integer>

//Create method that adds new "Fish Species, Weather, Temperature, Water color, Bait: \n"

//Create method that gets successful bait, given "Species, Weather, Temperature, Water color"

//Create method that deletes incorrect/misspelled <Key,Value>

}
