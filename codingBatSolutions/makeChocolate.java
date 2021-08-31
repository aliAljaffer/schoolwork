// logic-2 problem
public int makeChocolate(int small, int big, int goal) {
  // we want to start iterating from i=big because we want to use up the "big" chocolates first, so we start at the top and work our way down to 0
  for(int i=big;i>=0;i--){
    for(int j=0;j<=small;j++){
      if((i*5 + j) == goal){
        // if the current i and j numbers add up to the total weight, return the small number j
        return j;
      }
    }
  }
  // reaching here meant that it wasnt possible to reach goal, therefor return -1 for unsolveable
  return -1;
}
