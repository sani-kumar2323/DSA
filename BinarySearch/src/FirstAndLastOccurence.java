public class FirstAndLastOccurence {
    public static void main(String[] args){
        int arr[] = {2, 2, 2, 2, 2, 2, 3, 3 ,4 ,5, 6, 7, 7, 8};
        int res = FirstOccurence(arr,3);
        System.out.println("First Occurence is at index :"+res);

        int res1 = LastOccurence(arr,2);
        System.out.println("Last Occurence is at index :"+res1);
 }
    public static int FirstOccurence(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static int LastOccurence(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                start = mid+1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}
