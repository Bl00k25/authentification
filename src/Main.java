import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String iName = "Rakoto" , iPass="123456" , user_name , user_password;
        int essai = 3;
        System.out.println("Hello world!");
        System.out.println("Veuillez vous athentifier en utilisant votre nom et votre mot de passe");
        boolean rightName = false , rightPass = false ;
        while((!rightName || !rightPass) && essai>0)
        {
            System.out.println("\nVous avez encore droit à " + essai + " essai(s)");
            System.out.print("Nom:");
            user_name = scanner.nextLine();
            System.out.print("Mot de passe:");
            user_password = scanner.nextLine();
            essai--;

            rightName = user_name.equals(iName);
            rightPass = user_password.equals(iPass);
            if (essai > 0)
            {
                //if (!rightName) System.out.println("Nom incorrect , veuiller réessayer");
                //if (!rightPass) System.out.println("Mot de passe incorrect , veuiller réessayer");
                System.out.println((!rightName && !rightPass) ? "Nom et mot de passe incorrects , veuiller réessayer" : (!rightName ? "Nom incorrect , veuiller réessayer" : ( !rightPass ? "Mot de passe incorrect , veuiller réessayer" : "" )));
            }
            else
            {
                // if (!rightName) System.out.println("Nom incorrect");
                // if (!rightPass) System.out.println("Mot de passe incorrect");
                System.out.println((!rightName && !rightPass) ? "Nom et mot de passe incorrects" : (!rightName ? "Nom incorrect" : ( !rightPass ? "Mot de passe incorrect" : "" )));
            }
        }
        System.out.println((essai==0 && (!rightName || !rightPass)) ? "Trop de tentatives , veuiller patienter avant de réessayer" : "Bienvenue "+ iName);
    }
}