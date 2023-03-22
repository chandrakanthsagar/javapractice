#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node 
{
    int row,col,value;
    struct node*next;


    
};
struct node*head=NULL;
void createnode();
int display();
int main()
{
    int a[10][10],m,n,count=0,i,j;
    printf("enter a size: ");
    scanf("%d %d",&m,&n);
    printf("enter matric elements: \n");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",a[i][j]);
            if(a[i][j]==0);
            count++;
        }
    }
    if(count>=((m*n)/2))
    {
        printf("\n GIVEN MATRICX IS SPARSE");
        for(i=0;i<m;i++)
        {

        
            for(j=0;j<n;j++)
            {
                if(a[i][j]!=0)
                {
                    createnode(i,j,a[i][j]);
                }
            }
    }
    printf("\n SPARSE MATRIXCONTENTS");
    printf("\n ROW \tcol \t value");
    display();
    

}
void createnode(int r,int c,int v)
{
    struct node *ptr;
   ptr=(struct node*)malloc(sizeof(struct node));
   ptr->row=r;
   ptr->col=c;
   ptr->value=v;
   ptr->next=NULL;
   if(head==NULL)
    head=ptr;
   else{
       
     head->next=ptr;
     head=ptr;
}
   
    
}
int diplay()
{
    struct node*ptr;
    ptr=head;
    while(ptr!=NULL)
    {
        printf("\n%d \t %d \t %d",ptr->row,ptr->col,ptr->value);
        ptr=ptr->next;
    }
    
}
}