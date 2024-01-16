#include <iostream>
using namespace std;

class Calculator
{

protected:
    int x, y, res;

public:
    void get_input()
    {
        cout << "Enter first number:";
        cin >> x;
        cout << "Enter second number:";
        cin >> y;
    }
};

class operations : public Calculator
{
public:
    void add()
    {

        res = x + y;
        cout << "\nSum is:" << res << endl;
    }
    void sub()
    {

        res = x - y;
        cout << "\nResult is:" << res << endl;
    }
    void product()
    {

        res = x * y;
        cout << "\nResult is:" << res << endl;
    }
    void division()
    {

        if (y == 0)
        {
            cout << "\nCannot divide by zero....\n";
        }
        else
        {
            res = x / y;
            cout << "Result is:" << res << endl;
        }
    }
};

void menu()
{

    cout << "\n\tBasic Calculator \n";
    cout << "________________________________________\n";
    cout << "1>Addition\n";
    cout << "2>Subtraction\n";
    cout << "3>Multiplication\n";
    cout << "4>Division\n";
    cout << "5>Exit\n";
    cout << "-----------------------------------------\n";
}
int main()
{
    operations task;
    int ch;
    do
    {
        menu();
        cout << "Enter your choice:";
        cin >> ch;
        if (ch == 1)
        {
            task.get_input();
            task.add();
        }
        else if (ch == 2)
        {
            task.get_input();
            task.sub();
        }
        else if (ch == 3)
        {
            task.get_input();
            task.product();
        }
        else if (ch == 4)
        {
            task.get_input();
            task.division();
        }
        else if (ch == 5)
        {
            cout << "\nExiting program....\n";
        }
        else
        {
            cout << "\ninvalid input.....\n";
        }
    } while (ch != 5);

    return 0;
}
