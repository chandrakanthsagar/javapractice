#include<stdio.h>
#include<stdlib.h>

#define MAX 3
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

void enqueue()
{
    int n;
          printf("enter n value: ");
                scanf("%d",&n);
    if ((rear+1)%MAX == frnt)
    {
        printf("QUEUE IS FULL\n");
    }
    else if(frnt==-1 && rear==-1)
    {
        frnt=0;
        rear=0;
      
        queue[rear]=n;
    }
    else{
        rear=(rear+1)%MAX;
        queue[rear]=n;

    }
    
}

    void dequeue()
    {
        if(rear==-1 && frnt==-1)
        {
            printf("queue is empty");
        }
        else if (frnt==rear)
        {
            int item;
            item=queue[frnt];
            printf("element deleted : is%d \n",item);
            frnt=-1;
            rear=-1;

        }
        else{
            int item;
            
            item=queue[frnt];
               
            printf("element deleted : is %d \n ",item);
              frnt=(frnt+1)%MAX;
        }
        
    }
    void display(){

        if( frnt<=rear )
        {
                while(frnt<=rear)
                        printf("%d ",queue[frnt++]);
        }
        else
        { 
              while(frnt<=MAX-1)
                        printf("%d ",queue[frnt++]);
                int i=0;

                for(i=0;i<=rear;i++){
                    printf("%d",queue[i]);
                }
                 
                   
                
                        
        }
        printf("\n");
}




