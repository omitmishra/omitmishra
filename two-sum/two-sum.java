class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int nt=target-nums[i];
            if(map.containsKey(nt)){
                return new int[]{map.get(nt),i};
            }
            map.put(nums[i],i);
        }
        return null;
  
    }
}