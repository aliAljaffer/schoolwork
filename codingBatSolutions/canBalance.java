public boolean canBalance(int[] nums) {
  if(nums.length<2) return false; // an array with less than 2 numbers cant be balanced
  int sumRight = 0; // keep track of right side sum
  for(int i=nums.length-1;i>=0;i--){ // right side starts at the last element, and goes down the array
    sumRight += nums[i]; // with every iteration where left != right, we add one more element to the right side
    int sumLeft = 0; // sumLeft is reset to zero because when we add one element to the right side, we lose one element from the left
    for(int j=0;j<i;j++){ // loop upto ith element, exclusive
      sumLeft += nums[j]; // add up the left side elements
    }
    if(sumRight == sumLeft) return true; // check if equal for solution. if not equal, we dont want to return false immediately. go back to the loop and add another element to the right side
  }
  return false; // if we get to this point without returning true, then its not possible.
}
