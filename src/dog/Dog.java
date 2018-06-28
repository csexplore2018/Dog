/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

public class Dog {

    public String name= "Dog";
    public String food="Bone";
    
    public static void main(String[] args) {
       Animal doggoA= new Animal();
       System.out.println(doggoA.name);
       doggoA.talk();
       
       Bitch doggoB= new Bitch();
       System.out.println(doggoB.name);
       doggoB.talk();
       
       Sire doggoC= new Sire();
       System.out.println(doggoC.name);
       doggoC.talk();
    }  
}

class Animal {

    public String name = "Animal";
    public String food="Food";

    public void talk(){ 
        System.out.println("Hey.");  
    }
}



class Bitch extends Animal{
    public String name = "Ellie";
 public void talk(){ 
     System.out.println("Woof");
 }
}

class Sire extends Bitch {
    public String name = "Doggo";
}

//hall0