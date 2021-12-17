package one.digitalinovation.basecamp;

public class Mensagem
{
    /**
     * Pega a Saudação conforme a hora
     * @param hour hora inteiro
     */
    public static void getSaudation(int hour)
    {
        if (hour >= 5 && hour <= 12) {
            messageGoodMornig(hour);
        }

        if (hour >= 13 && hour <= 17) {
            messageGoodAfternoon(hour);
        }

        if (hour >= 18 && hour <= 23 || hour >= 0 && hour <= 4) {
            messageGoodNight(hour);
        }
    }

    /**
     * Mensagem de Bom dia
     * @param hour hora inteiro
     */
    private static void messageGoodMornig(int hour){
        System.out.println("Good Morning !!! agora são " + hour + "hs");
    }

    /**
     * Mensagem de Boa Tarde
     * @param hour hora inteiro
     */
    private static void messageGoodAfternoon(int hour){
        System.out.println("Good Afternoon !!! agora são " + hour + "hs");
    }

    /**
     * Mensagem de Boa noite
     * @param hour hora inteiro
     */
    private static void messageGoodNight(int hour){
        System.out.println("Good Night !!! agora são " + hour + "hs");
    }
}
