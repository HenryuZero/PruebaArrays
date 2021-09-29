import java.util.Arrays;
public class pruebaArrays {
    public static void main(String[] args) {
        int[] Array1 =new int[10];
        int[] Array2= new int[10];
        int i;
        for (i=0;i<Array1.length;i++){
            //Math.random maneja valor double de 0.0 a 1.0
         Array1[i]=(int)(Math.random()*10);
         Array2[i]=(int)(Math.random()*10);
        }
        System.out.println("Arrays.toString(Array1): " + Arrays.toString(Array1));
        System.out.println("Arrays.toString(Array2): " + Arrays.toString(Array2));

        //addArrays(Array1,Array2);
        System.out.println("Arrays.toString(ArrayAdd): " + Arrays.toString(addArrays(Array1,Array2)));
        System.out.println("Arrays.toString(ArrayAdd): " + Arrays.toString(SubstractArrays(Array1,Array2)));
        System.out.println("Arrays.toString(ArrayAdd): " + Arrays.toString(MultiplyArrays(Array1,Array2)));
        System.out.println("Arrays.toString(ArrayAdd): " + Arrays.toString(DivideArrays(Array1,Array2)));
    }
    //Este es suma
    public static int[] addArrays (int[] Arreglo1, int[] Arreglo2) {
     int i;
     int[] ArrayAdd = new int[10];
     for (i = 0; i < ArrayAdd.length; i++) {
         ArrayAdd[i] = Arreglo1[i] + Arreglo2[i];
     }
     return ArrayAdd;
 }

    //Este es resta
    public static int[] SubstractArrays (int[] Arreglo1, int[] Arreglo2) {
        int i;
        int[] ArraySubstract = new int[10];
        for (i = 0; i < ArraySubstract.length; i++) {
            ArraySubstract[i] = Arreglo1[i] - Arreglo2[i];
        }
        return ArraySubstract;
    }
    //Este es suma
    public static int[] MultiplyArrays (int[] Arreglo1, int[] Arreglo2) {
        int i;
        int[] ArrayMultiply = new int[10];
        for (i = 0; i < ArrayMultiply.length; i++) {
            ArrayMultiply[i] = Arreglo1[i] * Arreglo2[i];
        }
        return ArrayMultiply;
    }
    //Este es suma
    public static int[] DivideArrays (int[] Arreglo1, int[] Arreglo2) {
        int i;
        int[] ArrayDivide = new int[10];
        for (i = 0; i < ArrayDivide.length; i++) {
            if (Arreglo2[i]==0){
                ArrayDivide[i]=0;
            }
            else{
                ArrayDivide[i] = Arreglo1[i] % Arreglo2[i];
            }
        }
        return ArrayDivide;
    }
}
