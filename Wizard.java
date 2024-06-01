/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Wizard {
	String name;
	int pwr;
	int hp;
	int fullhp;
	
	public Wizard(String name, int pwr, int hp) {
		this.name = name;
		this.pwr = pwr;
		this.hp = hp;
		fullhp = hp;
	}
	public String getName(){
		return name;
	}
	public int getHp(){
		return hp;
	}
	public int getPwr(){
		return pwr;
	}
	public void setHp(int x){
		hp=x;
	}
	public int basicAttack(int pwr){
		int dmg = (int)(Math.random()*pwr);
		if (dmg < 10){
			dmg+=10;
		}
		System.out.println(this.name + " has attacked for " + dmg);
		return dmg;
	}
	public void ultimateAttack(){
		if (hp<fullhp){
			System.out.println(this.name + " has regenerated 10 health.");
			hp+=10;
			if (hp>fullhp){
				hp = fullhp;
			}
		}else if (hp == fullhp){
			System.out.println("WOOOOOOOW you did not need to heal that bad. Congrats on wasting a move.");
		}
	}

}
