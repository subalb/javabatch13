public class assignment41 {
    public static void main(String args[]) {
        String str = "Mississippi";
        char[] chArray = str.toCharArray();
        System.out.println("The word is:" + str);
        System.out.print("Duplicate Characters in above word are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chArray[i] == chArray[j]) {
                    System.out.print(chArray[j] + " ");
                    break;
                }
            }
        }
    }
}
