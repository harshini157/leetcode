class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
     List<Integer> set1=new ArrayList<>();
     List<Integer> set2=new ArrayList<>() ;
     for(int num:nums1){
        set1.add(num);
     }
     for(int num:nums2){
        set2.add(num);
     }
     int count1=0;
     for(int num:set1)
     if(set2.contains(num)){
        count1++;
     }
     int count2=0;
     for(int num:set2)
     if(set1.contains(num)){
        count2++;
     }
     return new int[]{count1,count2};
    }
}