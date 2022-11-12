// Find Median from Data Stream
// Leetcode Link - https://leetcode.com/problems/find-median-from-data-stream/

// Solved Using Two PriorityQueues. 

class MedianFinder {
    PriorityQueue<Integer> min = new PriorityQueue<>();
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        min.offer(num);
        max.add(min.poll());
        if(min.size() < max.size()){
            min.add(max.poll());
        }
    }
    
    public double findMedian() {
        if(max.size()==min.size()){
            return (min.peek() + max.peek()) / 2.0;
        }else{
            return min.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
