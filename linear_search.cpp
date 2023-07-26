#include<iostream>
using namespace std;
void search(int a[] , int key ,int n);

int main()
{
    int key;
    int N;
    cout<<"Enter number of elements of array:";
    cin>>N;
    N = N - 1;
    int arr[N];
    cout<<"Enter array elements:";
    for(int i = 0 ; i <= N ; i++)
    {
        cin>>arr[i];
    }
    cout<<"Enter variable to search:";
    cin>>key;
    search(arr , key , N);
    cout<<"This program was prepared by 22CE006."<<endl;
    return 0;
}

void search(int a[] , int key ,int n)
{
    int flag = 0;
    for(int j = 0 ; j <= n ; j++)
    {
        if(a[j] == key)
        {
            flag = 1;
            break;
        }
    }
    if( flag == 1)
    {
        cout<<"Variable found."<<endl;
    }
    else if( flag == 0)
    {
        cout<<"Variable not found."<<endl;
    }
}
    