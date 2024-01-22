#include <stdio.h>
#include <stdlib.h>
int absort(int a[],int n)
{ int temp,count=0;
int f =0;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                f=1;
                count++;
            }
        }
       
    }
    return count;
}
int dbsort(int a[],int n)
{ int t,f=0,count1=0;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-1-i;j++)
        {
            if(a[j]<a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
                f=1;
                count1++;
            }
        }
       
    }
    return count1;
}

int main()
{
    int n;
    scanf("%d",&n);
    int a[n],b[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++)
    {
        b[i]=a[i];
    }
    int r=dbsort(a,n);
    int r1=absort(b,n);
    if(r>r1)
    {
        printf("%d",r1);
    }
    else
    {
        printf("%d",r);
    }

    return 0;
}