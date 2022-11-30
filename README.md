# Calculator-Java
 This is my simple calculator using Grafic User Interface (GUI). This repository works as a diary to document things I learned during this process. 
 
 ## _Tools_
 
 - Eclipse
 - GuitHub
 - YouTube videos
 
 ## _1 - Creating the interface_
 A graphic user interface (GUI) is a way to communicate with the user of the aplication in a easiar way. Tha *java library swing* has different resouces to make GUI. 
 The JFrame, JPanel and JButton are the basics tools to create our graphic interface. The frame adds the panel and we put each button inside the panel. 
 
 ## _2 - Functions_
 The calculador does  this operations:
 - addition
 - subtraction
 - multiplication
 - division
 - percentage
 - squrare root
 
 ## _3 - ActionListener_
 
 When we use GUI we need to use java.awt and ActionListener to do certain things to interact with the buttons and other tools. 

 
 ## _4 - Graphic User Interface_
 
 This is how my calculator looks like.
 
![image](https://user-images.githubusercontent.com/84158231/203869467-6a729a28-1307-49ab-a285-ffd8ea468a3a.png)

## _5 - Regular Expression_

When the user types the numbers they are stored in a string. I need to use regular expression to split this string in a array because de characters as + or sqrt does not have a clear meaning for my computer. The method was created like this:

```
public void evaluateString(String string) {
    	double result = 0;
    	char [] terms = {'1','2','3','4','5','6', '7','8','9','0','+','-','x','/','^','%','.'};
    	String[] partial = string.split("['+','-','x','/','^','%']");
    	for(int i = 0 ; i < partial.length; i++) {
    		System.out.println(partial[i]);
    	}
    }

```


 
 
