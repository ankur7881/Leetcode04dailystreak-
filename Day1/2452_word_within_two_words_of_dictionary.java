class Solution {
    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();//Final Answer store karne ke liye list
        //har query word ke liye loop
        for(String query:queries){
           //har dictionar word ke saath comparison
            for(String dict: dictionary){
                int diff=0;//diff - mismatch count rakhta hai
                // Character by character compare
                for(int i=0;i<query.length();i++){
                    if(query.charAt(i) != dict.charAt(i)){
                        diff++;
                        if(diff>2) break;
                    }
                }
                if(diff<=2){
                    result.add(query);
                    break;
                }
            }
        }
        return result;
    }
 public static void main(String args[]){
    String[] queries1={"word","note","ant","wood"};
    String[] dictionary1={"wood","joke","moat"};
    System.out.println(twoEditWords(queries1,dictionary1));

    String[] queries2={"yes"};
    String[] dictionary2={"not"};
    System.out.println(twoEditWords(queries2,dictionary2));
 }  
}
