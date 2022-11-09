// Online Stock Span
// Leetcode Link - https://leetcode.com/problems/online-stock-span/

// Approach - Using Monotonic Stack.
// Monotinic Stack is Stack containing elements in increasing or decreasing order.
// here we will store values in increasing order.
// while we store next element we will remove all small elements before that element until we get greater element and
// store total value of elements which are smaller than that along with it. and at the end store the current element with the values lesser than it.

class StockSpanner {
    public Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    public int next(int price) {
        int ans  = 1;
        while(!st.isEmpty() && st.peek()[0] <= price){
            ans += st.pop()[1];
        }
        st.push(new int[]{price,ans});
        return ans;
    }
}
