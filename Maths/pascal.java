public class pascal {
    public ArrayList<ArrayList<Integer>> generate(int a) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<a;i++){
            list.add(getRow(i));
        }
        return list;
    }
    public ArrayList<Integer> getRow(int a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(a==0){
            list.add(1);
            return list;
        }
        int n=a;
        int num=1;
        for(int i=0;i<=n;i++){
            list.add(num);
           // System.out.println((n-i)/(i+1)+" ");
            num=num*(n-i)/(i+1);
        }
        return list;
    }
}