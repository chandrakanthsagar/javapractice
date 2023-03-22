#include<stdio.h>
#include<stdlib.h>



struct  node
{
    int data;
    struct  node *next;
 
};
struct node *head;

void insert_begin();
void insert_end();
void insert_random();
void delete_begin();
void delete_end();
void delete_random();
void display();


main()
{
    int choice;

  
    do
    {
          printf("enter choice:");
          scanf("%d",&choice);
  
        switch(choice)
            {
                case 1:
                 {
                    insert_begin();
                  break;
                 }
                 
                case 2:
                 {
                     insert_end();
                     break;
                 }
                
                case 3:
                 {
                    insert_random();
                     break;
                 }
                 case 4:
                 {
                   delete_begin();
                        break;
                 }
                 case 5:
                 {
                     delete_end();
                    break;
                 }

                case 6:
                 {
                     delete_random();
                    break;
                 }
                case 7:
                 {
                     display();
                    break;
                 }

                default:

                 {
                     printf("select correct choice\n ");
                  break;
                 }
            }
    } while (1);
}
void insert_begin()
{
    struct node *ptr;
    int x;
    ptr=(struct node*)malloc(sizeof(struct node*));

    printf("eter x:");
    scanf("%d",&x);
    ptr->data=x;
    if(ptr==NULL)
      printf("\noverflow");
    else{
        if(head==NULL){
            head=ptr;
            ptr->next=NULL;

        }
        else{
            ptr->next=head;
            head=ptr;
        }

        }
    
}
void insert_end(){
    struct node *ptr;
    int x;
    ptr=(struct node*)malloc(sizeof(struct node*));

    printf("eter x:");
    scanf("%d",&x);
    ptr->data=x;
    if(ptr==NULL)
      printf("\noverflow");
    else{
        if(head==NULL){
            
            ptr->next=NULL;
            head=ptr;
        }
        else{
            struct node*temp;
            temp=head;
            while (temp->next!=NULL)
            {
                temp=temp->next;
            }
            temp->next=ptr;
            ptr->next=NULL;
            
        }
}
}
void insert_random(){
      struct node *ptr;
    int x,n;    printf("eter x:");
    scanf("%d",&x);
    printf("eter n:");
    scanf("%d",&n);

    ptr=(struct node*)malloc(sizeof(struct node*));

    ptr->data=x;
    if(ptr==NULL)
      printf("\noverflow");
    else{
        if(head==NULL){
            head=ptr;
            ptr->next=NULL;

        }
        else{
                struct node*temp=head;

                
                for(int i=0;i<n;i++)
                {
                    temp=temp->next;
                    if(temp==NULL)
                    {
                        printf("can't be inserted");
                    }
                }
                ptr->next=temp->next;
                temp->next=ptr;
        }
            
}
}
void delete_begin(){
    if(head==NULL){
        printf("deletion is not possible ");
    }
    else{
        struct node*temp=head;
        if(head->next==NULL)
        {
            head=NULL;
            free(temp);
        }
        else{
            head=temp->next;
            free(temp);
        }
    }
}
void delete_end()
{
       if(head==NULL){
        printf("deletion is not possible ");
    }
    else{
        struct node *temp1,*temp;
        temp1=head;
         temp=head;
         if(head->next==NULL)
         {
             free(head);
             head=NULL;
         }
         else{
             while(temp->next!=NULL){
                 temp1=temp;
                 temp=temp->next;

             }
             temp1->next=NULL;
             free(temp);
             temp=NULL;
         }
    }
}
void delete_random(){
    int n;
    printf("enter n: ");
    scanf("%d",&n);
    
       if(head==NULL){
        printf("deletion is not possible ");
    }
    else{
        struct node *temp1,*temp;
        temp=head;
        temp1=head;
         if(head->next==NULL)
         {
             free(head);
             head=NULL;
         }
         else{
             for(int i=1;i<n;i++)
             {
                 temp1=temp;
                 temp=temp->next;
                 if(temp==NULL)
                 {
                     printf("cannot be delete" );

                 }

             }
             temp1->next=temp->next;
             free(temp);

         }
    }
}
void display()
{
   struct node *ptr;
   ptr=head;
   if(ptr==NULL)
   printf("ntg to print");
   else{
       while (ptr!=NULL)
       {
           printf("%d->",ptr->data);
           ptr=ptr->next;
       }
       printf("\n");
       
   }
}
