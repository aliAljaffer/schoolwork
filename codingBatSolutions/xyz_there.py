def xyz_there(str):
  try:
    idx = str.index("xyz")
    if str[idx-1] != ".":
      return True
    return xyz_there(str[idx+1:])
  except:
    return False
