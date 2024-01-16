#include <bits/stdc++.h>

using namespace std;

vector<int> snos;
vector<string> tasks;
vector<string> status;

void add_task(int sno, string task)
{
    snos.push_back(sno);
    tasks.push_back(task);
    status.push_back("Pending");
}

void is_completed()
{
    char c;
    int sno;
    cout << "\nDo you want to change status of task?(Y/N):";
    cin >> c;

    switch (c)
    {
    case 'Y':

        cout << "\nEnter task number   whose status you want to change:";
        cin >> sno;

        if (sno <= tasks.size()   && sno>0)
        {
            status[sno - 1] = "Completed";
            cout << "\nStatus has been changed successfully...";
        }

        else
        {

            cout << "\nNo such task exist" << endl;
        }
        break;
    case 'N':

        return;

        break;
    default:
        cout << "\nInvalid input!!" << endl;
        break;
    }
}

void show_tasks()
{
    if (tasks.size() == 0)
    {

        cout << " \nNo tasks available" << endl;
    }

    else
    {
        cout << "------------------------------------------" << endl;
        cout << "Sno\tTasks\t  Status    " << endl;
        cout << "-----------------------------------------" << endl;
        for (int i = 0; i != tasks.size(); i++)
            cout << snos[i] << "\t" << tasks[i] << "\t  " << status[i] << endl;
        cout << "------------------------------------------" << endl;

         is_completed();
    }


   
}

void del_task(int sno)
{

    if (sno > tasks.size())
    {

        cout << "\nNo such task exist";
    }

    else
    {
        tasks.erase(tasks.begin() + sno - 1);
        snos.pop_back();
        status.erase(status.begin() + sno - 1);
        cout << "Task has been deleted successfully....";
    }
}

void menu()
{
    cout << "\n\n----------------------------\n";
    cout << "\tTO-DO List" << endl;
    cout << "1.Add a new task" << endl;
    cout << "2.Show Tasks" << endl;
    cout << "3.Delete  Task" << endl;
    cout << "4.Exit" << endl;
    cout << "----------------------------\n";
}

int main()
{

    int start = 1;
    int ch;
    int sno = 1;
    string task;

    do
    {

        menu();
        cout << "\nEnter your choice:";
        cin >> ch;

        switch (ch)
        {
        case 1:

            cout << "\nEnter your task:";
            cin >> task;
            add_task(sno, task);
            sno++;

            cout << "\nTask has been added successfully ...." << endl;

            break;

        case 2:

            show_tasks();

            break;

        case 3:
            int d_sno;
            cout << "\nEnter task number you want to delete:";
            cin >> d_sno;
            del_task(d_sno);

            break;
        case 4:

            cout << "\nExiting a program...." << endl;
            start = 0;

            break;

        default:

            cout << "\nInvalid input....." << endl;
            break;
        }

    } while (start == 1);

    return 0;
}