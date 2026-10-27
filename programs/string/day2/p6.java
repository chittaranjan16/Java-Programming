package string.day2;

public class p6 {
    public static void main(String[] args) {

        String str = "program";

        int index = indexOF(str , 'g');
        System.out.println(index);
//        g is present at 3 index


    }



//    indexof() method creation in string
    public static int indexOF(String s , char key){

        for(int i = 0 ; i< s.length() ; i++ ){
            if(s.charAt(i) == key){
                return i;
            }
        }
        return -1;
    }
}
