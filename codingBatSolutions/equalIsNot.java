// hard string problems string-3
// this is inefficient because it looks at every string with the same length as the one we're looking for
// can optimize this better using indexOf(), but im lazy

public boolean equalIsNot(String str) {
  return (stringLookup(str,"is")==stringLookup(str,"not")); // return the comparison of the outcomes
}
// a method to call instead of making 2 for-loops
public int stringLookup(String str, String toLookFor){
  int numOfOccurance=0; // counts the occurances of the string we're looking for
  for(int i=0;i<str.length()-toLookFor.length()+1;i++){ 
  // this is a mouthful. (str.length()-toLookFor.length()+1) is so we dont go out of bounds, limiting our search to the length of the toLookFor string
    String newStr = str.substring(i,i+toLookFor.length()); // newStr is a substring of str with the same length as toLookFor
    if(newStr.equals(toLookFor)){ // we make newStr and compare it to toLookFor
      numOfOccurance++; // increment occurances
    }
  }
  return numOfOccurance; // return occurances
}
