package br.ufrn.imd;

public class Musician extends Person{

    public boolean playClassicalMusic;
    public boolean canImprovise;
    public boolean canCompose;

    Musician(){}

    Musician(boolean playClassicalMusic,boolean canImprovise, boolean canCompose){
        this.playClassicalMusic = playClassicalMusic;
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;
    }

    public void play(){}

}
