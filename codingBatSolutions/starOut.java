// recursive solution for starOut in String 2 section.
public static String starOut(String str) {
  // base case where we start out with a small string with a star present
  // also case where star is at the end of the string like string* or string*y
  if(str.length()<3 && str.indexOf('*')>-1) return "";
  // base case for normal string with no star
  if(str.length()<2) return str;
  // if we are at a star that is followed by another star. skip one position, that way we turn this case into the next case below it to be dealt with
  if(str.charAt(0)=='*' && str.charAt(1) == '*') return starOut(str.substring(1));
  // case where we are AT the star, skip 2 positions
  if(str.charAt(0) == '*') return starOut(str.substring(2));
  // case where next is star, followed by another, skip 2
  if(str.charAt(1) == '*' && str.charAt(2) == '*') return starOut(str.substring(2));
  // case where next is star, skip 3. (if next is star, we exclude current + star + whats after star, thats why we skip 3)
  if(str.charAt(1) == '*') return starOut(str.substring(3));
  // case where current isnt star and neither is next
  return str.charAt(0) +""+ starOut(str.substring(1));
}
