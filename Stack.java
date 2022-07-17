class Stack{
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size){
        arr=new int[size];
        top=-1;
        capacity=size;
    }
    public void push(int x){
        if(isFull()==1){
            System.out.println("Stack is full: Overflow");
            System.exit(1);
        }
        System.out.println("Inserting: "+ x);
        arr[++top]=x;

	  System.out.println("Added");
    }
    public int pop(){
        if (isEmpty()==1){
            System.out.println("Empty Stack: UndetFlow");
            System.exit(1);
        }
        System.out.println("Popped");
        return top--;
	  
    }
    public int isFull(){
        if(top==capacity){
            return 1;
        }
        else return 0;
       // return top==capacity-1;
    }
    public int isEmpty(){

        if(top==-1){
            return 1;
        }
        else
            return 0;
    }

    public static void main(String [] argc){
        Stack stack=new Stack(5);

        stack.push(90);
        stack.push(560);
        stack.push(880);
        stack.push(80);

        stack.pop();
    }
}