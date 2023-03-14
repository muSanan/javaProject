package strings;

public class StringTrim {
    public static void main(String[] args) {

        /*
        trim

         */
        String batch = "            Batch 2 is cool        ";
        System.out.println(batch);

        batch = batch.trim();
        System.out.println(batch);//Batch 2 is cool - без пробелов

        System.out.println(batch.contains("cool"));//true

        batch = batch.concat("Bena");// Batch 2 is cool + Bena
        System.out.println(batch);




    }
}
