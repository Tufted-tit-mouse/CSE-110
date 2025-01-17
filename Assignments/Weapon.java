// CSE 110     : CSE 110 / Online
// Assignment  : Assignment 6>
// Author      : Caleb Ewer & 1222131495
// Description : Weapon file with getters and setters to use with Assignment 6 file

public class Weapon
{
    // Complete the class
    private String name;
    private int maxDamage;
    
    Weapon()
    {
      name = "Pointy Stick";
      maxDamage = 1;
    }
    
    Weapon(String name, int maxDamage)
    {
       this.name = name;
       this.maxDamage = maxDamage;
    }
    
    public String getName()
    {
        return name;
    }
    
    void setName(String Name)
    {
        this.name = Name;
    }
    
    public int getMaxDamage()
    {
        return maxDamage;
    }
    
    void setMaxDamage(int MaxDamage)
    {
        this.maxDamage = MaxDamage;
    }
    
    
}