def getCharKey (k,p):
	k =int(k)
	if k==1:
		return 1
	elif k==0:
		return 0
	elif k==2:
		if p == 1:
			return "A"
		elif p == 2: 
			return "B"
		else:
			return "C"
	elif k==3:	
		if p==1:	
			return "D"
		elif p==2:
			return "E"
		else:
			return "F"
	elif k==4:
		if p==1:
			return "G"

		elif p==2:
			return "H"
		else:
			return "G"
	elif k==5:
		if p==1:
			return "J"
		elif p==2:
			return "K"
		else:
			return "L"
	elif k==6:
		if p==1:
			return "M"
		elif p==2:
			return "N"
		else:
			return "O"
	elif k==7:
		if p==1:
			return "P"
		elif p==2:
			return "R"
		else:
			return "S"
	elif k==8:
		if p==1:
			return "T"
		elif p==2:
			return "U"
		else:
			return "V"
	elif k==9:
		if p==1:
			return "W"
		elif p==2:
			return "X"
		else:
			return "Y"

def telephone_words(tel):
	result = []
	if len(tel) == 1:
		return [str(getCharKey(tel[0],1)), str(getCharKey(tel[0],2)), str(getCharKey(tel[0],3))]	
	else:
		for r in telephone_words(tel[1:]):
			for p in xrange(1,4):
				result.append(str(getCharKey(tel[0],p)) + r)
	return list(set(result)) #remove duplicates caused by multiple 0s and 1s
		
print telephone_words("123")
