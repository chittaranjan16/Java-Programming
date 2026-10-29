package string.day4;

//Q8: input: “AssmnAN” output: A=2, A=3, m=1, n=1, N=1?


public class p8 {
    public static void main(String[] args) {

        String str = "AssmnAN";

//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)=='s'){
//                System.out.println("indes is "+i);
//                break;
//            }
//        }

         char c[]=str.toCharArray();

        for(int i=0;i<c.length;i++){
            int count=0;
            for(int j=i+1;j<c.length-1;j++){
                if(c[i]==c[j]){
                    count++;
                    c[j]=' ';

                }

            }
            System.out.println(c[i]+":"+count);
        }



//        for(int i = 0 ; i < str.length() ; i++ )
//        {
//            boolean alreadyCounted = false;
//
//            int count = 1;
//            for(int j = i+1; j < str.length()-1 ; j++ ){
//
//                if(str.charAt(i) == str.charAt(j)){
//                    alreadyCounted = true;
//                    count++;
//                }
//            }
//
//            System.out.println(str.charAt(i) + " : " + count + "  ");
//        }





    }
}
