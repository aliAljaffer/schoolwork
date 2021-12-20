# the long way
def lucky_sum(a, b, c):
  nums = [a,b,c]
  sum = 0
  try:
    for i in range(nums.index(13)):
      sum+=nums[i]
    return sum
  except:
    return a + b + c
