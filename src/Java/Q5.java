package Java;

public class Q5
{
    //Given a String - Hello22Hello1, replace all the numeric values with alphabets of the respective order
    //Ex - HellobbHelloa
    public static void main(String[] args)
    {
        String str = "Hello22Hello1";
        String newString="";
        for(int i=0;i<str.length();i++)
        {

            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {

                int ascii =  Integer.parseInt(String.valueOf(ch));
                newString = newString+(char)('a'+ascii-1);


            }
            else
            {
                newString=newString+ch;
            }
        }
        System.out.println(newString);
    }
}
