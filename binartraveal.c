#include<stdio.h>
#include<stdlib.h>


struct node
{
    int data;
    struct node *left,*right;
    
};

struct node * create();
void preorder(struct node*); 




struct node *root;

main(){


    int z;
    printf("enter choice :");
    scanf("%d",&z);
    while(1){
        switch (z)
        {
        case 1:
             root=create();
            break;
        case 2:
           preorder(root);
           break;
    

        
        default:
            printf("enter correct choice ");
            break;
        }
    }
}
struct node *create(){
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

void preorder(struct node *root){

  if(root!=NULL){
    printf("%d",root->data);
    preorder(root->left);
    preorder(root->right);
    
}
}
