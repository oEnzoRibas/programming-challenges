package LC7_ReverseInteger;

class Solution {
    public int reverse(int x) {
    int reversed = 0;
    
        while (x != 0) {
            int digit = x % 10;  // Pega o último dígito

            // Verifica se vai ocorrer overflow ao multiplicar por 10
            if (reversed > (Integer.MAX_VALUE / 10) || reversed < (Integer.MIN_VALUE / 10)) {
                System.out.println("Overflow detectado");
                return 0; // Retorna 0 se houver overflow
            }

            reversed = reversed * 10 + digit; // Adiciona o dígito ao reverso
            x /= 10; // Remove o último dígito
        }
        return reversed;
}
}
