class Q7{
    public static void main(String[] args){
        char ch='F';
        
        for(int i=1;i<=6;i++){
            char temp = ch;
                
            for(int j=1;j<=6;j++){
                if(i>=j){
                    System.out.print(temp++ + " ");
                    

                }
                
               
            }
                ch--;
           
            System.out.println(" ");
            
        }
    }
}