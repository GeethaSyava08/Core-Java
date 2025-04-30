package Module1;
class Grosupercon {
	Grosupercon() {
         System.out.println("3");
    }
}

class Google extends Grosupercon {
    Google(String name) {
        System.out.println("1");
    }
}

class Amazon extends Google {
    Amazon()
    {
    	
        super("name");
        System.out.println("2");
    }

    public static void main(String[] args) {
      new Amazon();  
       }
    

	
}


