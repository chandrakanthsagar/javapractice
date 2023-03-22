#include<stdio.h>
#include<stdlib.h>


struct node
{
    int data;
    struct node *left,*right;
    
};

struct node * create();

struct node *root=NULL;
main()
{
  
        
        root=create();
        
        
}
struct node * create(){

    int x;
    struct node *newnode;

    newnode=(struct node*)malloc(sizeof(struct node*));
        printf("enter data value:");
    scanf("%d",&x);
      if(x==-1)
        return 0;
    newnode->data=x;

    printf("enter left child: ");
    newnode->left=create();
    printf("enter right child");
    newnode->right=create();
    return newnode;

}