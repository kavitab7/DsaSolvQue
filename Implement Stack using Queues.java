https://leetcode.com/problems/implement-stack-using-queues/description/
class MyStack {
    Queue<Integer> qu = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        qu.add(x);
    }
    
    public int pop() {
         for(int i=0;i<qu.size()-1;i++){
            qu.add(qu.remove());
        }
         int val = qu.remove();
      return val;
    }
    
    public int top() {
        for(int i=0;i<qu.size()-1;i++){
            qu.add(qu.remove());
        }
      int val = qu.peek();
       qu.add(qu.remove());
    return val;

    }
    
    public boolean empty() {
       if(qu.size()==0){
           return true;
       }
       return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
