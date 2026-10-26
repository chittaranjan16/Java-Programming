package string;

public class p1 {
    static void main(String[] args) {

        String a = "JAVA";

        System.out.println(a.length());
//        4


        System.out.println(a.charAt(0));    //j
        System.out.println(a.charAt(2));    //v
        System.out.println(a.charAt(3));


        char[] str = {'j','a','v','a'};
        System.out.println(str);
//        java



        String s = "12JAVA123";

                for (int i = 0; i < s.length(); i++) {
                    System.out.println(s.charAt(i));
                }


        String s1 = "Java";

        s1 = s1.concat(" Programming");
//        The concat() method returns a new String, but the returned value wasn't assigned to s.

        System.out.println(s1);
//        o/p   Java Programming


        String c = "COMPUTER";

        for(int i = 0 ; i < c.length() ; i++){
            if(i%2==0){
                System.out.println(c.charAt(i));
            }
        }


        String r = ("hello");
        



    }
}
