// Implement Queue using Stacks.
// Leetcode Link -  https://leetcode.com/problems/implement-queue-using-stacks/


class MyQueue {
    Stack<Integer> st;
    Stack<Integer> st1;
    public MyQueue() {
        st = new Stack<>();
        st1 = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        int temp  = st1.pop();
        while(!st1.isEmpty()){
            st.push(st1.pop());
        }
        System.out.println(st);
        return temp;
    }
    
    public int peek() {
       while(!st.isEmpty()){
           st1.push(st.pop());
       }
       int temp = st1.peek();
       while(!st1.isEmpty()){
           st.push(st1.pop());
       }
       return temp;
    }
    
    public boolean empty() {
        return st.isEmpty();
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
