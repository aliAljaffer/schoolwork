// Recursion-1
public int countAbc(String str) {
  if(str.length()<3) return 0;
  if(str.startsWith("aba") || str.startsWith("abc")) return 1 + countAbc(str.substring(1));
  return countAbc(str.substring(1));
}
