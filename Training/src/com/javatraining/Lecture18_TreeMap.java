package com.javatraining;

import java.util.*;    
class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
public class Lecture18_TreeMap {    
public static void main(String[] args) {    
    
	//Creating map of Books    
    Map<Integer,Book> map=new HashMap<Integer,Book>();    
    
    //Creating Books    
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
    
    //Adding Books to map   
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer, Book> mapVar: map.entrySet()){    //Returns a Set view of the mappings contained in this map. 
        
    	int key=mapVar.getKey();  
        Book b=mapVar.getValue(); 
        
        System.out.print(key+" Details:");  
        System.out.println(b.id+"_"+b.name+"_"+b.author+"_"+b.publisher+"_"+b.quantity);   
        
     //TreeMap   
        Map<String, String> mapLang = new TreeMap<>();
        
        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");
         
        System.out.println("TreeMap Output in sorted order" + mapLang); //the TreeMap sorts its keys by their natural ordering, which is the alphabetical order in this case.
    }    
}    
}    