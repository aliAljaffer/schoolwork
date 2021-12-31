def count_hi(str):
  if len(str)<2:
    return 0
  if str[0:2] == "hi":
    return 1 + count_hi(str[2:])
  return count_hi(str[1:])
