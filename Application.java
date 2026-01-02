#!/usr/local/bin/java --source 11

import java.util.Arrays;

public class Addition
{
    public static void main(String[] args) {
        Integer sum = Arrays.stream(args)
          .mapToInt(Integer::parseInt)
          .sum(); 
#feature201 changes by Developer chandu for the module paymentgateway out2023
   class Main {
  public static void main(String[] args) {
    
    // create null, empty, and regular strings
    String str1 = null;
    String str2 = "";
    String str3 = "  ";

    // check if str1 is null or empty
    System.out.println("str1 is " + isNullEmpty(str1));

    // check if str2 is null or empty
    System.out.println("str2 is " + isNullEmpty(str2));

    // check if str3 is null or empty
    System.out.println("str3 is " + isNullEmpty(str3));
  }

  // method check if string is null or empty
  public static String isNullEmpty(String str) {

    // check if string is null
    if (str == null) {
      return "NULL";
    }

    // check if string is empty
    else if(str.isEmpty()){
      return "EMPTY";
    }

    else {
      return "neither NULL nor EMPTY";
    }
  }
}
#end of feature201 code

        System.out.println(sum);
    }
}