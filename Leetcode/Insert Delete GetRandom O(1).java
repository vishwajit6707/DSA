// Insert Delete GetRandom O(1)
//Leetcode Link -  https://leetcode.com/problems/insert-delete-getrandom-o1/


class RandomizedSet {
    HashMap<Integer,Integer> map;
    ArrayList<Integer> al = new ArrayList<>();
    public RandomizedSet() {
        map = new HashMap<>();
        al = new ArrayList<>();
    }
    
    public boolean insert(int val) {
       if(map.containsKey(val)) return false;
       map.put(val,al.size());
       al.add(val);
       return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int index = map.get(val);
        Collections.swap(al,index,al.size()-1);
        int swapped = al.get(index);
        map.put(swapped,index);
        al.remove(al.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int ans = (int) (Math.random() * al.size());
        return al.get(ans);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
