class Solution {
    public int maxProduct(int[] nums) {
     int SMax = -1;
     int Max = -1;   
     for(int i=0;i<nums.length;i++){
        if(Max<nums[i]){
            SMax = Max;
            Max = nums[i];
     }
            else if(SMax<nums[i]){
                SMax = nums[i];
            }
    }
    int ans = (Max-1)*(SMax-1);
    return ans;
            }
        
     }
    
