#include<iostream>
using namespace std;

void knapsack(int N, int C , int K , int a[]);

int main()
{
    cout<<"This program was prepared by 22CE006."<<endl;
    int T;
    cout<<"Enter Test Cases:";
    cin>>T;
    for(int j = 0 ; j < T ; j++)
    {
        int n , c , k;
        cout<<"Enter Number of objects, Max limit and Min limit :";
        cin>>n>>c>>k;
        int W[n];
        for(int i = 0 ; i < n ; i++)
        {
            cout<<"Enter "<<(i+1)<<" element:";
            cin>>W[i];
        }
        knapsack(n , c , k , W);
    }
    return 0;
}

void knapsack(int N, int C , int K , int a[])
{
    int i, j, total = 0, count = 0 , max = 0;
    for (i = 0; i < N; i++)
    {
        for (j = i; j < N ; j++)
        {
            total += a[j]; 
            count = count + 1;
            if( total >= K && total <= C)
            {
                if(max < count)
                {
                    max = count;
                }
                break;
            }
            if(total > C)
            {
                break;
            }
        } 
    }
    cout<<"The max count is :"<<max<<endl; 
}