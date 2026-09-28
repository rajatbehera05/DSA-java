import java.util.Arrays;
public class Bubble{
    public static void main(String[] args){
        int[] arr={10,40,20,50,30};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
          
        }
        System.out.println("the sorted array is :"+ Arrays.toString(arr));

    }
}