// String-3 
public String withoutString(String base, String remove) {
  if (base.length() < remove.length())
      return base;
    String hey = base.substring(0, remove.length());
    if (hey.equalsIgnoreCase(remove)) {
      return withoutString(base.substring(remove.length()), remove);
    }
    return hey.charAt(0) + withoutString(base.substring(1), remove);
}
