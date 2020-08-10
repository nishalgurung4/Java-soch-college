class Variable
{
  //This is instance variable
   String name;

	
}

class VariableDemo
{
   public static void main(String[] args)
   {
     Variable v1 = new Variable();
     v1.name = "Anil";
     Variable v2 = new Variable();
     System.out.println(v2.name);
     System.out.println(v1.name);
   }
}
