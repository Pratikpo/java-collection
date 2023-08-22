public class Queue {
    int capacity;
    int front; //points to first elemnet used to remove element from front
    int rear;//points last element and used to add element from last
    int[] queue;//array that used to store element

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        this.queue = new int[capacity];
    }
    //Add insert of the element to the end of the queue

    void enqueue(int item){
        if (isFull()){
            System.out.println("queue is allready full,you can not add elements from end of the queue");
        }
        else {
            if (front==-1){
                front=0;//make front equal to 0 when it is first element
            }
                queue[++rear]=item;
                System.out.println("Element"+item+"is added to the end of index"+rear);
                printQueue();
            }


    }
    //remove the element to front pf the queue
    int dequeue(){
        int removedItem=0;
        if(isEmpty()){
            System.out.println("you can not remove element ,queue is already empty");
        }
        else {
            removedItem=queue[front];
            queue[front] =0;
            if (front ==(capacity-1)) {
                for (int i=0;i<rear;rear++){
                    queue[i]=queue[i+1];
                }

            }
               else{
                   front++;
                }
            System.out.println("Element"+removedItem+"is removed");


            }return removedItem;

        }





    boolean isFull(){
       return rear==(capacity-1);
    }
    boolean isEmpty(){
        return front==-1;
    }
    int peek(){
        if (isEmpty()){
            System.out.println("queue is empty");
        }
        return queue[0];
    }



    void printQueue(){
        System.out.println("-------------"+ "Queue contet is: "+ "------------");
        for (int j:queue) {
            System.out.println(j+"\t");
            
        }
        System.out.println("\n--------------------");

    }

}
