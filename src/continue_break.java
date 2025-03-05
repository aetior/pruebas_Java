public class continue_break {
    public static void main(String[] args) {
        System.out.println("Imprime el Numero par");

        for(var i= 0; i < 20; i++){
                if (i%2==1){
                    continue;
                }
                    System.out.print(i+" ");
        }
    }
}
