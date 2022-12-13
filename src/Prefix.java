public class Prefix {
    public static String shortestWord(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words.length - i; j++) {
                if (words[j - 1].length() > words[j].length()) {
                    String temp = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = temp;
                }
            }
        }
        return words[0];
    }
    public static String findPrefix(String[]words){
        String result= shortestWord(words);
        for (String toBeTested: words) {
            for (int i = 0; i<result.length(); i++) {
              if(result.charAt(i)!=toBeTested.charAt(i))
                  result=result.substring(0,i);
              continue;
            }
        }
        return result;
    }
        public static void main (String[]args){
            String[] words = {"Saaataaaaaaa","Saaataaaaaaa","Saaat","Saaattttt","Saaattttttttttttt","Saaatnqqqqqqq"};
            System.out.println(findPrefix(words));
        }
}