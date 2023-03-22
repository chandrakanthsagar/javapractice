#include<stdio.h>
#include<stdlib.h>

#define MAX 5

int frnt=-1;
int rear=-1;

int queue[MAX];
void enqueue_right();
void enqueue_left();
void dequeue_right();
void dequeue_left();
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
                     enqueue_right();
                  break;
                 }
                 
                case 2:
                 {
                       enqueue_left();
                     break;
                 }
                
                case 3:
                 {
                     dequeue_right();
                     break;
                 }
                 case 4:
                 {
                     dequeue_left();
                        break;
                 }
                 case 5:
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

void enqueue_right(){
        int n;
        printf("enter n value: ");
        scanf("%d",&n);
        if( frnt== 0 && rear == MAX-1)
        {
            printf("Queue is full\n");
        }
        else if (frnt==-1 && rear==-1)
        {
            frnt++;
            rear++;
            queue[rear]=n;
        }
        else
        {
            rear=rear+1;
            queue[rear]=n;
        }
}
void enqueue_left()
{
     int n;
        printf("enter n value: ");
        scanf("%d",&n);
        if( frnt== 0 && rear == MAX-1)
        {
            printf("Queue is full\n");
        }
        else if (frnt==-1 && rear==-1)
        {
            frnt++;
            rear++;
            queue[frnt]=n;
        }
        else
        {
           frnt=frnt-1;
            queue[frnt]=n;
        }
}
void dequeue_right ()
{
    int item;
    if(frnt==-1)
    {
        printf("QUEUE IS EMPTY ");
    }
    else if (frnt == rear)
    {
        
        item=queue[rear];
        printf("%d",item);
        frnt=-1;
        rear=-1;

    }
    else{
         item=queue[rear];
        printf("%d \n",item);
        rear=rear-1;


    }
    
}
void dequeue_left()
{
    int item;
    if(frnt==-1)
    {
        printf("QUEUE IS EMPTY ");
    }
    else if (frnt == rear)
    {
        
        item=queue[frnt];
        printf("%d\n",item);
      frnt=-1;
      rear=-1;


    }
    else{
         item=queue[frnt];
        printf("%d\n",item);
      frnt++;


    }
}

void display()
{
    int i;
    for(i=frnt;i<=rear;i++){
        printf("%d\n",queue[i]);
    }
}