package day2;

public class p8
{
    public  static void main(String[] args)
    {
        int[] arr = {10, 20 , 50 , 90 , 23 };

        int max = 0;

        for(int i = 0 ; i< arr.length ; i++)
        {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("largest element in array = " + max);
    }
}
