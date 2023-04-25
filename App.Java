package main;

import java.util.Scanner;

// käytä luokkia ja listaa
public class App{
    public static void main(String[] args){ // ei pilkkua!

        public class Zoo {
            public Zoo(String name){
                this.name = name;
            }
        }

        public class animal {
            public String name; // voi olla private
            public int age;

            public animal(String name, int age){
                this.name = name;
                this.age = age;
            }
            public void run(int laps){
                for (int i = 0; i != laps; i++){
                    System.out.println(this.name + " juoksee kovaa vauhtia!");
            }
            }
        } 
        
        
        Scanner scan = new Scanner(System.in); // scanner on olio
        System.out.println("Anna eläintarhalle nimi:");
        zoo = new Zoo(scan.nextLine());

        while (true){
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            int valinta = Integer.parseInt(scan.nextLine());
            //System.out.println(valinta);         
    
            if (valinta == 1){ // == operaattori toimii numeroille, ei merkkijonoille
                System.out.println("Mikä laji?");   
                String laji = scan.nextLine();
                System.out.println("Anna eläimen nimi:");  
                String nimi = scan.nextLine();
                System.out.println("Anna eläimen ikä: ");   
                int age = Integer.parseInt(scan.nextLine());
                //hedgehog.speak(text);
            } else if (valinta == 2){
                System.out.println("Anna siilin nimi:");
                String siiliNimi = scan.nextLine();
                System.out.println("Anna siilin ikä:");
                int siiliAge = Integer.parseInt(scan.nextLine());
                //hedgehog = new Hedgehog(siiliNimi, siiliAge);
            } else if (valinta == 3){
                System.out.println("Kuinka monta kierrosta?");
                int laps = Integer.parseInt(scan.nextLine());
                //hedgehog.run(laps);
            } else if (valinta == 0){
                break;
            } else {
                System.out.println("Syöte oli väärä");
            }

        }
        System.out.println("Kiitos ohjelman käytöstä.");
        scan.close();    
    }

} 