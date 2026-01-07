class Solution {
    public int[] shuffle(int[] nums, int n) {
     int[] ele =new int[2*n];
     for(int i=0;i<n;i++){
        ele[2*i]=nums[i];
        ele[2*i+1]=nums[i+n];
     }   
     return ele;
    }
}