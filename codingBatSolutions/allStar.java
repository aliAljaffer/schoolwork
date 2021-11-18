// Recursion-1
// Hey now! you're an `allStar`
public String allStar(String str) {
  if(str.length() < 2) return str;
  return str.charAt(0) + "*" + allStar(str.substring(1));
}
