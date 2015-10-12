import numpy as np

class employee():
	def __init__(self, ext=0, given="", sur=""):
		self.extension = ext
		self.givenname = given
		self.surname = sur

def insert_data(array, original_ind, min_ind):
        assert original_ind < min_ind
        backup = array[min_ind]
        for i in xrange(min_ind - original_ind):
                array[min_ind - i] = array[min_ind - i - 1]
        array[original_ind] = backup
        return array

def multi_key(array):
	for i in xrange(len(array) - 1):
		min_ind = i
                min_val = array[i].givenname
                for j in xrange(i+1,len(array)):
                        if array[j].givenname < min_val:
                                min_ind = j
                                min_val = array[j].givenname
		if not min_ind == i:
			insert_data(array, i, min_ind)
	for i in xrange(len(array) - 1):
		min_ind = i
                min_val = array[i].surname
                for j in xrange(i+1,len(array)):
                        if array[j].surname < min_val:
                                min_ind = j
                                min_val = array[j].surname
                if not min_ind == i:
			insert_data(array, i, min_ind)
        return array

e1 = employee(ext=3432, given="aaaa", sur="bbbb")
e2 = employee(ext=5433, given="bbbb", sur="bbbb")
e3 = employee(ext=5432, given="grev", sur="itjrtre")
e4 = employee(ext=3423, given="arer", sur="hbver")

array = np.asarray([e2,e1,e3,e4])

for e in multi_key(array):
	print e.surname + " " + e.givenname + " " + str(e.extension)
