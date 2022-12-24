#include<stdio.h>
int main()
{
    int d;
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    d=isprime(n);
    if(d==1)
    {
        printf("%d is a prime number.",n);
    }
    else if(d==0)
    {
        printf("%d is a composite number.",n);
    }
    else if(d==2)
    {
        printf("%d is neither a prime number nor a composite number.",n);
    }
    return 0;
}

int isprime(int n)
{
    int flag=1,i;
    if(n==1)
    {
        return 2;
    }

    for(i=2;i<=(n/2);i++)
    {
        if(n%i==0)
        {
            flag=0;
        }
    }
    return flag;
}