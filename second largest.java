class Solution {
    int print2largest(int arr[], int n) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else{
                continue;
            }
        }
        int[] array = new int[set.size()];
        int index = 0;
        for(int element: set){
            array[index]= element;
            index++;
        }
        if(array.length <2){
            return -1;
        }
        Arrays.sort(array);
        return array[array.length -2];
    }
}
