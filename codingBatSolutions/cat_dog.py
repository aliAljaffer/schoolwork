def cat_dog(str):
  cat, dog = 0,0
  for x in range(len(str)):
    if str[x:x+3] == "cat": cat+=1
    if str[x:x+3] == "dog": dog+=1
  return dog == cat
