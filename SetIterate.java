import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Set <Pirates> s1= new HashSet <Pirates>();
    
    Pirates p1 = new Pirates ("Bobby",5000);
    s1.add(p1);
    Pirates p2 = new Pirates ("Sam",200);
    s1.add(p2);

    //OBJECTIVE:GET SUM OF GOLD 
    

    //Method 1- Using an itterator 
    //Telling java this is an itterator which will be referencing object type <Pirates>, the set we wanna itterate 
    Iterator <Pirates> it = s1.iterator();    
    int sum = 0 ;
    //Will itterate unitl there is none left 
    while (it.hasNext()){
      //it.next() will get us the next object , which is a object type <Pirates>,getvalue is a method from Pirates class
      sum = sum + it.next().getValue();
    }
    System.out.println("Method 1");
    System.out.println(sum);


    

    //Method 2 - Using toArray method for sets 
    //Creating a new piratesArray
    Pirates [] piratesArray = new Pirates[s1.size()];
    //Setting that pointer to a converted s1.array of type(piratesArray)-> we want the converted type to be same as piratesArray
    piratesArray = s1.toArray(piratesArray);
    int sumz = 0 ;
    
    
    for(int i =0 ; i < s1.size() ;i++){
      sumz=sumz+(piratesArray[i].getValue());
    }
    System.out.println("Method 2");
    System.out.println(sumz);




    //Method 3- Using an enhanced FOR loop 
    int sumez = 0 ;
    for(Pirates arbitraryName :s1){
      sumez = sumez + arbitraryName.getValue();
    }
    System.out.println("Method 3");
    System.out.println(sumez);

    
    
    
    

    
    
   
    
   
  
    

    

    
  }

}
