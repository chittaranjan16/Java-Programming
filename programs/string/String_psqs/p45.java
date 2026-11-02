package string.String_psqs;

//Q45: Remove Extra space in given string
//Input:__java__is___very__easy__?
//Ouput: “java_is_very_easy”

public class p45 {
    public static void main(String[] args) {

        String s = "   java   is   very  easy      ?";

        String result = s.trim().replaceAll("\\s+"," ");

        System.out.println(result);
    }

}
