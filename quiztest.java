import java.util.Scanner;
import package1.Score;   //importing package1 for calculating score

interface result
{
  void calc(String x);
}

//QUESTION 1

  class ques1 extends Thread implements result 
    {
         public void calc(String x)
           { 
               Score sc = new Score();             //Object of class score 
               String s2;
               s2 =new String("1"); 
               if(x.equals(s2))
                     {
                          System.out.println("*******GooD JoB!!CORRECT ANSWER******");sc.caly();
                      }
                else
                     {
                           System.out.println("*******ooPs!!WRONG ANSWER******");
                           System.out.println("Correct ans is :Static variable ");
                     }
            }
 


         public void run()
           {
               String n;
               System.out.println("Q1.Another name for Class variable");
               System.out.println("(1) Static Variable");
               System.out.println("(2) Instance Variables");
               System.out.println("(3) Local Variables");
               System.out.println("(4) None");
               System.out.print("Enter Your Choice : ");
               Scanner s = new Scanner(System.in);
               n= s.next();
               calc(n);
           }
    
    }

//QUESTION 2  
   class ques2 extends Thread implements result
     { 
        public void calc(String x)
          { 
            Score sc = new Score();
            String s2;
            s2 =new String("4"); 
            if(x.equals(s2))
               {
                 System.out.println("*******GooD JoB!!CORRECT ANSWER******");sc.caly();
               }
            else
               {
                  System.out.println("*******ooPs!!WRONG ANSWER******");
                  System.out.println("Correct ans is: .class files"); 
               }
          }


       public void run()   
          {
          String n;
          System.out.println("Q2.A package is a set of:");
          System.out.println("(1) class files");
          System.out.println("(2) abstract class files");
          System.out.println("(3) scanner class files ");
          System.out.println("(4) .class files");
          System.out.print("Enter Your Choice: ");
          Scanner s = new Scanner(System.in);
          n= s.next();
          calc(n);
        }
}
//QUESTION 3  
    class ques3 extends Thread implements result
      { 
          public void calc(String x)
           { 
             Score sc = new Score();
             String s2;
             s2 =new String("2"); 
              if(x.equals(s2))
                {
                   System.out.println("*******GooD JoB!!CORRECT ANSWER******");sc.caly();
                 }
              else
                {
                  System.out.println("*******ooPs!!WRONG ANSWER******");
                  System.out.println("Correct answer is : multiple");
                }
           }
       public void run()
          {  String n;
              System.out.println("Ques3.Which type of inheritance java does not implement directly:");
              System.out.println("(1) multilevel");
              System.out.println("(2) multiple inheritance");
              System.out.println("(3) single inhertiance");
              System.out.println("(4) hierarchy");
              System.out.print("Enter Your Choice :");
              Scanner s = new Scanner(System.in);
              n = s.next();
             calc(n); 
          }


}
//QUESTION 4  
  class ques4 extends Thread implements result
    { 
       public void calc(String x)
        {
          Score sc = new Score(); 
          String s2;
          s2 =new String("3"); 
          if(x.equals(s2))
           {
             System.out.println("*******GooD JoB!!CORRECT ANSWER******");sc.caly();
           }
          else
            {
             System.out.println("*******ooPs!!WRONG ANSWER******");
             System.out.println("Correct answer is :public and default");
            }

  }

     public void run()
       {  String n;  
          System.out.println("Q4.Allowed Access Specifiers for a class"); 
          System.out.println("(1) public and private");
          System.out.println("(2) public, private and protected");
          System.out.println("(3) public and default");
          System.out.println("(4) public, private and default");
          System.out.print("Enter Your Choice :");
          Scanner s = new Scanner(System.in);
          n= s.next();
          calc(n);
       }

}
//QUESTION5  
  class ques5 extends Thread implements result
     {  
         public void calc(String x)
           {   Score sc = new Score();
               String s2;
               s2 =new String("1"); 
               if(x.equals(s2))
                 {
                     System.out.println("*******GooD JoB!!CORRECT ANSWER******");sc.caly();
                 }
              else
                 {
                     System.out.println("*******ooPs!!WRONG ANSWER******");
                      System.out.println("Correct ans is :1Byte") ;                 
                 }
           }


         public void run()
           {  String n;
              System.out.println("Q5.Memory allocation for char data type in bytes");
              System.out.println("(a) 1 byte");
              System.out.println("(b) 2 bytes"); 
              System.out.println("(c) 3 bytes");
              System.out.println("(d) 4 bytes");
              System.out.print("Enter Your Choice:");
              Scanner s = new Scanner(System.in);
              n= s.next();
              calc(n);    
          }
    }
  
 class quiztest
{
  public static void main(String args[])
   
   {  
      System.out.println("\t\t\tWelcome to Java Quiz");
      System.out.println("\n\t=>You have 5 multiple choice questions.");
      System.out.println("\t=>Each question has 4 choices.");
      System.out.println("\t=>Enter the answer number as your answer");
      System.out.println("\t=>Each correct choice will fetch you 1 point");
      System.out.println("\t =>Are you ready for the quiz?(y/n)");  
       Scanner s = new Scanner(System.in);
       String r= s.next();
       String s1= new String("y");
          
          if(r.equals(s1))
           {
             ques1 q1 =new ques1();
             ques2 q2 =new ques2();
             ques3 q3 =new ques3();
             ques4 q4 =new ques4();
             ques5 q5 =new ques5();
             q1.run();
  
              q2.run();
  
              q3.run();
  
               q4.run();
        
              q5.run();  
 
              Score sc = new Score();
              sc.display();  
           }
     else
        {
           System.out.println("Ok ! bye") ;
         } 
  
}
}          