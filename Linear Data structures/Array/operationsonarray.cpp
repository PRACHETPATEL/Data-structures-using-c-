#include<iostream>
using namespace std;
int size;
/*
There are total six operations that can be performed on array:
-Traversion
-Insertion
-Deletion
-Sorting
-Searching
-Reading/Display
*/
int insertat(int a[],int pos)//pos is position
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
int sort(int a[])
{
    char c;
    cout<<"What type of sort you want to apply? if accending then type 'A' else type 'D' : ";
    cin>>c;
    if (c=='a'||c=='A')
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = i+1; j <size; j++)
            {
                if (a[i]>a[j])
                {
                    swap(a[i],a[j]);
                }
            }
        }
    }
    else if (c=='d'||c=='D')
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = i+1; j <size; j++)
            {
                if (a[i]<a[j])
                {
                    swap(a[i],a[j]);
                }
            }
        }
    }
    else
    {
        cout<<"Invalid Input";
    }
    cout<<"Input 'Y' and then input 5 to display sorted array";
    return 0;
}
int find(int a[],int val)
{
    int b; 
    for (int i = 0; i < size; i++)
    {
        if(a[i]==val)
        {
            b=i;
            cout<<a[i]<<" is at "<<b<<" index in array";
        }
    }
    if (b<0||b>size)
    {
        cout<<"Value not found";
    }
    
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
    int array[size],n,p,a=1,element;//n used in switch case,p is to input position and a is for repeatation of switch case
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
            case 3:
            sort(array);
            break;
            case 4:
            cout<<"Enter the element to be searched in array : ";
            cin>>element;
            find(array,element);
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