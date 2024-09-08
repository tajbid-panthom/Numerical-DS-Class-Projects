def f(x):
    return (pow(x, 2) - 4 * x - 10)

x1 = float(input("Enter the value of x1: "))
x2 = float(input("Enter the value of x2: "))
n = int(input("Enter the number of iterations: "))
x0 = 0

for i in range(n):
    x0 = (x1 + x2) / 2
    if f(x0) == 0:
        break
    elif f(x0) * f(x1) < 0:
        x2 = x0
    else:  
        x1 = x0

print(f"The root is approximately: {x0}")
