#include<iostream>
using namespace std;
int size;
int insertat(int a[],int pos)//sz is size and pos is position
{
    size++;
    for (int i = size; i>=pos; i--)
    {
        a[i]=a[i-1];
    }
    pos--;
    cout<<"\nInsert an element at "<<pos<<" index in array :";
    cin>>a[pos];
    return 0;
}
int deleteat(int a[],int pos)
{
    pos--;
    for (int i =pos; i<size; i++)
    {
        a[i]=a[i+1];
    }
    size--;
    return 0;
}
int sortasc()
{
    return 0;
}
int find(int val)
{
    return 0;   
}
void display(int a[])
{
    for (int i = 0; i < size; i++)
    {
        cout<<a[i]<<" ";
    }
}
int main()
{
    int array[size],n,p,a=1;
    cout<<"Enter size of the array : ";
    cin>>size;
    cout<<"Input elements of array :"<<endl;
    for(int i=0;i<size;i++)
    {
        cin>>array[i];
    }
    char ch;
    for (int i = 0; i<a; i++)
    {
        cout<<"\n1.Insetion"<<endl<<"2.Deletion"<<endl<<"3.Sort"<<endl<<"4.Search"<<endl<<"5.Diaplay"<<endl<<"Choose any one number from above: ";
        cin>>n;
        switch(n)
        {
            case 1:
            cout<<"Enter positon to insert in array:";
            cin>>p;
            insertat(array,p);
            break;
            case 2:
            cout<<"Enter positon to detete in array:";
            cin>>p;
            deleteat(array,p);
            break;
            case 5:
            display(array);
            break;
            default:
            cout<<"Wrong number selected";
            break;
        }
        cout<<"\nDo you want to repeat?if yes type 'Y' else 'N' : ";
        cin>>ch;
        if(ch=='y'||ch=='Y')
        {
            a++;
        }
        else
        break;
    }
    return 0;
}