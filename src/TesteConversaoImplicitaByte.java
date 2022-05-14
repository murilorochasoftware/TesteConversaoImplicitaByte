public class TesteConversaoImplicitaByte {

    public static void main(String[] args) {
        byte quantidadeByte = 127;
        short quantidadeShort = quantidadeByte;

        System.out.printf("Quantidade byte = %d", quantidadeByte);
        System.out.printf("\nQuantidade short = %d", quantidadeShort);
    }
}
