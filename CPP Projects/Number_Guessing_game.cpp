#include <iostream>
#include <cstdlib> 
using namespace std;

int guess_the_number(int usr_num, int org_num)
{

    if (usr_num == org_num)
    {
        cout << "\nYour guess is right......Hurray!!!"<< endl;
        return 0;
    }

    else if (usr_num > org_num)
    {

        cout << "\nYour guess is bit high....give a another try."<< endl;

        if (org_num % 2 == 0 && usr_num %2!=0)
        {
            cout << "Hint:Number is Even"<< endl;
        }

        else if (org_num %5==0 && usr_num %5!=0){
            cout << "Hint:Number is a multiple of 5"<< endl;
        }

        else if (org_num %2 !=0  && usr_num %2==0)
        {
            cout << "Hint:Number is Odd" << endl;
        }
    }

    else if (usr_num < org_num)
    {

        cout << "\nYour guess is bit low....give a another try." << endl;

        if (org_num % 2 == 0 && usr_num %2!=0)
        {
            cout << "Hint:Number is Even" << endl;
        }

        else if (org_num %5==0  && usr_num %5!=0){
            cout << "Hint:Number is a multiple of 5"<< endl;
        }

        else if (org_num %2 !=0  && usr_num %2==0)
        {
            cout << "Hint:Number is Odd" << endl;
        }
    }
}





void menu()
{
    cout<<"\n-----------------------------------"<<endl;
    cout<<"\tNumber Guessing Game" << endl;
    cout<<"1.Play"<<endl;
    cout<<"2.Exit"<<endl;
     cout<<"-----------------------------------"<<endl;
}






int main()
{

    int start=1;
    int user_num , org_num;
    int ch , res;

    org_num=rand()%100;
 
    do {
        
         menu();
         cout<<"\nEnter your choice:";
         cin>>ch;

         switch (ch)
         {
         case 1:
            /* code */
            cout<<"\nEnter your guess(between 0-100):";
            cin>> user_num;

            res=guess_the_number(user_num , org_num);
            if (res==0){

                org_num=rand()%100;
                
                
            }
            break;
        case 2:
            cout << "\nClosing a  game......." <<endl;
            cout << "Thank you for playing.";
            start=0;
            break;
         
         default:
         cout<<"\nInvalid input...."<<endl;
            break;
         }


    }while (start==1);

   

    return 0;
}