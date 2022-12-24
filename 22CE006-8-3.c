#include<stdio.h> 
void main() 
{ 
    int sum=0,amt; 
    for(;;) 
    { 
        printf("Enter the amount:"); 
        scanf("%d",&amt); 
        if(amt==0) 
        { 
            break; 
        } 
        else 
        { 
            sum=sum+amt; 
        } 
    } 
    printf("Total amount is %d",sum); 
    printf("\nThis program was prepared by 22CE006.");
}
