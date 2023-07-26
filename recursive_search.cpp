#include<iostream>
using namespace std;
int b_re_search(int l , int h , int a[] , int k);

int main()
{
    int N;
    cout<<"enter number of elements:";
    cin>>N;
    N = N - 1;
    int arr[N];
    int key;
    int rec_result;

    cout<<"Enter elements of array:";
    for( int i = 0 ; i <= N ; i++)
    {
        cin>>arr[i];
    }

    cout<<"Enter element to find:";
    cin>>key;
    
    rec_result = b_re_search(0 , N , arr , key);
    if(rec_result == (-1))
    {
       cout<<"Element not found!"<<endl;
    }
    else
    {
        cout<<"Element found!"<<endl;
    }
    cout<<"This program was prepared by 22CE006."<<endl;
    return 0;
}

int b_re_search(int l , int h , int a[] , int k)
{
    int m=0;
    if(l <= h)
    {
        m = ((l+h)/2);
        if( a[m] == k)
        {
            return m;
        }
        else if(a[m] > k)
        {
            b_re_search(l , m-1 , a , k);
        }
        else
        {
            b_re_search(m+1 , h , a , k);
        }
    }
    return (-1);
}