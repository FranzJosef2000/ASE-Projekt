package main;

import java.io.InputStreamReader;
import java.util.Scanner;

public class packageTrackingManager {

     Scanner scanner = new Scanner(new InputStreamReader(System.in));

     public static void main(String[] args){
          packageTrackingManager packageTrackingManager = new packageTrackingManager();
          packageTrackingManager.mainMenu();
     }
     public void mainMenu(){
          System.out.println("Willkommen im Hauptmenü");
          System.out.println("------------------------");
          System.out.println("1: Packet aufgeben");
          System.out.println("2: Packet organisieren");
          System.out.println("3: Packet verfolgen");
          System.out.println("------------------------");
          System.out.println("Wählen Sie eine Option mittel voranstehender Zahl aus");
          String input = scanner.nextLine();
          if (input.equals("1")){
               System.out.println("Paket aufgeben");
               System.out.println("------------------------");
               postPackage();
          }
          if (input.equals("2")){
               System.out.println("Paket organisieren");
               System.out.println("------------------------");
               organizePackage();
          }
          if (input.equals("3")){
               System.out.println("Paket verfolgen");
               System.out.println("------------------------");
               trackPackage();
          }
          if (!input.equals("1") && !input.equals("2") && !input.equals("3")){
               System.out.println("Eingabe fehlerhaft. Bitte versuchen Sie es erneut");
               System.out.println("------------------------");
               mainMenu();
          }
     }

     public address saveAdress(){
          System.out.print("Vorname: ");
          String firstname = scanner.nextLine();
          System.out.print("Nachname: ");
          String lastname = scanner.nextLine();
          System.out.print("Postleitzahl: ");
          String zipcode = scanner.nextLine();
          System.out.print("Stadt: ");
          String city = scanner.nextLine();
          System.out.print("Straße: ");
          String street = scanner.nextLine();
          System.out.print("Hausnummer: ");
          String house_number = scanner.nextLine();

          System.out.println("Eingabe erfolgreich!");
          return new address(firstname,lastname,zipcode,city,street,house_number);

     }
     public void postPackage(){
          System.out.println("Damit ein Paket aufgegeben werden kann benötigen wir zunächst Ihre Daten:");
          System.out.println("Sie können jederzeit den Dialog abbrechen und zurück zum Hauptmenü gelangen mit der Eingabe esc");
          System.out.println("(Wichtig hier werden die Daten des Absenders benötigt!)");
          address sender_address = saveAdress();
          System.out.println("------------------------");
          System.out.println("Nachdem Ihre Adresse eingetragen wurde müssen die Adressdaten des Empfängers erhoben werden:");
          System.out.println("Sie können jederzeit den Dialog abbrechen und zurück zum Hauptmenü gelangen mit der Eingabe esc");
          System.out.println("(Wichtig hier werden die Daten des Empfängers benötigt!)");
          address receiver_address = saveAdress();
          System.out.println("------------------------");
     }

     public void organizePackage(){
          System.out.println("Dies ist ein geschützter Bereich und ist nur für Mitarbeiter zugänglich");
          mainMenu();
     }

     public void trackPackage(){
          System.out.println("Geben Sie Ihre Sendeverfolgungsnummer an die Ihnen Ihr Sender mitgeteilt hat");
          String sendeverfolgungsnummer = scanner.nextLine();
          System.out.println("Vielen Dank! Ihr Paket wird gesucht ...");
     }
}
