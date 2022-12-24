#include<stdio.h>

void binary(int);
int main()
{
    int number;

    printf("Enter number to cconvert to binary:");
    scanf("%d",&number);
    binary(number);
    return 0;
}

void binary(int num)
{
    if(num==0)
    {
        return;
    }
    binary(num/2);
    printf("%d",num%2);
}