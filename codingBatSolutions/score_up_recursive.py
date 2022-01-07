def scoreUp(key,answers):
  if not key: return 0
  if answers[0] == "?": return scoreUp(key[1:],answers[1:])
  if key[0] == answers[0]: return 4 + scoreUp(key[1:],answers[1:])
  return -1 + scoreUp(key[1:],answers[1:])
