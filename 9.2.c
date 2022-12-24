#include<stdio.h>
#include<math.h>
void area();
double calculateS();
void main()
{
    area();
}

void area()
{
    double area,s,a,b,c;
    printf("Enter Side a:");
    scanf("%lf",&a);
    printf("Enter Side b:");
    scanf("%lf",&b);
    printf("Enter Side c:");
    scanf("%lf",&c);

    if(a+b<=c||a+c<=b||b+c<=a)
    {
        printf("Triangle is not valid.");
    }
    else
    {
        s=calculateS(a,b,c);
        area=sqrt(s*(s-a)*(s-b)*(s-c));
        printf("The area of the given triangle found using Heron's formula is=%lf",area);
    }
}

double calculateS(double a,double b,double c)
{
    double m;
    m=(a+b+c)/2;
    return m;
}
