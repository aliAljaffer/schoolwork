// Recursion-1 problem
public boolean strCopies(String str, String sub, int n) {
  if(n<1) return true;
  if(str.length()<sub.length()) return false;
  String smallerChunk = str.substring(0,sub.length());
  if(smallerChunk.equals(sub)){
    return strCopies(str.substring(1), sub, n-1);
  }
  return strCopies(str.substring(1),sub,n);
}
