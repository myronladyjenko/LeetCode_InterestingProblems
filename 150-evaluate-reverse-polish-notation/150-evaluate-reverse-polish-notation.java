class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        Stack <Integer> stack = new Stack<Integer>();
        int curr = 0;
        
        for (int i = 0; i < tokens.length; i++)
        {
            // System.out.println(tokens[i]);
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*"))
            {
                int a = stack.pop();
                int b = stack.pop();
                
                if (tokens[i].equals("+"))
                {
                    curr = a + b;
                    System.out.println(curr);
                    stack.push(curr);
                }
                else
                {
                    if (tokens[i].equals("-"))
                    {
                        curr = b - a;
                        stack.push(curr);
                    }
                    else
                    {
                        if (tokens[i].equals("*"))
                        {
                            curr = a * b;
                            System.out.println(curr);
                            stack.push(curr);
                        }
                        else
                        {
                            curr = b / a;
                            stack.push(curr);
                        }
                    }
                }
            }
            else
            {
                int res = Integer.parseInt(tokens[i]);
                stack.push(res);
            }
        }
        
        return stack.pop();
    }
}