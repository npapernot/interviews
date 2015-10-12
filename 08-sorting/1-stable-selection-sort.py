import numpy as np
import sys

def insert_data(array, original_ind, min_ind):
	assert original_ind < min_ind
	backup = array[min_ind]
	for i in xrange(min_ind - original_ind):
		print array
		print backup
		array[min_ind - i] = array[min_ind - i - 1]
	array[original_ind] = backup	
	print array
	return array

def stable_selection_sort (array):
	for i in xrange(len(array)-1):
		print "****"
		print array
		print i
		min_ind = i
		min_val = array[i] 
		for j in xrange(i+1,len(array)):
			if array[j] < min_val:
				min_ind = j
				min_val = array[j]
		print min_ind
		if not min_ind == i:
			insert_data(array, i, min_ind)
	return array

print stable_selection_sort(np.random.randint(20, size=5))
