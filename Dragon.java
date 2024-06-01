/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dragon {
	String name;
	int pwr;
	int hp;
	int fullhp;
	
	public Dragon(String name, int pwr, int hp) {
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
		int dmg = (int)((Math.random()*pwr));
		if (dmg < 10){
			dmg+=5;
		}
		System.out.println(this.name + " has attacked for " + dmg);
		return dmg;
	}
	public int ultimateAttack(){
		System.out.println(name + " is using his ultimate attack which damaged you for 15 damage");
		int dmg = 15;
		return dmg;
	}
	
	
	public void Health(){
	if (hp<fullhp){
			System.out.println(this.name + " has regenerated 5 health.");
			hp+=5;
		if (hp>fullhp){
				hp = fullhp;
			}
		}	else if (hp == fullhp){
				System.out.println(this.name +  " has wasted a move on trying to heal.");
		}
	}

}
