public class PrintEnglishText {

    public static void main(String[] args) {

        String aLetter = "A Letter From Abraham Lincoln To His Son’s Teacher";

        String text = " My son starts school today. It is all going to be strange and new to him for a while and I wish you would treat him gently. It is an adventure that might take him across continents. All adventures that probably include wars, tragedy and sorrow. To live this life will require faith, love and courage.\n" +
                "\n" +
                "So dear Teacher, will you please take him by his hand and teach him things he will have to know, teaching him – but gently, if you can. Teach him that for every enemy, there is a friend. He will have to know that all men are not just, that all men are not true. But teach him also that for every scoundrel there is a hero, that for every crooked politician, there is a dedicated leader.\n" +
                "\n" +
                "Teach him if you can that 10 cents earned is of far more value than a dollar found. In school, teacher, it is far more honorable to fail than to cheat. Teach him to learn how to gracefully lose, and enjoy winning when he does win.\n" +
                "\n" +
                "Teach him to be gentle with people, tough with tough people. Steer him away from envy if you can and teach him the secret of quiet laughter. Teach him if you can – how to laugh when he is sad, teach him there is no shame in tears. Teach him there can be glory in failure and despair in success. Teach him to scoff at cynics.\n" +
                "\n" +
                "Teach him if you can the wonders of books, but also give time to ponder the extreme mystery of birds in the sky, bees in the sun and flowers on a green hill. Teach him to have faith in his own ideas, even if every one tell him they are wrong.\n" +
                "\n" +
                "Try to give my son the strength not to follow the crowd when everyone else is doing it. Teach him to listen to every one, but teach him also to filters all that he hears on a screen of truth and take only the good that comes through.\n" +
                "\n" +
                "Teach him to sell his talents and brains to the highest bidder but never to put a price tag on his heart and soul. Let him have the courage to be impatient, let him have the patient to be brave. Teach him to have sublime faith in himself, because then he will always have sublime faith in mankind, in God.\n" +
                "\n" +
                "This is the order, teacher but see what best you can do. He is such a nice little boy and he is my son.,;:() ";

        String countText = text.replaceAll("\\p{Punct}", " ");

        String[] textSplit = countText.trim().split("\\s+");

        for (String  symbol :  textSplit) {

            System.out.println( symbol);

        }

    }

}





