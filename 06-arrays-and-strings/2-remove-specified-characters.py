import numpy as np

def remove_chars(s,chars):
	characters = np.zeros(ord("z"))
	for i in xrange(len(chars)):
		characters[ord(chars[i])] += 1
	processed = ""
	while s != "":
		if characters[ord(s[0])] == 1:
			s = s[1:]
		else:
			processed = processed + s[0]
			s = s[1:]
	return processed

print remove_chars("hello world!", "eo")
