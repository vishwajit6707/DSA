// Find if Path Exists in Graph.
// Leetcode Link - https://leetcode.com/problems/find-if-path-exists-in-graph/

// Approach - Breadth First Search (BFS).

// Time Complexity - O(N+M).    N - number of nodes. M - No of edges.
// Space Complexity - O(N+M).  

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int[] a : edges){
            if(map.containsKey(a[0])) map.get(a[0]).add(a[1]);
            else{
                map.put(a[0],new ArrayList<Integer>());
                map.get(a[0]).add(a[1]);
            }
            if(map.containsKey(a[1])) map.get(a[1]).add(a[0]);
            else{
                map.put(a[1],new ArrayList<Integer>());
                map.get(a[1]).add(a[0]);
            }
        }
        queue.offer(source);
        visited[source] = true;

        while(!queue.isEmpty()){
            int cNode = queue.poll();
            if(cNode == destination) return true;

            for(int nNode : map.get(cNode)){
                if(!visited[nNode]){
                    visited[nNode] = true;
                    queue.offer(nNode);
                }
            }
        }
        return false;
    }
}
