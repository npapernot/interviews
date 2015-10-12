import numpy as np
def binary_search(a, e, offset=0):
	# a is a sorted array
	# e is the element we want the index of
	# offset is the index offset used in the recurrence
	if len(a)>0:
		p = len(a)/2
		if a[p] == e:
			return offset + p 
		elif a[p] > e:
			return binary_search(a[0:p-1], e, offset)
		else:
			return binary_search(a[p+1:len(a)], e, offset + p + 1)
	else:
		return "Element not found"

print binary_search(np.asarray(xrange(20)), 4)
print binary_search(np.asarray(xrange(20)), 16)
print binary_search(np.asarray(xrange(20)), 25)
