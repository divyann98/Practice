package Java;

public class Q4
{
    //Given an array [3, -1, 14, 16, 0, 2] find the total sum of the highest value and avg value of an array.
    //Ex - Highest value - 16 and average of values - 5.6, total Sum = 21.6
    public static void main(String[] args)
    {
        int[] a1 = {3, -1, 14, 16, 0, 2};
        int sum = 0;
        double avg = 0;
        int max=0;
        double maxSum=0;
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]>max)
                max=a1[i];

            sum=sum+a1[i];

        }
        avg=(double) sum/a1.length;
        maxSum=max+avg;
        System.out.println("The highest value is : "+max);
        System.out.println("The total average is : "+avg);
        System.out.println("The total sum is : "+maxSum);
    }
}
