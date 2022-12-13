public class OddEvenSigns {
    public static boolean checkChangesOddEven (String compared1, String compared2){
        char[]toBeCompared=compared1.toCharArray();
        for (int i = 0; i < toBeCompared.length-2; i++) {
            changeLetters(toBeCompared,i,i+2);
            compared1= new String(toBeCompared);
            if (compared1.equals(compared2)) return true;
        }
        return false;
    }
    public static char[] changeLetters(char[] array,int index1,int index2){
       char temp = array[index1];
       array[index1]=array[index2];
       array[index2]=temp;
       return array;
    }

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdab";
        System.out.println(checkChangesOddEven(a,b));
    }
}
