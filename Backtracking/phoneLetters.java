public class phoneLetters {
    HashMap<Character,ArrayList<String>> map=new HashMap<Character,ArrayList<String>>();
    public ArrayList<String> letterCombinations(String a) {
        map.put('1',new ArrayList<String>(Arrays.asList("1")));
        map.put('2',new ArrayList<String>(Arrays.asList("a","b","c")));
        map.put('3',new ArrayList<String>(Arrays.asList("d","e","f")));
        map.put('4',new ArrayList<String>(Arrays.asList("g","h","i")));
        map.put('5',new ArrayList<String>(Arrays.asList("j","k","l")));
        map.put('6',new ArrayList<String>(Arrays.asList("m","n","o")));
        map.put('7',new ArrayList<String>(Arrays.asList("p","q","r","s")));
        map.put('8',new ArrayList<String>(Arrays.asList("t","u","v")));
        map.put('9',new ArrayList<String>(Arrays.asList("w","x","y","z")));
        map.put('0',new ArrayList<String>(Arrays.asList("0")));
        return combo(a);
        
    }
    public ArrayList<String> combo(String a){
        if(a.length()==1)
            return map.get(a.charAt(0));
        ArrayList<String> one=map.get(a.charAt(0));
        ArrayList<String> two=combo(a.substring(1));
        ArrayList<String> res=new ArrayList<String>();
        for(int i=0;i<one.size();i++)
        {
            for(int j=0;j<two.size();j++){
                res.add(one.get(i)+two.get(j));
            }
        }
        return res;
    }
}