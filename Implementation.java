/*
 *Hee Sung Kim and Kyung Taek Lee
 *Fishing App implementation
 *7/25/2017
*/

import java.util.Scanner;
import java.util.*;

public class Implementation{

//Input: String conditions, String bait, HashMap table
//Output: void
//method that adds new "Fish Species, Weather, Temperature, Water color, Bait: \n"
  public static void add(String conditions, String bait, HashMap table){
    if(table.get(conditions) == null){
      HashMap<String, Integer> list = new HashMap<String, Integer>();
      list.put(bait,1);
      table.put(conditions, list);
      System.out.println(list.toString());
    }else{
      HashMap baitTable = (HashMap) table.get(conditions);
      if(baitTable.get(bait) == null){
        baitTable.put(bait,1);
        table.put(conditions, baitTable);
      }else{
        int i = (Integer) baitTable.get(bait);
        baitTable.put(bait, i + 1);
        table.put(conditions, baitTable);
      }
      System.out.println(baitTable.toString());
    }
  }

//Input: HashMap table
//Output: void
//Create method that sorts and updates hashMap<String, Integer>

//Input: String conditions, HashMap table
//Output: String bait
//Create method that gets successful bait, given "Species, Weather, Temperature, Water color"

//Create method that deletes incorrect/misspelled <Key,Value>

  public static void main(String[] args){
    HashMap table = new HashMap<String, HashMap<String, Integer>>();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type your Command: \n");
    while (scanner.hasNext()){
      String data = scanner.nextLine();
      if (data.contains("add")){
        String conditions = data.substring(data.indexOf(" ") + 1 ,data.lastIndexOf(","));
        String bait = data.substring(data.lastIndexOf(',')+2);
        add(conditions, bait, table);
      }else if (data.contains("get")){
        System.out.println("get method invoked");
      }else if (data.contains("delete")){
        System.out.println("delete method invoked");
      }
      System.out.println(table.toString());
    }
  }
}
