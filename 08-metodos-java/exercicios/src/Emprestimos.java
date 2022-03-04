public class Emprestimos {

    public static void calcularJurosSimples(double valor, int parcelasMensais, double porcetagemTaxaAnual){
        double emprestimoTotal, jurosTotal;

        jurosTotal = valor* (porcetagemTaxaAnual/100);

        emprestimoTotal =  jurosTotal + valor;

        System.out.println("O valor total do empréstimo é: R$ " + emprestimoTotal + "\nSendo " + parcelasMensais + " parcelas de R$ " + emprestimoTotal/parcelasMensais );

    }
}
