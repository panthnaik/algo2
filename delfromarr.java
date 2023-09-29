package dsa;
// removing the element from the array when element to be removed is poassed by creating new 
// array and placing that element which is not same as tht passed element 
import java.util.Arrays;

public class del_from_array{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6};
        int newarr[]=remove(arr,3);
        System.out.println("Original array: "+Arrays.toString(arr));

        System.out.println("removed array: "+Arrays.toString(newarr));
        
    }
    public static int[] remove(int arr[],int ele){
        int newarr[]=new int[arr.length-1];
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=ele){
                newarr[ind++]=arr[i];
            }
        }

        return newarr;

    }
}
