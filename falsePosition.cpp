#include <iostream>
#include <math.h>
using namespace std;

float f(float x)
{
    return (pow(x, 2) - x - 2);
}

int main()
{
    float x1, x2, x0;
    cout << "Enter x1 and X2: " << endl;
    cin >> x1 >> x2;
    int n;
    cout << "Enter the number of iteration: ";
    cin >> n;

    while (n--)
    {
        x0 = x1 - ((f(x1) * (x2 - x1)) / (f(x2) - f(x1)));
        if (f(x0) == 0)
        {
            break;
        }
        else if (f(x0) * f(x1) < 0)
        {
            x2 = x0;
        }
        else
        {
            x1 = x0;
        }
        cout << "Aproximate answer X0: " << n << x0 << endl;
        // cout << "Aproximate answer X2: " << x2 << endl;
    }
}