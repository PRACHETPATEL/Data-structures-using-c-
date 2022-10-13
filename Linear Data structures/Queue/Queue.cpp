#include<iostream>
using namespace std;
int size,front=-1,rear=-1;
int enqueue(int* a,int data)//enqueue means insertion in queue form front
{
        if(front==-1)
        {    
            front=0;  
        }
        if(rear==size-1)
        {
            cout<<"Queue Overflow"<<endl;
        }
        else
        {
            rear=rear+1;
            a[rear]=data;
        }
}
int dequeue(int* a)//dequeue means deletion in queue form front
{
    int value;
    if(front==-1 || front>rear)
    {
        cout<<"Queue UnderFlow";
    }
    else
    {
        value=a[front];    
        cout<<"Deleting "<<value<<" at "<<front<<" index in queue"<<endl;
        front=front+1;
    }
    return value;
}
void display(int* a)
{
    for (int i = front; i <=rear; i++)
    {
        cout<<a[i]<<" ";
    }
}
int main()
{
    cout<<"Enter maximum size of queue : ";
    cin>>size;
    int *queue=new int[size];
    int n,a=1,num,element;
    char ch;
    for(int i=0;i<a;i++)
    {
        cout<<"1.Insertion"<<endl<<"2.Deletion"<<endl<<"3.Display"<<endl<<"Choose any one number from above : ";
        cin>>n;
        switch(n)
        {
            case 1:
            cout<<"How many numbers you want to insert in queue? :";
            cin>>num;
            cout<<"Enter "<<num<<" element :"<<endl;
            for (int i = 0; i < num; i++)
            {
                cin>>element;
                enqueue(queue,element);
            }
            break;
            case 2:
            cout<<"How many numbers you want to delete from queue? :";
            cin>>num;
            cout<<"Enter "<<num<<" element :"<<endl;
            for (int i = 0; i < num; i++)
            {
                dequeue(queue);
            }
            break;
            case 3:
            display(queue);
            break;
            default:
            cout<<"wrong input"<<endl;
            break;
        }
        cout<<"\nDo you want to repeat?if yes type 'Y' else any key : ";
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