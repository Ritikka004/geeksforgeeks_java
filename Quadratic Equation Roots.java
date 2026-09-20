class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> list = new ArrayList<>();
        int d = (b*b) - (4*a*c);
        if(d < 0){
            list.add(-1);
        }else{
            double root1 = (-b + (Math.sqrt(d))) / (2*a);
            double root2 = (-b - (Math.sqrt(d))) / (2*a);
            int r1 = (int)Math.floor(root1);
            int r2 = (int)Math.floor(root2);
            list.add(r1);
            list.add(r2);
        }
        return list;
    }
}
