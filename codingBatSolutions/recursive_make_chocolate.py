# note that this will not work on codingbat due to their memory restrictions, but is neat and understandable
# this is a recursive solution for the problem
def make_chocolate(small, big, goal):
  if small >= goal: return goal
  if big < 1 and goal > 0: return -1
  return make_chocolate(small, big-1, goal-5)
