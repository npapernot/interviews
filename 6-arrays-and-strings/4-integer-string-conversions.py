def str_2_int(s):
	sign = 1
	result = 0
	if s[0] == "-":
		sign = -1
	else:
		result += int(s[0])
	for i in xrange(1, len(s)):
		result += pow(10,i) * int(s[i])
	return result * sign 


print str_2_int("-245")
print str_2_int("0")
print str_2_int("854930")
