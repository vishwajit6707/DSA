
// Keys and Rooms.
// Leetcode Link - https://leetcode.com/problems/keys-and-rooms/

// Approach - Breadth first search. (BFS).

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        Queue<Integer> queue = new LinkedList<>();
        int ct = 1;
        for(int i = 0; i<rooms.get(0).size() ; i++){
            queue.offer(rooms.get(0).get(i));
        }
        System.out.println(queue);
        visited[0] = true;
        while(!queue.isEmpty()){
            int temp = queue.poll();

            if(!visited[temp]){
                visited[temp] = true;
                ct++;
                for(int i = 0; i<rooms.get(temp).size(); i++){
                    System.out.println(rooms.get(temp).get(i));
                    queue.offer(rooms.get(temp).get(i));
                }
            }

        }
        return ct==rooms.size();
    }
}
