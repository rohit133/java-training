package DSA.searching;

public class BinarySearch {

    int search(int arr[], int x){
        int l= 0, r = arr.length-1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(arr[mid]==x)
                return mid;

            if(arr[mid]<x)
                l = mid+1;
            else
                r = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = ob.search(arr, x);
        if (result == -1)
            System.out.println("Not Present");
        else
            System.out.println(result);
    }
    
}


// Time Complexity
    // -> O(Log N) becasue it repeatedly dividing the search interval in half. 
