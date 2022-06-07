class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int count = 1;
        List<Integer> al = null;
        while(count<=numRows)
        {
            al = new ArrayList<Integer>();
            for(int i=0;i<count;i++)
            {
                if(i == 0 || i == count-1)
                    al.add(1);
                else
                    al.add(result.get(count - 2).get(i-1) + result.get(count - 2).get(i));
            }
            result.add(al);
            count++;
        }
        
        return result;
    }
}