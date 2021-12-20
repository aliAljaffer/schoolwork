def noX(str):
    if len(str) == 0:
        return str
    if str[0] == 'x':
        return noX(str[1:])
    return str[0] + noX(str[1:])
