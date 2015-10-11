class point():
	def __init__(self, x=0, y=0):
		self.x = x
		self.y = y

class rectangle():
	def __init__(self, ul, lr):
		self.ul = ul
		self.lr = lr

def overlap(r1, r2):
	if r1.ul.y < r2.lr.y:
		return false
	elif r1.lr.x < r2.ul.x:
		return false
	elif r1.lr.y > r2.ul.y:
		return false
	elif r1.ul.x > r2.lr.x: 
		return false
	else:
		return true
