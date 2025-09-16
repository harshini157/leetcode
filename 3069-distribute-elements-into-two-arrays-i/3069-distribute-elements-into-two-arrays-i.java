class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> set1=new ArrayList<>();
        List<Integer> set2=new ArrayList<>();
        set1.add(nums[0]);
        set2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(set1.get(set1.size()-1)>set2.get(set2.size()-1)){
                set1.add(nums[i]);
            }else{
            set2.add(nums[i]);
            }
        }
    
    int result[]=new int[nums.length];
    int index=0;
    for(int x:set1){
        result[index++]=x;
    }
    for(int y:set2){
        result[index++]=y;
    }
    return result;
}
}