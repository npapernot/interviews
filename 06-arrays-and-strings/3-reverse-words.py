def reverse_words(s):
	s = s + " "
	result = ""
	word = ""
	for i in xrange (len(s)):
		if s[i] == " ":
			result = word + " " + result
			word = ""
		else:
			word = word + s[i]
	return result

print reverse_words("hello world this is written in reverse")
