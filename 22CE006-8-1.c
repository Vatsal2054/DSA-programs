#include<stdio.h>
#include<ctype.h>
#include<string.h>
int main()
{
    char a[12];
    int l=0,u=0,n=0,c=0,i;
    while(1)
    {
        printf("Enter your password:");
        gets(a);
        if(strlen(a)<8)
        {
            continue;
        }
        else
        {
            break;
        }
    }
    for(i=0;a[i]!='\0';i++)
        {
            if(islower(a[i]))
            {
                l=1;
            }
            else if(isupper(a[i]))
            {
                u=1;
            }
            else if(isdigit(a[i]))
            {
                n=1;
            }
            else if(ispunct(a[i]))
            {
                c=1;
            }
        }
    if(l>0&&u>0&&n>0&&c>0)
    {
        printf("\nYour password is strong.");
    }
    else if(l>0&&n>0&&c>0)
    {
        printf("\nYour password is average.");
    }
    else
    {
        printf("\nYour password is poor.");
    }
}