import java.util.Scanner; 
 public class StudentGrade{ 
      /** 
      * @param args 
      */ 
     public static void main(String[] args) { 
         System.out.println("Enter the marks obtain of these subject"); 
         Scanner sc=new Scanner (System.in); 
         System.out.print(" DSA   : "); 
         float S1=sc.nextFloat(); 
         System.out.print("Java   : "); 
         float S2=sc.nextFloat(); 
         System.out.print("Python : "); 
         float S3=sc.nextFloat(); 
         System.out.print("English: "); 
         float S4=sc.nextFloat(); 
         System.out.print("OPPS   : "); 
         float S5=sc.nextFloat(); 
         float total=(S1+S2+S3+S4+S5); 
         float percentage=(total)/5; 
         String Grade; 
         if (percentage >= 90) { 
             Grade = "A+"; 
         } else if (percentage >= 80) { 
             Grade = "A"; 
         } else if (percentage >= 70) { 
             Grade = "B+"; 
         } else if (percentage >= 60) { 
             Grade = "B"; 
         } else if(percentage >=55){ 
             Grade = "C+"; 
         } else if(percentage >=50){ 
             Grade="C"; 
         } else if(percentage >=40){ 
             Grade ="D"; 
         } 
         else  { 
             Grade = "F"; 
         } 
  
         System.out.println("The total Mark obtain is: "+total); 
         System.out.println("The total percentage of these Subject is: "+percentage+"%"); 
         System.out.println("Grade: "+Grade); 
     } 
 }
