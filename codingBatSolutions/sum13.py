def sum13(nums):
  if not nums: return 0
  if nums[0] == 13: return sum13(nums[2:])
  return nums[0] + sum13(nums[1:])
