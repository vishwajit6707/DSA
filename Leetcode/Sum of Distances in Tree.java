// Sum of Distances in Tree.
// Leetcode Link - https://leetcode.com/problems/sum-of-distances-in-tree/

class Solution {
    int n;
    int[] count, ans;
    List<Set<Integer>> map;
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        this.n = n;
        count = new int[n];
        ans = new int[n];
        map = new ArrayList<Set<Integer>>();
        Arrays.fill(count, 1);
        for(int i = 0; i<n ; ++i){
            map.add(new HashSet<Integer>());
        }
        for(int[] edge : edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        dfs(0,-1);
        dfs2(0,-1);
        return ans;
    }
    public void dfs(int node,int parent){
        for(int child : map.get(node)){
            if(child != parent){
                dfs(child, node);
                count[node] += count[child];
                ans[node] += ans[child] + count[child];
            }
        }
    }
    public void dfs2(int node, int parent){
        for(int child : map.get(node)){
            if(child != parent){
                ans[child] = ans[node] - count[child] + n - count[child];
                dfs2(child, node);
            }
        }
    }
}
