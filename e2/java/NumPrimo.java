public class NumPrimo{
    public static void main(String args[]){
        int numP = getNesimoPrimo(1001);
        System.out.println("\n\t El milesimo uno numero primo es: " + numP);
    }

    public static int getNesimoPrimo(int num){
        int i = 0, numP = 1;
        do{
            numP++;
            if(esPrimo(numP)){
                i++;
            }
        }while(num != i);
        return numP;
    }

    public static boolean esPrimo(int num){
        for(int i = 2; i < num ; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}