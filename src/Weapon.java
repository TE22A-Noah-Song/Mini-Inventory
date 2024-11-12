import java.util.Random;
public class Weapon extends Item{
public int MinDamage=1;
public int MaxDamage=10;

public int Attack(){
    Random rand = new Random();
    int Damage = rand.nextInt((MaxDamage - MinDamage) + 1) + MinDamage;
    return Damage;
}
}
