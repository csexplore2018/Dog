/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author gc_science13
 */
public class Dog {

    public String name= "Dog";
    public String food="Bone";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Animal doggoA= new Animal();
       doggoA.talk();
       
              Bitch doggoB= new Bitch();
       doggoB.talk();
       
              Sire doggoC= new Sire();
       doggoC.talk();
    }  
}

class Animal {

    public String name = "Animal";
    public String food="Food";

    public void talk(){ System.out.println("Hey.");  }
}



class Bitch extends Animal{
 public void talk(){ System.out.println("Woof");}
}

class Sire extends Bitch {
    public String name = " Doggo";
}

