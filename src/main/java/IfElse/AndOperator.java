package IfElse;

public class AndOperator {
    public static void main(String[] args) {

        if (2 < 3){
            System.out.println("hello");
        }
        if (5 < 10){
            System.out.println("hello");
        }

//==============================================

        if (2<3 && 5 < 10){
            System.out.println("bye bye");
        }
        if (false && true){
            System.out.println("potato");
        }
        if (true && false){
            System.out.println("do smth");
        }
        if (true && true){
            System.out.println("hello");
        }

        //================================================

        String actualUsername;
        String actualPassword;
        String actualEmail;

        String enteredUsername;
        String enteredPassword;
        String enteredEmail;


        /*if (actualUsername.equals(enteredUsername) && actualPassword.equals(enteredPassword)){
            System.out.println("logged in");
        } else if (actualUsername.equals(enteredUsername) && !actualPassword.equals(enteredPassword)){
            System.out.println("incorrect password, try again");
        } else if (!actualUsername.equals(enteredUsername)){
            System.out.println("username doesn't exist");
            if (actualPassword.equals(enteredPassword) && actualEmail.equals(enteredEmail))
            System.out.println("recover username");
        } else if (actualUsername.equals(enteredUsername) && actualEmail.equals(enteredEmail) && !actualPassword.equals(enteredPassword)){
            System.out.println("recover email");
        }

         */








    }
}
