public class Program{
      
    public static void main(String[] args) {
          
        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType); 
         
        switch(b1.bookType){
            case BELLETRE:
                System.out.println("____Belletre");
                break;
            case SCIENCE:
                System.out.println("____Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("______Science fiction");
                break;
            case PHANTASY:
                System.out.println("_______Phantasy");
                break;
        }
    }
}

  
