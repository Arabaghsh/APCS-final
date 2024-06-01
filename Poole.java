/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Poole {
	String name;
	int pwr;
	int hp;
	int fullhp;
	
	public Poole(String name, int pwr, int hp) {
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
	public void setHp(int hp){
		this.hp=hp;
	}
	public int basicAttack(int pwr){
		int dmg = (int)((Math.random()*pwr));
		if (dmg < 10){
			dmg+=5;
		}
		System.out.println(this.name + " has attacked for " + dmg);
		return dmg;
	}
	public void ultimateAttack(){
		int add = (int)(Math.random()*10+1);
		System.out.println(this.name + " has increased his stats by " + add);
		pwr+=add;
		hp+=add;
		if (hp>fullhp){
			fullhp=hp;
		}
		
	}

}
