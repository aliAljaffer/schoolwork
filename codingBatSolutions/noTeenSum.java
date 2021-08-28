// problem from logic-2
public int noTeenSum(int a, int b, int c) {
  return fixTeen(a) + fixTeen(b) + fixTeen(c); // call fixTeen on all ints
}

public int fixTeen(int n){
  if((n == 15 || n == 16) || (n<13 || n>19)){ 
    // we only want to count numbers outside of the range [13,19] unless those numbers are 15 or 16. Thus we combine both those facts into one method
    return n;
  } else return 0;
}
