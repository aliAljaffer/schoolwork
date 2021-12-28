def sum67(nums):
  sum = 0
  go = True
  for x in nums:
    if x == 6:
      go = False
      continue
    if x==7 and not go:
      go = True
      continue
    if go: sum+=x
  return sum
