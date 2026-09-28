

class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums==null) return false;
        int size = java.lang.reflect.Array.getLength(nums);
        if (size == 0 || size == 1) return false;

        Map<Integer, Integer> map = new HashMap<>();


        for (int i=0;i<size;i++){
            Integer i1 = map.get(nums[i]);
            if (i1 == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], ++i1);
            }
        }

        for (var entry : map.entrySet()){
            System.out.println(" k:"+entry.getKey()+" v:"+ entry.getValue());
            if(entry.getValue()>1) return true;
        }

        return false;
    }
}