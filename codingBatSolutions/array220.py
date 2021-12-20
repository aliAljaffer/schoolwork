def array220(nums, idx):
    if len(nums) < 2 or idx > len(nums)-2:
        return False
    if nums[idx+1] == (10*nums[idx]):
        return True
    return array220(nums, idx+1)
