class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n=ast.length;
        Stack<Integer> s=new Stack<>();
        for(int a:ast){
            if(a>0)s.push(a);
            else {
                while(!s.isEmpty() && s.peek()>0 && s.peek()<-a){
                    s.pop();
                }
                if(s.isEmpty() || s.peek()<0) s.push(a);
                if(s.peek()==-a) s.pop();
            }

        }
        int []res=new int [s.size()];
        int k=s.size()-1;
        while(!s.isEmpty()){
            res[k--]=s.pop();
        }
        return res;

        
    }
}