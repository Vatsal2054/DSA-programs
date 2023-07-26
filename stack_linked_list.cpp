#include<iostream>
using namespace std;
struct node 
{
int data;
struct node ∗link; 
};
struct node *head = NULL;


void push(int item)
{
struct node *p = (struct node *)malloc(sizeof(struct node));
if(p==NULL)
    {
        cout<<"Memory Error";
    }
else

if(head==NULL)
    {
        p->data=item;
        p->link=NULL;
        head=p;
    }
else
    {
        p->data=item;
        p->link=head;
        head=p;
    }
}
int pop( )
{
int item;
struct node *p;
       if(head==NULL)
       {
                 cout<<"Underflow";
                 return -1;
       }
       item=head->data;
        p=head;
       head=head->link;
       free(p);
       return item;
}
void display()
{
    struct node *ptr;
    ptr=head;
    if(ptr == NULL)
    {
        cout<<"Stack is empty\n";
    }
    else
    {
    cout<<"Printing Stack elements \n";
    while(ptr!=NULL)
    {
    cout<<"%d\n",ptr->data;
    ptr = ptr->link;
    }
    }
}