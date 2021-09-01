// well seems like im not as lazy as I thought, optimized the previous solution for equalIsNot string-3 problem
public boolean equalIsNot(String str) {
  return (stringLookup(str,"is")==stringLookup(str,"not")); // return the comparison of the outcomes
}

public int stringLookup(String str, String toLookFor){
  int indexer = 0;
  int numOfOccurances=0;
  String partOfStr = "";
  while(indexer>=0){
  	indexer = str.indexOf(toLookFor.charAt(0)); // finds location of first char from toLookFor in str and stores it
  	if(indexer<0 || indexer+toLookFor.length()>str.length()){ // if < 0 then the char doesnt exist in str, if index+length of tolookfor exceeds str length then it shouldnt look for it
  	  break;
  	} else partOfStr = str.substring(indexer,indexer+toLookFor.length()); // partOfStr is a substring of str that starts at the indexer and ends at indexer+length of tolookfor
  	if(partOfStr.equals(toLookFor)){ // if partofstr is the same as the one we're looking for, increment numOfOccurances
  		numOfOccurances++;
  	}
  	str = str.substring(indexer+toLookFor.length()); // remake str into a substring that starts at the end of partOfStr, skipping the portion we checked previously
  }
  
  return numOfOccurances;
}
