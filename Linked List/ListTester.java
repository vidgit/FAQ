public class ListTester{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println(list.add(1));
        System.out.println(list.add(2));
        System.out.println(list.add(3));
        System.out.println(list.add(4));
        System.out.println(list);
        System.out.println(list.delete(1));
        System.out.println(list);
    }
}