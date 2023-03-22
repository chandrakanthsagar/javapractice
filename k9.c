#include<stdio.h>
#include<string.h>



main(){
    char n[12];
    printf("enter :");
    scanf("%s",n);
    
    int p=strlen(n);
  
    int x=atoi(n);
  
    int a[p];
    x=atoi(n);
    for(int i=0;i<p;i++)
    {
        a[i]=(x%10);
        x=x/10;
    }

    int t=p;
    for(int i=0;i<p;i++)
    {
        for(int j=i+1;j<p;j++)
        {
            if(a[i]==a[j])
            {
                t--;
                break;
            }
        }
        
    }
    printf("%d",t);
}
