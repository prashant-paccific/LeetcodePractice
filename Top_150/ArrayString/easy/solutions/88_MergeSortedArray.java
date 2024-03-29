public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=n+m-1;
        while(j>=0 && i>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            } else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
    public static void main(String args[]){
        int[] nums1 = [0],  nums2 = [1];
        int m = 0,n = 1;
        merge(nums1,nums2,m,n);

    }
}