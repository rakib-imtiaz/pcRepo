#playing with decorators
#decorators can change behaviour of an existing function at compile time

#here im defining a function which will be printing some range of number in ascednign order but the condition is (start<end)
#or else the function will not work
def count_n_to_n(start,end):
    for x in range(start,end+1):
        print(x,end=" ")


#now im going to create a fucntiom decorator to make the fucntion work if (start<end) is false
# so if start> end the improved function will be swapping start with end and will make it work


#it will work
#count_n_to_n(12,20)
# 12 13 14 15 16 17 18 19 20

#but it wont work
#count_n_to_n(20,12)


#creating a decorator for adding extra features in the existing function

def improved_count_n_to_n(func):

    def inner(start,end):
        if(start>end):
            start,end=end,start
        return func(start,end)
    return inner


count_n_to_n=improved_count_n_to_n(count_n_to_n)


#now its working

#count_n_to_n(20,12)


#
# if __name__=="__main__":
#     main()






