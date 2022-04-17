class Solution 
{
    public int minimumRounds(int[] tasks) 
    {
        int numMoves = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < tasks.length; i++)
        {
            if (!map.containsKey(tasks[i]))
            {
                map.put(tasks[i], 1); 
            }
            else
            {
               map.put(tasks[i], map.get(tasks[i]) + 1);  
            }
        }
        
        for (Integer key : map.keySet()) 
        {
            int moves1 = 0;
            int moves2 = 0;
            
            if (map.get(key) < 2)
            {
                return -1;
            }
            else
            {   
                int val = map.get(key);
                
                if (val % 3 == 0)
                {
                    moves1 = val / 3;
                }
                else
                {
                    if (val % 3 == 1)
                    {
                        if (val % 2 == 0)
                        {
                            moves1 = (val - 4) / 3;
                            moves2 = 2;
                        }
                        else
                        {
                            moves1 = (val - 4) / 3;
                            moves2 = 2;
                        }
                        
                    }
                    else
                    {
                        moves1 = val / 3;
                        moves2 = 1;
                    }
                }
                
                // System.out.println(key + " " + val + " " + (moves1 + moves2) );
            }
            
            
            numMoves += moves1;
            numMoves += moves2;
        }
        
        return numMoves;
        
    }
}