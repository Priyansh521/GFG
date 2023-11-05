class Solution {
    public static int equilibriumPoint(long arr[], int n) {
          long left_sum = 0;
          long total = 0;
          for(int i = 0; i<arr.length; i++){
              total += arr[i];
          }
          for(int i= 0; i<arr.length; i++){
              long right_sum = total - (left_sum + arr[i]);
              if(right_sum == left_sum){
                  return i+1;
              }
              left_sum += arr[i];
          }
          return -1;
        
    }
}
