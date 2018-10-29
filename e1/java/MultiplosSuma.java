public class MultiplosSuma{
    public static void main(String args[]){
        int suma = getSumBelow(1000);
        System.out.println("\n\t La suma de los multiplos de 3 y 5 menores a 1000 es: " + suma);
    }

    public static int getSumBelow(int num){
        int suma = 0;
        for(int i = 0; i < num ; i ++){
            if(isMultiple(i,3) || isMultiple(i,5)){
                suma+=i;
            }
        }
        return suma;
    }

    public static boolean isMultiple(int num,int div){
        if((num%div) != 0) return false;
        return true;
    }
}