def has22(nums):
  if len(nums) < 2: return False
  if nums[0] == 2 and nums[1] == 2: return True
  return has22(nums[1:])
