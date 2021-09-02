// string-3 hard problems
public int maxBlock(String str) {
  int blockCounter=1; // start at one
  int maxBlock=0;
  for(int i=0;i<str.length()-1;i++){
    if(str.charAt(i)==str.charAt(i+1)){
      blockCount++;
    } else blockCount=1; // resets when chars mismatch(thus breaking the "block")
    if(blockCount>maxBlock){
      maxBlock=blockCount;
    }
  }
  return maxBlock;
}
