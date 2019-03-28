public class Dcod {

    private String abc ="АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public String dcode(int shift, String str){
        String[] symbols = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for(String symbol : symbols){
            if (isLetter(symbol)){
                int let = shift + abc.indexOf(symbol);
                if(let>32) let = let - 33;
                if(let<0) let = let +33;
                stringBuilder.append(abc.charAt(let));
            }
            else stringBuilder.append(symbol);
        }
        return stringBuilder.toString();
    }
    public boolean isLetter(String symbol) {
        return abc.contains(symbol);
    }
}
