import numpy as np

#swap 2 elements i and j in array a
def swap(a,i,j): 
	temp = a[j]
	a[j] = a[i]
	a[i] = temp
	return a

def optimized_quicksort(a,left,right):
	i = left
	j = right
	p = (left+right)/2
	
	while i <= j:
		while a[i] < a[p]:
			i += 1
		while a[j] > a[p]:
			j -= 1
		if i <= j:
			swap(a,i,j)
			i += 1
			j -= 1
	if left < j:
		optimized_quicksort(a, left, j)
	if right > i:
		optimized_quicksort(a, i, right)

	return a


print optimized_quicksort(np.random.randint(100, size=10), 0, 9)
