class MyQueue {
    private Deque<Integer> d1;
    private Deque<Integer> d2;


    public MyQueue() {
        d1=new ArrayDeque<>();
        d2=new ArrayDeque<>();  
    }
    
    public void push(int x) {
        d1.push(x);
        
    }
    
    public int pop() {
        peek();
        return d2.pop();
        
    }
    
    public int peek() {
        if(d2.isEmpty()){
            while (!d1.isEmpty()) {
                d2.push(d1.pop());
            }
        }
        return d2.peek();   
    }
    
    public boolean empty() {
        return d1.isEmpty() && d2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */