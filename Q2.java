class Q2{
    public static void main(String[] args){
        int n= 1;
        int temp = 0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i>=j){
                    System.out.print(n++ + " ");
                }
               
            }
           
            System.out.println(" ");
        
        }
    }
}