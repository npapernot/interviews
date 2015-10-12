import numpy as np

def permutations (s, used, res):
	if len(s) == 1:
		return s
	else:
		for i in xrange(len(s)):
			if not used[i]: 
				used[i] = 1 
				for perm in permutations(s, used, res):
					print str(perm) 
					res.append(s[i] + perm) 
				used[i] = 0
		return res

test_string = "hello"
print permutations(test_string, np.zeros(len(test_string)), [])
