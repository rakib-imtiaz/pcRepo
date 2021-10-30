class computer:

    # its like constructor
    def __init__(self, cpu, ram):
        self.cpu = cpu
        self.ram = ram

    def config(self):
        print(" this i5 machine", self.cpu, self.ram)


comp1 = computer("i5", 16)

print(comp1)
