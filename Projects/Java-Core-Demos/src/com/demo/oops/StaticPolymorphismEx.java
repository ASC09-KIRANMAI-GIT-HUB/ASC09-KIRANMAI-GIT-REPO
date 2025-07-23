package com.demo.oops;

public class StaticPolymorphismEx {

    public static void main(String[] args) {
        Movie freeSolo = new Movie();
        freeSolo.play();
        freeSolo.play("English");
    }
    
}

class Movie {
    public void play(){
        System.out.println("Playing Movie");
    }
    public void play(String subtitle){
        System.out.println("Playing movie with subtitle: "+subtitle);
    }
}
