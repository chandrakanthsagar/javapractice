#include<stdio.h>

main()
{
    int x[14],n,i,j;
    printf("arry size: ");
    scanf("%d",&n);

    printf("enter  barry elementes : ");
     for(i=0;i<n;i++)
            {
                scanf("%d",&x[i]);
            }
    
    bubble_sort(x,n);
    for(i=n-1;i>=0;i--)
    {
        printf("%d  ",x[i]);
    }
}
void bubble_sort(int x[],int n)
{
    int i,j;
    for (i=0;i<n-1;i++)
    {
        for(j=0;j<(n-1-i);j++)
        {
            if (x[j]>x[j+1])
            {
                swap(&x[j],&x[j+1]);
            }
        }
    }
}

swap(int *x,int *y)
{
    int temp;

    temp=*x;
    *x=*y;
    *y=temp;
}


