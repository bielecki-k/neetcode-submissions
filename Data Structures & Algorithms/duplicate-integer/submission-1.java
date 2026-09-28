

class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums==null) return false;
        if (nums.length == 0 || nums.length == 1) return false;

        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0;i<nums.length;i++){
            Integer i1 = map.get(nums[i]);
            if (i1 == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], ++i1);
            }
        }

        for (var entry : map.entrySet()){
            if(entry.getValue()>1) return true;
        }

        return false;
    }
}