import java.util.Objects;
import java.util.Scanner;

public class CadastroMoradoresVetor {


    public static void main(String[] args) {

        int quantidadeMoradores;
        String proximoMorador;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de moradores: ");
        quantidadeMoradores = scan.nextInt();

        DadosMoradores[] moradores = new  DadosMoradores[quantidadeMoradores];

        System.out.println("Cadastrar um morador: ");

        for(int i = 0 ; i < quantidadeMoradores; i++ )
        {
            moradores[i] = new DadosMoradores();

            System.out.println("Digite o nome do  morador: ");
            moradores[i].setNome(scan.next());

            System.out.println("Digite o cpf do  morador: ");
            moradores[i].setCpf(scan.next());

            System.out.println("Digite o numero de celular do  morador: ");
            moradores[i].setCelular(scan.next());

            System.out.println("Digite a data de nascimento  do  morador: ");
            moradores[i].setDataDenascimento(scan.next());

            System.out.println("Digite  sexo  do  morador: ");
            moradores[i].setSexo(scan.next());

            System.out.println("Digite o bloco do  morador: ");
            moradores[i].setBloco(scan.next());

            System.out.println("Digite  o número do apartamento do morador: ");
            moradores[i].setApartamento(scan.next());

            System.out.println("Digite o código de acesso do  morador: ");
            moradores[i].setCodigoAcesso(scan.next());
            if(i+1<quantidadeMoradores) {
                System.out.println("Deseja cadastrar outro morador? S/N");
                proximoMorador = scan.next();
                if(Objects.equals(proximoMorador, "N") || Objects.equals(proximoMorador, "n")){
                    for(int j = i; j <  quantidadeMoradores; j++){
                        System.out.println("\n\nDados do morador: " +j+
                                "\nNome: " +  moradores[i].getNome()+"\nCPF: "+moradores[i].getCpf()+"\nTelefone: "+moradores[i].getCelular()+"\nData de nascimento: "+
                                moradores[i].getDataDenascimento()+"\nSexo do morador: "+moradores[i].getSexo()+"\nBloco do morador: "+moradores[i].getBloco()+"\nNúmero do apartamento do morador: "+moradores[i].getApartamento()+
                                "\nCódigo de acesso do morador: "+moradores[i].getCodigoAcesso()+ "\n\n");
                    }
                    System.exit(0);
                }
            }

        }

        for(int i = 0; i <  quantidadeMoradores; i++){
            System.out.println("\n\nDados do morador: " +i+
                    "\nNome: " +  moradores[i].getNome()+"\nCPF: "+moradores[i].getCpf()+"\nTelefone: "+moradores[i].getCelular()+"\nData de nascimento: "+
                    moradores[i].getDataDenascimento()+"\nSexo do morador: "+moradores[i].getSexo()+"\nBloco do morador: "+moradores[i].getBloco()+"\nNúmero do apartamento do morador: "+moradores[i].getApartamento()+
                    "\nCódigo de acesso do morador: "+moradores[i].getCodigoAcesso()+ "\n\n");
        }

    }
}
