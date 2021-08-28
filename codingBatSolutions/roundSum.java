// problem from logic-2
public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}
public int round10(int num){
  int lastDigit=0;
  do {
    lastDigit = num%10;
  }while(lastDigit>10);
  if(lastDigit>=5){
    return (10-lastDigit)+num;
  } else return num - lastDigit;
}
