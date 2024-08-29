public class Portalogica {
    public static void main(String[] args) throws Exception {
        
        //PORTA SAÍDA AND
        boolean portaAnd = andGate(true, false);

        System.out.println("Saída da porta AND: " + portaAnd);

        //PORTA SAÍDA OR
        boolean portaOr = orGate(false, false);

        System.out.println("Saída da porta OR: " + portaOr);

        //PORTA SAÍDA XOR
        boolean portaXor = xorGate(true, true);

        System.out.println("Saída da porta XOR: " + portaXor);

        //Porta SAÍDA NOT
        boolean portaNot = notGate(true);

        System.out.println("Saída da porta NOT: " + portaNot);
    }

    //PORTA AND
    public static boolean andGate (boolean input1, boolean input2) {
        return input1 && input2;
    }

    //PORTA OR
    public static boolean orGate (boolean input1, boolean input2) {
        return input1 || input2;
    }

    //PORTA XOR
    public static boolean xorGate(boolean input1, boolean input2){
        return input1 ^ input2;
    }
    
    //Porta NOT
    public static boolean notGate(boolean input1) {
        return !input1;
    }
}