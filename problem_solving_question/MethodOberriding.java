/*
 * How to create Method Overriding
 * program in java
 * 
 */

 package problem_solving_question;
 class Bank{
    public String getInterst(){return "0";}
 }

 class IslamikBank extends Bank{
    public String getInterst(){return "2";}
 }
 
 class XIAMBank extends Bank{
    public String getInterst(){return "5";}
 }

  class DhakaBank extends Bank{
    public String getInterst(){return "4";}
 }

 public class MethodOberriding{
   public static void main(String args[]){
      IslamikBank ib = new IslamikBank();
      XIAMBank xb = new XIAMBank();
      DhakaBank db = new DhakaBank();
      System.out.println("IslamikBank interst of: "+ib.getInterst());
      System.out.println("XIAMBank interst of: "+xb.getInterst());
      System.out.println("DhakaBank interst of: "+db.getInterst());
   }
 }