class Student2 implements Study
{
   private String name;
   
   public Student2 (String name)   {
      this.name = name;
   }

   public String getName()   {
      return this.name;
   }

   private void setName(String name)   {
      this.name = name;
   }
}