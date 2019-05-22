/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg254002;

 

import java.util.ArrayList;
import java.util.Scanner;
 
import javax.swing.plaf.synth.SynthSeparatorUI;
 
public class I254002 {
    private static Scanner s = new Scanner(System.in);
   
    public static void main(String [] args) {     
        ArrayList<Utwor> bazaUtworow = new ArrayList<Utwor>();   
        String tytul, CzytajTytul, CzytajAutora, NowyTytul, NowyAutor;    
        int menu = 0;
       
       
        Utwor utwor1 = new Utwor("Chinska Ukladanka", "Jan Rapowanie");
        Utwor utwor2 = new Utwor("Witaj w 2003", "OSTR");
        Utwor utwor3 = new Utwor("Tinder", "Książe Kapota");
       
        bazaUtworow.add(utwor1);
        bazaUtworow.add(utwor2);
        bazaUtworow.add(utwor3);
     
        do {
            menu = printMenu();
            switch(menu) {
                case 1:
                    if(bazaUtworow.isEmpty()) {
                        System.out.println("Brak utworow");
                        break;                     
                    }
                    for(Utwor k: bazaUtworow) {
                        System.out.println(k);
                    }
                    break;
                case 2:
                    System.out.println("Podaj tytul utworu: ");
                    CzytajTytul = s.nextLine();
                    System.out.print("Podaj autora utworu: ");
                    CzytajAutora = s.nextLine();
                    int sprawdz=0;
                    for(int i = 0 ; i <bazaUtworow.size(); i++) {
                        if(bazaUtworow.get(i).getTytul().equals(CzytajTytul)) {
                            System.out.print("Utwor juz jest w bazie!");
                            sprawdz++;
                        }                  
                    }
                    if(sprawdz == 0){
                        bazaUtworow.add(new Utwor(CzytajTytul, CzytajAutora));
                        System.out.println("Pomyślnie dodano utwor!");
                    }            
                    break;
                case 3:
                    if(bazaUtworow.isEmpty()) {
                        System.out.println("Brak utworow");
                        break;                     
                    }
                    System.out.print("Podaj tytul utworu: ");
                    tytul = s.nextLine();
                    int sprawdz2 = 0;
                    for(int i = 0 ; i <bazaUtworow.size(); i++) {
                        if(bazaUtworow.get(i).getTytul().equals(tytul)) {
                            bazaUtworow.remove(bazaUtworow.get(i));                           
                            sprawdz2++;
                        }                  
                    }
                    if(sprawdz2 == 0)
                        System.out.println("Nie ma takiego utworu w bazie!");
                    break;
                
                case 4:
                    if(bazaUtworow.isEmpty()) {
                        System.out.println("Brak utworow");
                        break;                     
                    }
                    System.out.print("Podaj tytul utworu, ktorego dane chcesz zmienic: ");
                    tytul = s.nextLine();
                    int sprawdz3 = 0;
                    for(int i = 0 ; i <bazaUtworow.size(); i++) {
                        if(bazaUtworow.get(i).getTytul().equals(tytul)) {
                            bazaUtworow.remove(bazaUtworow.get(i));
                            System.out.println("Podaj tytul utworu: ");
                            NowyTytul = s.nextLine();
                            System.out.print("Podaj autora utworu: ");
                            NowyAutor = s.nextLine();
                            bazaUtworow.add(i,new Utwor(NowyTytul, NowyAutor));                           
                            sprawdz3++;
                            break;
                        }                  
                    }
                    if(sprawdz3 == 0)
                        System.out.println("Nie ma takiego utworu w bazie!");
                    
                    break;
                case 5:
                    System.out.println("Koniec programu!");        
                    break;
            }
           
        } while(menu != 5);
       
       
    }
   
   
    public static int printMenu() {
        System.out.print("\nMenu:\n"
                + "1 - pokaz wszystkie utwory\n"
                + "2 - dodaj nowy utwor\n"
                + "3 - usun utwor\n"
                + "4 - zmien dane\n"
                + "5 - koniec programu\n"
                + "Wybór:");
        int wybor = s.nextInt();
        s.nextLine();
        return wybor;
    }
 
}
 

class Utwor {
    private String tytul;
    private String autor;
   
   
    public Utwor(String tytul, String autor) {
        super();
        this.tytul = tytul;
        this.autor = autor;
    }
       
    public String getTytul() {
        return tytul;
    }
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        return this.getTytul() + " | " + this.getAutor();
    } 
   
}
 

    


