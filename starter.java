/*
 *	Author: Ara B  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Dragon dragon = new Dragon("Daagon", 50,100);
		Griffin peter = new Griffin("Peter", 30, 150);
		Samuri jack = new Samuri("Jack",7,120);
		System.out.println("Welcome to Arcane Path: Castle Siege");
		System.out.println("Greetings Adventurer. Choose your fighter for thy ol\'mighty quest. All you have to do is compleate a set of challanges.");
		System.out.println("----------------------------------");
		System.out.println("Press 1 for Warrior: A sole brute. A powerhouse (just like the mitochandria)");
		System.out.println("Press 2 for Wizard: An ancient mage who knows the secrets of the world.");
		System.out.println("Press 3 for Rouge: A stealthy assasin with no mercy.");
		int x = sc.nextInt();
		sc.nextLine();
		
		//Warrior code
		
		if (x==1){
			System.out.print("What is your Warriors name? ");
			String name = sc.nextLine();
			Warrior a = new Warrior(name,20,70);
			
			
			while (a.getHp()>0 && dragon.getHp()>0){
				
			System .out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
			System.out.println("----------------------------------");
			System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
			System.out.println("----------------------------------");
			System.out.println("Oponents name: " + dragon.getName() + "\nOpponents health: "+ dragon.getHp());
			System.out.println("----------------------------------");
			System.out.print("Your action ? ");
			
			boolean quitchecker=false;	
			
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					int y = a.ultimateAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*3)+1);
				
				if (dragon.getHp()>0){
				if (rando == 1){
					int y = dragon.basicAttack(dragon.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 2){
					int y = dragon.ultimateAttack();
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if (rando == 3){
					dragon.Health();
					}
				}
			}
			
			if (dragon.getHp()<=0){
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Congratulations on slaying " + dragon.getName() + " the dragon. You win");
				
				a.setHp(70);
				System.out.println("Your journey is not finished yet. You still have to defeat the almighty " + peter.getName() + " the Griffin");
				
	//Griffin code			
	
				while(a.getHp()>0 && peter.getHp()>0){
					
					
				System .out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
				System.out.println("----------------------------------");
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Oponents name: " + peter.getName() + "\nOpponents health: "+ peter.getHp());
				System.out.println("----------------------------------");
				System.out.print("Your action ? ");
				
				boolean quitchecker=false;	
			
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					int y = a.ultimateAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*4)+1);
				
				if (peter.getHp()>0){
				if ((rando == 1 || rando == 2)){
					int y = peter.basicAttack(peter.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 3){
					peter.ultimateAttack();
					System.out.println("----------------------------------");
				}else if (rando == 4){
					peter.Health();
					}
				}
			}
			
			if (peter.getHp()<=0){
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Congratulations on slaying " + peter.getName() + " the Griffin. You almost won");
				
				
				a.setHp(70);
				System.out.println("Nice job. Now for your final boss you have to defeat Samuri Jack (not from Disney)");
				
				while(a.getHp()>0 && jack.getHp()>0){
					
					
				System .out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
				System.out.println("----------------------------------");
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Oponents name: " + jack.getName() + "\nOpponents health: "+ jack.getHp());
				System.out.println("----------------------------------");
				System.out.print("Your action ? ");
				
				
				boolean quitchecker=false;	
			
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					int y = a.ultimateAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*3)+1);
				
				if (jack.getHp()>0){
				if (rando == 1){
					int y = jack.basicAttack(jack.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 2){
					int y = jack.ultimateAttack();
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if (rando == 3){
					jack.Health();
					}
				}
			}
				
			if (jack.getHp()<=0){
			System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
			System.out.println("----------------------------------");
			System.out.println("Congratulations on slaying " + jack.getName() + " the Samuri. You won.\nThis is it the end of the missery that you call Arcane Path: Castle Siege.");
				
					
			}else if (a.getHp()<=0){
			System.out.println("Oponents name: " + jack.getName() + "\nOpponents health: "+ jack.getHp());
			System.out.println("----------------------------------");
			System.out.println("And thats how ends the story of the great warrior by the name of " + a.getName() + ". By getting sliced in half");
			}
				
				
			}else if (a.getHp()<=0){
				System.out.println("Oponents name: " + peter.getName() + "\nOpponents health: "+ peter.getHp());
				System.out.println("----------------------------------");
				System.out.println("And thats how ends the story of the great warrior by the name of " + a.getName() + ". By dying to a Griffin");
				}
			}else if (a.getHp()<=0){
				System.out.println("Oponents name: " + dragon.getName() + "\nOpponents health: "+ dragon.getHp());
				System.out.println("----------------------------------");
				System.out.println("And thats how ends the story of the great warrior by the name of " + a.getName() + ".By failing to slaughter the dragon");
			}
			
			
		//Wizard code	
			
			
		}else if(x==2){
			System.out.print("What is your Wizards name? ");
			String name = sc.nextLine();
			Wizard a = new Wizard(name,45,60);
			
			while(a.getHp()>0 && dragon.getHp()>0){
			
			System .out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
			System.out.println("----------------------------------");
			System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
			System.out.println("----------------------------------");
			System.out.println("Oponents name: " + dragon.getName() + "\nOpponents health: "+ dragon.getHp());
			System.out.println("----------------------------------");
			System.out.print("Your action ? ");
				
			boolean quitchecker = false;
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					a.ultimateAttack();
					System.out.println("----------------------------------");
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*3)+1);
				
				if (dragon.getHp()>0){
				if (rando == 1){
					int y = dragon.basicAttack(dragon.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 2){
					int y = dragon.ultimateAttack();
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if (rando == 3){
					dragon.Health();
					}
				}
			}
			
			if (dragon.getHp()<=0){
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				
				System.out.println("Congratulations on slaying " + dragon.getName() + " the dragon. You win");
				
				a.setHp(60);
				System.out.println("Your journey is not finished yet. You still have to defeat the almighty " + peter.getName() + " the Griffin");
				
		//Griffin code		
				while(a.getHp()>0 && peter.getHp()>0){
					
					
				System .out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
				System.out.println("----------------------------------");
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Oponents name: " + peter.getName() + "\nOpponents health: "+ peter.getHp());
				System.out.println("----------------------------------");
				System.out.print("Your action ? ");
				
			boolean quitchecker = false;
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					a.ultimateAttack();
					System.out.println("----------------------------------");
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*4)+1);
				
				if (peter.getHp()>0){
				if (rando == 1 || rando == 2) {
					int y = peter.basicAttack(peter.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 3){
					peter.ultimateAttack();
					System.out.println("----------------------------------");
				}else if (rando == 4){
					peter.Health();
					}
				}
			}
			
			if (peter.getHp()<=0){
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Congratulations on slaying " + peter.getName() + " the Griffin. You almost won");
				
				a.setHp(60);
				System.out.println("Nice job. Now for your final boss you have to defeat Samuri Jack (not from Disney)");
				
					while(a.getHp()>0 && jack.getHp()>0){
	
				System.out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
				System.out.println("----------------------------------");
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Oponents name: " + jack.getName() + "\nOpponents health: "+ jack.getHp());
				System.out.println("----------------------------------");
				System.out.print("Your action ? ");
				
			boolean quitchecker = false;
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					a.ultimateAttack();
					System.out.println("----------------------------------");
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*3)+1);
				
				if (jack.getHp()>0){
				if (rando == 1){
					int y = jack.basicAttack(jack.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 2){
					int y = jack.ultimateAttack();
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if (rando == 3){
					jack.Health();
					}
				}
			}
				
			if (jack.getHp()<=0){
			System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
			System.out.println("----------------------------------");
			System.out.println("Congratulations on slaying " + jack.getName() + " the Samuri. You won.\nThis is it the end of the missery that you call Arcane Path: Castle Siege.");
				
					
			}else if (a.getHp()<=0){
			System.out.println("Oponents name: " + jack.getName() + "\nOpponents health: "+ jack.getHp());
			System.out.println("----------------------------------");
			System.out.println("And thats how ends the story of the great wizard by the name of " + a.getName() + ". By getting sliced in half");
			}
				
	
			}else if (a.getHp()<=0){
				System.out.println("Oponents name: " + peter.getName() + "\nOpponents health: "+ peter.getHp());
				System.out.println("----------------------------------");
				System.out.println("And thats how ends the story of the great wizard by the name of " + a.getName() + ". By dying to a Griffin");
				}
				
			}
			else if (a.getHp()<=0){
				System.out.println("Oponents name: " + dragon.getName() + "\nOpponents health: "+ dragon.getHp());
				System.out.println("----------------------------------");
				System.out.println("And thats how ends the story of the great wizard by the name of " + a.getName() + ".By failing to slaughter the dragon");
			}
			
		}
			
			//Rouge code 
			
			else if (x==3){
			System.out.print("What is your Rouges name? ");
			String name = sc.nextLine();
			Rouge a = new Rouge(name,35,50);
			
				while(a.getHp()>0 && dragon.getHp()>0){
				System .out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
			System.out.println("----------------------------------");
			System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
			System.out.println("----------------------------------");
			System.out.println("Oponents name: " + dragon.getName() + "\nOpponents health: "+ dragon.getHp());
			System.out.println("----------------------------------");
			System.out.print("Your action ? ");
				
			boolean quitchecker = false;
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					a.ultimateAttack();
					System.out.println("----------------------------------");
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*3)+1);
				
				if (dragon.getHp()>0){
				if (rando == 1){
					int y = dragon.basicAttack(dragon.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 2){
					int y = dragon.ultimateAttack();
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if (rando == 3){
					dragon.Health();
					}
				}
			}
			
			if (dragon.getHp()<=0){
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				
				System.out.println("Congratulations on slaying " + dragon.getName() + " the dragon. You win");
				
				
				a.setHp(50);
				System.out.println("Your journey is not finished yet. You still have to defeat the almighty " + peter.getName() + " the Griffin");
				
				
				
				while(a.getHp()>0 && peter.getHp()>0){
					
					
				System .out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
				System.out.println("----------------------------------");
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Oponents name: " + peter.getName() + "\nOpponents health: "+ peter.getHp());
				System.out.println("----------------------------------");
				System.out.print("Your action ? ");
				
			boolean quitchecker = false;
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					a.ultimateAttack();
					System.out.println("----------------------------------");
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*4)+1);
				
				if (peter.getHp()>0){
				if ((rando == 1 || rando == 2)){
					int y = peter.basicAttack(peter.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 3){
					peter.ultimateAttack();
					System.out.println("----------------------------------");
				}else if (rando == 4){
					peter.Health();
					}
				}
			}
			
			if (peter.getHp()<=0){
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Congratulations on slaying " + peter.getName() + " the Griffin. You almost won");
				
				a.setHp(50);
				
				
				System.out.println("Nice job. Now for your final boss you have to defeat Samuri Jack (not from Disney)");
				
					while(a.getHp()>0 && jack.getHp()>0){
	
				System.out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
				System.out.println("----------------------------------");
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Oponents name: " + jack.getName() + "\nOpponents health: "+ jack.getHp());
				System.out.println("----------------------------------");
				System.out.print("Your action ? ");
				
				
				boolean quitchecker = false;
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					a.ultimateAttack();
					System.out.println("----------------------------------");
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*3)+1);
				
				if (jack.getHp()>0){
				if (rando == 1){
					int y = jack.basicAttack(jack.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 2){
					int y = jack.ultimateAttack();
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if (rando == 3){
					jack.Health();
					}
				}
			}
				
			if (jack.getHp()<=0){
			System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
			System.out.println("----------------------------------");
			System.out.println("Congratulations on slaying " + jack.getName() + " the Samuri. You won.\nThis is it the end of the missery that you call Arcane Path: Castle Siege.");
				
					
			}else if (a.getHp()<=0){
			System.out.println("Oponents name: " + jack.getName() + "\nOpponents health: "+ jack.getHp());
			System.out.println("----------------------------------");
			System.out.println("And thats how ends the story of the great wizard by the name of " + a.getName() + ". By getting sliced in half");
			}
				
				
				
			
			}else if (a.getHp()<=0){
				System.out.println("Oponents name: " + peter.getName() + "\nOpponents health: "+ peter.getHp());
				System.out.println("----------------------------------");
				System.out.println("And thats how ends the story of the great warrior by the name of " + a.getName() + ". By dying to a Griffin");
				}
			}else if (a.getHp()<=0){
				System.out.println("Oponents name: " + dragon.getName() + "\nOpponents health: "+ dragon.getHp());
				System.out.println("----------------------------------");
				System.out.println("And thats how ends the story of the stealthy rouge fighter by the name of " + a.getName() + ". By failing to slaughter the dragon");
			}
			
			
			//Mr. Poole code
			
		}else if (x==589){
			System.out.println("Secret Chaacter selected. Playing as Mr Poole");
			String name = "Mr.Poole";
			Poole a = new Poole(name,99,99); 
			
				while(a.getHp()>0 && dragon.getHp()>0){
					
			System .out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
			System.out.println("----------------------------------");
			System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
			System.out.println("----------------------------------");
			System.out.println("Oponents name: " + dragon.getName() + "\nOpponents health: "+ dragon.getHp());
			System.out.println("----------------------------------");
			System.out.print("Your action ? ");
				
			boolean quitchecker = false;
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					a.ultimateAttack();
					System.out.println("----------------------------------");
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*3)+1);
				
				if (dragon.getHp()>0){
				if (rando == 1){
					int y = dragon.basicAttack(dragon.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 2){
					int y = dragon.ultimateAttack();
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if (rando == 3){
					System.out.println("----------------------------------");
					dragon.Health();
					System.out.println("----------------------------------");
					}
				}
			}
			
			if (dragon.getHp()<=0){
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				
				System.out.println("Congratulations on slaying " + dragon.getName() + " the dragon. You almost won");
				
				a.setHp(50);
				System.out.println("Your journey is not finished yet. You still have to defeat the almighty " + peter.getName() + " the Griffin");
				
				
				
				while(a.getHp()>0 && peter.getHp()>0){
					
					
				System .out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
				System.out.println("----------------------------------");
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Oponents name: " + peter.getName() + "\nOpponents health: "+ peter.getHp());
				System.out.println("----------------------------------");
				System.out.print("Your action ? ");
				
			
			boolean quitchecker = false;
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					dragon.setHp(dragon.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					a.ultimateAttack();
					System.out.println("----------------------------------");
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				if(quitchecker==true){
					break;
				}
				
				int rando = (int)((Math.random()*4)+1);
				
				if (peter.getHp()>0){
				if ((rando == 1 || rando == 2)){
					int y = peter.basicAttack(peter.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 3){
					peter.ultimateAttack();
					System.out.println("----------------------------------");
				}else if (rando == 4){
					peter.Health();
					}
				}
			}
			
			if (peter.getHp()<=0){
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Congratulations on slaying " + peter.getName() + " the Griffin. You almost won");
				
				
					a.setHp(99);
				
				
				System.out.println("Nice job. Now for your final boss you have to defeat Samuri Jack (not from Disney)");
				
					while(a.getHp()>0 && jack.getHp()>0){
	
				System.out.println("Press b for basic attack" + "\nPress u for ultimate attack" + "\nPress q to quit");
				System.out.println("----------------------------------");
				System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
				System.out.println("----------------------------------");
				System.out.println("Oponents name: " + jack.getName() + "\nOpponents health: "+ jack.getHp());
				System.out.println("----------------------------------");
				System.out.print("Your action ? ");
				
				boolean quitchecker=false;
				
				
				while (true){
					String action =sc.nextLine();
					action.toLowerCase();
				
				System.out.println("----------------------------------");
			
				if (action.equals("q")){
					System.out.print("Well adventurer see'ya next time");
					quitchecker=true;
					break;
				}else if (action.equals("b")){
					int y = a.basicAttack(a.getPwr());
					System.out.println("----------------------------------");
					jack.setHp(jack.getHp() - y);
					break;
				}
				else if (action.equals("u")){
					a.ultimateAttack();
					System.out.println("----------------------------------");
					break;
				}else{
					System.out.println("Invalid input. Try again");
					System.out.print("----------------------------------\n");
					}
				}
				
				if (quitchecker==true){
					break;
				}
			
				int rando = (int)((Math.random()*3)+1);
				
				if (jack.getHp()>0){
				if (rando == 1){
					int y = jack.basicAttack(jack.getPwr());
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if(rando == 2){
					int y = jack.ultimateAttack();
					System.out.println("----------------------------------");
					a.setHp(a.getHp() - y);
				}else if (rando == 3){
					jack.Health();
					}
				}
			}
				
			if (jack.getHp()<=0){
			System.out.println("Your name: " + a.getName() + "\nYour health: "+ a.getHp());
			System.out.println("----------------------------------");
			System.out.println("Congratulations on slaying " + jack.getName() + " the Samuri. You won.\nThis is it the end of the missery that you call Arcane Path: Castle Siege.");
				
					
			}else if (a.getHp()<=0){
			System.out.println("Oponents name: " + jack.getName() + "\nOpponents health: "+ jack.getHp());
			System.out.println("----------------------------------");
			System.out.println("And thats how ends the story of the great wizard by the name of " + a.getName() + ". By getting sliced in half");
			}
				
				
			
			}else if (a.getHp()<=0){
				System.out.println("Oponents name: " + peter.getName() + "\nOpponents health: "+ peter.getHp());
				System.out.println("----------------------------------");
				System.out.println("And thats how ends the story of the great warrior by the name of " + a.getName() + ". By dying to a Griffin");
				}
			}
			if (a.getHp()<=0){
				System.out.println("Oponents name: " + dragon.getName() + "\nOpponents health: "+ dragon.getHp());
				System.out.println("----------------------------------");
				System.out.println("And thats how ends the story of the great warrior by the name of " + a.getName() + ".By failing to slaughter the dragon");
			}
			
			
			
		}else{
			System.out.println("Invalid input re-run the code to try again.");
		}
			
	}
}
