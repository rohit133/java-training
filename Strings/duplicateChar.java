package Strings;

public class duplicateChar{
    public static void main(String[] args) {
            String s = "helloworld";
            int distinct=0;
            // Outter Loop
            for(int i=0;i<s.length();i++){
                // inner Loop 
                for(int j=0;j<s.length();j++){
                    if(s.charAt(i) == s.charAt(j)){
                        distinct++ ;
                    }
                }
                System.out.println(s.charAt(i)+" - "+distinct);
                String d=String.valueOf(s.charAt(i)).trim();
                s=s.replaceAll(d,"");
                distinct = 0;

            }
        }
}
