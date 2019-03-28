public class Main {

    private  static  String Txt =
                    "ЗТЕФТИ ЧЦФТ!\n" +
                    "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
                    "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
                    "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.\n";

    public static void main(String[] args) {
        System.out.print("Текс который нужно расшифравать:\n"+Txt);
        Dcod dcod = new Dcod();
        String[] text = Txt.split("\n");
        System.out.println("Расшифрованая первая строка:\n" + dcod.dcode(-4, text[0]));
        System.out.println("Расшифрованая вторая строка:\n" + dcod.dcode(8, text[1]));
        System.out.println("Расшифрованая третья строка:\n");
        for (int i = 1; i < 32; i++) {
            System.out.println(dcod.dcode(i, text[2]));
        }
        String[] words = text[3].split(" ");
        for (int j = 0; j < words.length; j++) {
            System.out.println("Варианты расшифровки " + (j + 1) + " слова:");
            for (int i = 1; i < 34; i++) {
                System.out.print(dcod.dcode(i, words[j]) + " ");
            }
            System.out.println();
        }

    }
}
