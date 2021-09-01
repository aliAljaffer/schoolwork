// array-3 hard problems
public int maxSpan(int[] nums) {
  int firstSpan = 0;
  // i starts at the end, and works its way back comparing to the [first] element. 
  // this makes it easy to find the maxSpan from first element to last, since the first match is the max
  for(int i=nums.length-1;i>-1;i--){
    for(int j=0;j<nums.length;j++){
      if(nums[i]==nums[j]){
        firstSpan = nums.length-i-1;
      }
    }
  }
  int secondSpan = 0;
  // this time i starts from the beginning and compares to the [last] element in the array
  for(int i=0;i<nums.length;i++){
    for(int j=nums.length-1;j>-1;j--){
      if(nums[j]==nums[i]){
        secondSpan = nums.length-j;
      }
    }
  }
  // sees which span was the highest, returns it
  return (secondSpan > firstSpan) ? secondSpan : firstSpan;
}
