class Solution{
    //Function to find the leaders in the array.
     public static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int max_element = Integer.MIN_VALUE;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = n-1;i>=0;i--){
            if(max_element<=arr[i]){
                a.add(arr[i]);
                max_element = arr[i];
            }
        }
        Collections.reverse(a);
        return a;
    }
}
