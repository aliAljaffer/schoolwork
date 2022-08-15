public String withoutString(String base, String remove){
    String afterRemoval = "";
    for (int i = 0; i < base.length(); i++) {
      String removeCandidate = "";
      if (i + remove.length() > base.length()) { // if index + remove length overflows, add remaining substring
        afterRemoval+= base.substring(i);
        break;
      }
      // move index on string looking for remove
      removeCandidate = base.substring(i, i + remove.length());
      if (!remove.equalsIgnoreCase(removeCandidate)) {
        afterRemoval += removeCandidate.charAt(0);
      } else i += removeCandidate.length() - 1;
    }
    return afterRemoval;
}
