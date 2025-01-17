// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 6>
// Author      : Caleb Ewer & 1222131495
// Description : Monster file with getters and setters to use with Assignment 6 file

public class Monster
{
    // Complete the class
    private String name;
    private int healthScore;
    private Weapon Weapon;
    
    Monster(String name, int healthScore, Weapon Weapon)
    {
        this.name = name;
        this.healthScore = healthScore;
        this.Weapon = Weapon;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getHealthScore()
    {
        return healthScore;
    }
    
    public String getWeaponName()
    {
        return Weapon.getName();
    }
    
    public int attack(Monster name)
    {
      int attackDamage = (int)(Math.random()* this.Weapon.getMaxDamage());
      name.healthScore = name.healthScore - attackDamage;
      return attackDamage;
    }
    
}