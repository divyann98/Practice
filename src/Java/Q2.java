package Java;

import java.util.HashMap;
import java.util.Map;

public class Q2 {

//    Input: s = "10#11#12"
//    Output: "jkab"
//    Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".


    public static void main(String[] args)
        {
            String s= "10#11#12";

            String[] splitedArray=s.split("#");

            for(int i=0;i<splitedArray.length;i++)
            {
               int value = Integer.parseInt(splitedArray[i]);
               char c = (char)('a'+value-1);
                System.out.println(c);

            }


        }


    }

