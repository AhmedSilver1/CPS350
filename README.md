# Data Structures and Algorthims

## Table of Content
- [Overview](#overview)
- [Java reiview](#Java-review)
- [OOP](#OOP)
- [Project1-OOP](#Project1-OOP)
- [Project2-Generic Classes](#Project2-Generic-Classes)

## Overview   

This repository documents my learning process in data structures and algorthims using Java



## Java review
This section is about reviweing OOP using Java.

### OOP
"Object -Oriented Progamming refers to using objects in programmnig that have real life objects propperties." [Geek for Geeks](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)

#### Java class: 
"A class is a user-defiend blueprint from which objects are created"  [Geek for Geeks](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)

#### Java Object: 
"An Onject is a basic unit of OOP that represnts real-life entnties"  [Geek for Geeks](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)


#### Encapsulation: 
"Is the practice  to hide or present information between the pacakge classes"  [Geek for Geeks](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)


#### Inheritance: 
"The idea  of inherting fields or methods from a super class to a child class."  [geelfprgeeks](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)


#### Polymorphism: 
"Is the abilty of OOP to use methods with same name, but with different aplications."  [Geek for Geeks](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)

#### Generics: 
"Generics means parameterized types. The idea is to allow a type (like Integer, String, etc., or user-defined types) to be a parameter to methods, classes, and interfaces." [Geek for Geeks](https://www.geeksforgeeks.org/generics-in-java/)

### Project1-OOP:
Overview: This is an excerise to implement Java OOP for a cafe menu prodcut.
![practice drawio](https://github.com/user-attachments/assets/ea389f18-c813-4f8e-bcd0-a4b15508ce69)

#### The Driver method
```

public class Driver {

	public static void main(String[] args) {
		
		Espresso Latte = new Espresso("Latte",2,"Small",2.13,"Hot",1);
		System.out.println(Latte.toString());
		
		Tea Adani = new Tea("Adani Chai","Black","Small",3.32,"Hot",2);
		System.out.println(Adani.toString());
		
		Pastries Kleja = new Pastries("Kleja","Small",3.32,2);
		System.out.println(Kleja.toString());
	}

}

```
#### The Output
```
Espresso [esspressoName=Latte, shots=2]
Tea [teaName=Adani Chai, teaType=null]
Pastries [pastrieName=Kleja]

```
[Click here to access the source code](src/Project1/src)

### Project2-Generic Classes:
Overview: This is an excerise to implement generic classes on a deck builder classes.
![practice-Projec2-Generics drawio](https://github.com/user-attachments/assets/a12ea859-0e5f-4373-99ed-901ac492831e)

#### The Main Class
```

public class DeckOfCards <T>{
	private T card;

	public T getCard() {
		return card;
	}

	public void setCard(T card) {
		this.card = card;
	}
}

```
#### The first deck class with one genertic type
```
public class DeckOfCards <T>{
	private T card;

	public T getCard() {
		return card;
	}

	public void setCard(T card) {
		this.card = card;
	}
}


```
#### The Second deck class with two genertic type

```
public class Deck2 <T,U> {

	private T card;
	private U copiesInDeck;
	
	public T getCard() {
		return card;
	}
	public void setCard(T card) {
		this.card = card;
	}
	public U getCopiesInDeck() {
		return copiesInDeck;
	}
	public void setCopiesInDeck(U copiesInDeck) {
		this.copiesInDeck = copiesInDeck;
	}
	
	
}

```
#### The output

```
Jack
2
The card: Ace have 2 copies in deck.

```
### Project3-ArrayList:
