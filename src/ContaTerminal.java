public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float saldo = 237.48F;

        System.out.println("Digite seu nome:");
        String nomeDaConta = scanner.next();

        System.out.println("Digite um numero da conta de 6 digitos. ");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Digite um numero para sua agencia 000-0");
        String numeroDaAgencia = scanner.next();

        System.out.println("Olá "+ nomeDaConta +", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ numeroDaAgencia +", conta " + numeroDaConta +
                " e seu saldo "+ saldo +" já está disponível para saque");
    }
}
