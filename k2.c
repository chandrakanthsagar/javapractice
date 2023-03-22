#include<stdio.h>
#include<stdlib.h>

#define MAX 5
int frnt=-1;
int rear=-1;
int queue[MAX];
void enqueue();
void dequeue();
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
                     enqueue();
                  break;
                 }
                 
                case 2:
                 {
                     dequeue();
                     break;
                 }
                
                case 3:
                 {
                     display();
                     break;
                 }
                 case 4:
                 {
                     exit(1);
                 }
                 
                default:

                 {
                     printf("select correct choice\n ");
                  break;
                 }
            }
    } while (1);
}

void enqueue ()
{
        int n;
        if(rear == MAX-1)
        {
            printf("Queue is full\n");
        }
        else if(frnt==-1 && rear==-1)
            {
              
                frnt=0;
                rear=0;
                printf("enter n value: ");
                scanf("%d",&n);
                queue[rear]=n;
               
            }
        else{
                   printf("enter n value:" );
                scanf("%d",&n);
            rear=rear+1;
            queue[rear]=n;
            
          
        }


        

            
        }
    
    
    

    void dequeue()
    {
        if( rear==-1 && frnt==-1)
        {
            printf("queue is empty");
        }
        else if (frnt==rear)
        {
            int item;
            item=queue[frnt];
            printf("element deleted : is%d \n",item);
            frnt==-1;
            rear==-1;

        }
        else{
            int item;
            
            item=queue[frnt];
            printf("element deleted : is %d \n ",item);
            frnt++;
        }
        
    }

void display(){
        int i;
        for(i=frnt;i<=rear;i++)
 
        {
            printf("%d \n",queue[i]);
        }
}