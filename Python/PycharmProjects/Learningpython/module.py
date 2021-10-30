import  datetime as  date


print()
fetch=date.date.today()


c=str(fetch)

print(c[9])

class computer:

    # its like constructor
    def __init__(self, cpu, ram):
        self.cpu = cpu
        self.ram = ram

    def config(self):
        print(" this i5 machine", self.cpu, self.ram)


comp1 = computer("i5", 16)

print("CPU is intel ",comp1.cpu)
print("it has ",comp1.ram,"ram")
