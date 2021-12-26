def make_chocolate(small, big, goal):
  for x in range(big,-1,-1):
    for y in range(small,-1,-1):
      if x*5 + y == goal:
        return y
  return -1
