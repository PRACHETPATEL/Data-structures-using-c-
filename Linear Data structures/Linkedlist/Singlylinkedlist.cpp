#include<iostream>
using namespace std; 
//Singly Linked list
class linkedlist;
class node
{
    public:
    int data;
    node *next;
    friend class linkedlist;
};
//Insertion Functions
class linkedlist
{
    public:
    void push_front(node **head,int info)
    {
        node *new_node=new node();
        new_node->data=info;
        if(*head==NULL)
        {
            new_node->next=NULL;
            *head=new_node;
        }
        else
        {
            new_node->next=*head;
            *head=new_node;
        }
    }
    void push_after(node *prev,int info,int i)
    {
        //prev is head
        node *new_node=new node();
        new_node->data=info;
        //node *last=*head;
        if(prev==NULL)
        {
            new_node->next=NULL;
            prev=new_node;
        }
        else
        {
            while(i-1!=0)
            {
                prev=prev->next;
                i--;
            }
            new_node->next=prev->next;
            prev->next=new_node;
        }
    }
    void push_before(node *prev,int info,int i)
    {
        //prev is head
        node *new_node=new node();
        new_node->data=info;
        node *last=prev;
        if(prev==NULL)
        {
            new_node->next=NULL;
            prev=new_node;
        }
        else
        {
            if (i>1)
            {
                while(i-1!=0)
                {
                    prev=prev->next;
                    i--;
                }
                while (last->next!=prev)
                {
                    last=last->next;
                }
                new_node->next=last->next;
                last->next=new_node;
            }
        }
    }
    void push_back(node **head,int info)
    {
        node *new_node=new node();
        node *last=*head;
        new_node->data=info;
        if(*head==NULL)
        {
            new_node->next=NULL;
            *head=new_node;
        }
        else
        {
            while (last->next!=NULL)
            {
                last=last->next;
            }
            last->next=new_node;
            new_node->next=NULL;
        }
    }
    //Deletion Functions for LL
    void deletefront(node **head)
    {
        
        if(head==NULL||*head==NULL)
        {
            cout<<"Empty";
        }
        else
        {
            node *n=*head;
            *head=(*head)->next;
            delete[] n;;
        }
    }
    void deleterear(node **head)
    {
        node *last=*head;
        if(head==NULL||*head==NULL)
        {
            cout<<"Empty";
        }
        else
        {
            node *n=*head;
            while (n->next!=NULL)
            {
                n=n->next;
            }
            while (last->next!=n)
            {
                last=last->next;
            }
            last->next=NULL;
            delete[] n;
        }
    }
    void deleteat(node **head,int i)
    {
        node *last=*head;
        if(head==NULL||*head==NULL)
        {
            cout<<"Empty";
        }
        else
        {
            node *n=*head;
            if(i>1)
            {
                while (i-1!=0)
                {
                    n=n->next;
                    i--;
                }
                while (last->next!=n)
                {
                    last=last->next;
                }
                last->next=n->next;
                delete[] n;
            }
            
        }
    }

    //Display Function for LL
    void display(node *head)
    {
        while (head!=NULL)
        {
            cout<<"DATA :"<<head->data<<" Next node address : "<<head->next<<endl;
            head=head->next;
        }
        
    }
};

int main()
{
    node *ptr=NULL;
    linkedlist list;
   // deletefront(&ptr); 
    list.push_front(&ptr,30);
    list.push_front(&ptr,20);
    list.push_front(&ptr,10);
    list.push_after(ptr,50,1);
    list.push_after(ptr,40,2);
    list.push_before(ptr,70,2);
    list.push_back(&ptr,60);
    list.deleteat(&ptr,2);
    //cout<<ptr->data;
    //list.deletefront(&ptr);
    //list.deleterear(&ptr);
    list.display(ptr);
    return 0;
}