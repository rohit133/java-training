package Strings;


public class PushZero {
    static void push(int arr[], int len){
        int count = 0;
        for(int i=0;i<len;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        while(count<len){
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int len = arr.length;

        push(arr, len);

        for(int i=0;i<len;i++)
            System.out.print(arr[i] + " ");
    }
    
}
