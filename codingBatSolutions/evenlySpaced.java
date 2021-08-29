// problem solution from logic-2
public boolean evenlySpaced(int a, int b, int c) {
  int maxOfThree = Math.max(a, Math.max(b,c)); // find max of all 3, maxValue
  int maxOfTwo = Math.max(b,c); // find max of 2, midValue
  int minOfThree = Math.min(a, Math.min(b,c)); // find the minimum of all 3, minValue
  if(maxOfThree == maxOfTwo){ // if maxOfThree is the same as maxOfTwo, we may have overlapped. i.e. if b was the max in the input [2,4,0] then we had compared 4 twice.
    maxOfTwo = Math.max(a,b); // we instead compare a->b instead of b->c in the original maxOfTwo
    if(maxOfThree == maxOfTwo){ // if its STILL the same, we compare a->c instead of a->b
      maxOfTwo = Math.max(a,c);
    }
  }
  return maxOfThree - maxOfTwo == maxOfTwo - minOfThree; // dont need Math.abs() here because maxOfThree>maxOfTwo && maxOfTwo > minOfThree 
}
