package Java;

import java.util.*;

public class Q3
{
    //Inputs -> s=“heyaa”
    //Output -> heyb
    //Inputs -> S = “bababa”
    //Output : cc
    public static void main(String[] args)
    {
        String s1 = "bababa";

        Map<Character,Integer> map = new LinkedHashMap<>();
        String newS = "";
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            if (map.containsKey(ch))
            {
                int value = map.get(ch);
                value++;
                map.put(ch,value);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
            char ch = entry.getKey();
            int val= entry.getValue();
            if(val>1)
            {
                newS = newS+(char)('a'+val-1);

            }
            else
            {
                newS+=ch;
            }
        }
        System.out.println(newS);

        }


    }

