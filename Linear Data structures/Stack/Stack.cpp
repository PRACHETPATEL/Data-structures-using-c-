#include<iostream>
using namespace std;
int max=5;
int stack[5],top=-1;
//Implementing stack to reverse array
void push(int x)
{
    if (top==4)
    {
       cout<<"overflow";
    }
    else
    {
        top=top+1;
        stack[top]=x;
    }  
}
int pop()
{
    int val;
    if (top==-1)
    {
       cout<<"Underflow";
    }
    else
    {
        val=stack[top];
        top=top-1;
    }  
    return val;
}
int main()
{
    int arr[5]={1,2,3,4,5};
    for (int i = 0; i <5; i++)
    {
        push(arr[i]);
    }
    for (int i = 0; i <5; i++)
    {
        arr[i]=pop();
    }
     for (int i = 0; i <5; i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;
}