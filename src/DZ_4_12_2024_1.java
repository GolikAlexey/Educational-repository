public class DZ_4_12_2024_1 {
    public static void main(String[] args) {
        StringBuilder Text1 = new StringBuilder();
        Text1.append(" Текст с повторяющимися символами ");
        StringBuilder bukvy = new StringBuilder();
        bukvy.append(" ");
        System.out.printf("Исходная строка: \"%s\"\n", Text1);
        Text1 = modifyStr(Text1, bukvy, 0, 0);
        System.out.printf("Изменённая строка: \"%s\"", Text1);
    }

    static StringBuilder modifyStr(StringBuilder text, StringBuilder bukvy, int i, int j){

        if(text.charAt(i) == bukvy.charAt(j)){
            text.deleteCharAt(i);
            if(i == text.length()-1){
                bukvy.deleteCharAt(0);
                return bukvy;
            }else{
                return modifyStr(text, bukvy,0, 0);
            }
        } else{
            if(j == bukvy.length()-1){
                bukvy.append(text.charAt(i));
                return modifyStr(text, bukvy,i+1, 0);
            }else{
                return modifyStr(text, bukvy,0, j+1);
            }
        }
    }
}
