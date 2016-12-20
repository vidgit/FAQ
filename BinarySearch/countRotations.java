import java.util.*;
public class countRotations{
    
    public int findMin(final List<Integer> a) {

        int low=0,high=a.size()-1,n=a.size()-1;
        while(low<high){
            if(a.get(low)<=a.get(high))
                return a.get(low);
            int mid=(low+high)/2;
            int prev=(n+mid-1)%n;
            int next=(mid+1)%n;

            if(a.get(mid)<=a.get(next)&&a.get(mid)<=a.get(prev))
                return a.get(mid);
            if(a.get(mid)<=a.get(high))
                high=mid-1;
            else if(a.get(mid)>=a.get(low))
                low=mid+1;
        }
        return a.get(low);
    
    }

    public static void main(String[] args) {
        int[] arr1={40342, 40766, 41307, 42639, 42777, 46079, 47038, 47923, 48064, 48083, 49760, 49871, 51000, 51035, 53186, 53499, 53895, 59118, 60467, 60498, 60764, 65158, 65838, 65885, 65919, 66638, 66807, 66989, 67114, 68119, 68146, 68584, 69494, 70914, 72312, 72432, 74536, 77038, 77720, 78590, 78769, 78894, 80169, 81717, 81760, 82124, 82583, 82620, 82877, 83131, 84932, 85050, 85358, 89896, 90991, 91348, 91376, 92786, 93626, 93688, 94972, 95064, 96240, 96308, 96755, 97197, 97243, 98049, 98407, 98998, 99785, 350, 2563, 3075, 3161, 3519, 4176, 4371, 5885, 6054, 6495, 7218, 7734, 9235, 11899, 13070, 14002, 16258, 16309, 16461, 17338, 19141, 19526, 21256, 21507, 21945, 22753, 25029, 25524, 27311, 27609, 28217, 30854, 32721, 33184, 34190, 35040, 35753, 36144, 37342};

        //System.out.print(arr1[55]);
        //for(int i=0;i<arr1.length;i++)
        //    System.out.println(i+" : "+arr1[i]);
        int[] arr={5,6,7,8,9,1,3,4};
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i:arr1){
            //System.out.print(i+" ");
            a.add(i);
        }
       // System.out.println("List built");
     System.out.println(count(a));
    }
}