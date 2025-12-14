package com.bluescope;

	class List<T> {       
	    T value;

	    List(T value) {    
	        this.value = value;
	    }

	    void display() {
	        System.out.println("Value: " + value);
	    }
	}public class Generics {
	    public static void main(String[] args) {

	    	List<Integer> intData = new List<>(10); 
	        intData.display();

	        List<String> strData = new List<>("Hello"); 

	        strData.display();
	    }
	}



