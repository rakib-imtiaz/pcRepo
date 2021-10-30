
num1 = (int)(input("Enter first number: "))

num2 = (int)(input("Enter second number: "))

flag=True
while (flag):
    operator = (input("Enter operator to perform operation : "))

    if (operator == "+"):
        print("Addition is : ", num1 + num2)
    elif (operator == "-"):
        print("Subtraction is : ", num1 - num2)
    elif (operator == "*"):
        print("Multiplication is : ", num1 * num2)
    elif (operator == "/"):
        print("Division is : ", num1 / num2)
    else:
        print("Invalid operator,program closed!!!")
        flag=False




