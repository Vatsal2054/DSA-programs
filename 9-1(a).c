#include<stdio.h>
void isprime(int);
int main()
{
    int n;
    printf("\nEnter your number:");
    scanf("%d",&n);
    isprime(n);
    return 0;
}

void isprime(int n)
{
    int flag=1,i;
    for(i=2;i<=(n/2);i++)
    {
        if(n==1)
        {
            break;
        }
            if(n%i==0)
            {
                flag=0;
                break;
            }
    }
    
    if(n==1)
    {
        printf("\n1 is neither prime nor a composite number");
    }
    else if(flag==1)
    {
        printf("\n%d is a prime number.",n);
    }
    else
    {
        printf("\n%d is a composite number.",n);
    }
    return n;
}