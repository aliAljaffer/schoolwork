// Arrays-3 problem
public int countClumps(int[] nums) {
    int clumps = 0; // number of clumps
    boolean found = false; // refers to finding two matching, equal, adjacent numbers
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (!found && nums[i] == nums[j]) { // if numbers are equal and a match hasnt been found yet,
                                                // count 1 clump and declare found to be true
                found = true;
                clumps++;
            }
            if (found && nums[i] != nums[j]) { // if found and the numbers dont match, we set i = j because
                                               // we want to start looking for the next clump, and the position
                                               // where the next clump could be starting is at j.
                i = j;
                found = false;
            }
        }
    }
    return clumps;
}
