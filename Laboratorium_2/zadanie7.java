package com.company;

public class Main {

    public static void main(String[] args) {
        Card cardOne = new Card(Card.Value.czworka, Card.Color.karo);
        Card cardTwo = new Card(Card.Value.as, Card.Color.pik);
        Card cardThree = new Card(Card.Value.krol, Card.Color.kier);
        System.out.println(cardOne.getValue() + " " + cardOne.getColor());
        System.out.println(cardTwo.getValue() + " " + cardTwo.getColor());
        System.out.println(cardThree.getValue() + " " + cardThree.getColor());
    }
}
class Card
{
private Value value;
private Color color;

public Card(Value x, Color y){
    this.value = x;
    this.color = y;
}

enum Color{
        kier, karo, trefl, pik;
}
enum Value{
        dwojka, trojka, czworka, piatka, szostka, siodemka, osemka, dziewiatka, dziesiatka, walet, dama, krol, as, joker;
}

public Color getColor(){
    return color;
}
public Value getValue(){
    return value;
}
}
