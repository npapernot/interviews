import numpy as np

def non_repeated(s):
	n = len(s)
	characters = np.zeros(ord("z"))
	for i in xrange(n):
		characters[ord(s[i])] += 1
	for i in xrange(n):
		if characters[ord(s[i])] == 1:
			return s[i]
	return "All characters repeated at least once"

print non_repeated("aabubccdd")
