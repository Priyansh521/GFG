class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int flag = 0;
        Arrays.sort(arr);
        ArrayList<Integer> a = new ArrayList<>();
        int prev = -2;
        for(int i = 0; i<n-1; i++){
            if(arr[i] == arr[i+1] && arr[i] !=prev){
                a.add(arr[i]);
                prev = arr[i+1];
                i++;
                flag = 1;
            }
        }
        if(flag == 0){
            a.add(-1);
            return a;
        }
        return a;
    }
}
