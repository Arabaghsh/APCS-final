/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Samuri {
	String name;
	int pwr;
	int hp;
	int fullhp;
	
	public Samuri(String name, int pwr, int hp) {
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
		int dmg = (int)((Math.random()*pwr)+2);
	
		System.out.println(this.name + " has sliced you for " + dmg + ".");
		System.out.println(this.name + " has sliced you for " + dmg + " again.");
		System.out.println(this.name + " has sliced you for " + dmg + " and again.");
		return 3*dmg;
	}
	public int ultimateAttack(){
	int dmg = (int)((Math.random()*pwr)+6);
	System.out.println(this.name + " has sliced you for " + dmg + ", and regenerated a little bit of health.");
	hp+=5;
		if (hp>fullhp){
			hp = fullhp;
		}
	return dmg;
	
	}
	public void Health(){
		if (hp<fullhp){
			System.out.println(this.name + " has regenerated 10 health.");
			hp+=10;
			if (hp>fullhp){
				hp = fullhp;
			}
		}else if (hp == fullhp){
			System.out.println(this.name +  " has wasted a move on trying to heal.");
		}
		}
	}


