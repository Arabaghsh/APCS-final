/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Griffin {
	String name;
	int pwr;
	int hp;
	int fullhp;
	
	public Griffin(String name, int pwr, int hp) {
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
	
		System.out.println(this.name + " has attacked 3 times for " +  3 * dmg + " from the sky.");
		return dmg;
	}
	public void ultimateAttack(){
	int add = (int)(Math.random()*10+1);
		System.out.println(this.name + " has increased his stats by " + add);
		pwr+=add;
		hp+=add;
		fullhp+=add;
	}
	public void Health(){
		if (hp<fullhp){
			System.out.println(this.name + " has regenerated 5 health.");
			hp+=5;
			if (hp>fullhp){
				hp = fullhp;
			}
		}else if (hp == fullhp){
			System.out.println(this.name +  " has wasted a move on trying to heal.");
		}
		}
	}


