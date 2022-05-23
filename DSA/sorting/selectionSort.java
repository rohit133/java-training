package DSA.sorting;

public class selectionSort {

    void sort(int arr[]){
        int len = arr.length;

        for(int i=0; i<len-1; i++){
           int min_index = i;
           for (int j= i+1; j<len; j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
           }

           int temp = arr[min_index];
           arr[min_index] = arr[i];
           arr[i] = temp;
        }
    }
    

    // Printing the sorted Array
    void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       int arr[] = {65,23,55,11,56,26};
       selectionSort ob = new selectionSort();
       ob.sort(arr);
       ob.print(arr);
       
    }
    
}


// Time Complexity = O(n²)
    // -> O(n) for the first Loop 
    // -> O(n) for the second Loop 
    // -> O(n) * O(n) = O(n * n) => O(n²)


// Space Complexity = O(1) / O(n)