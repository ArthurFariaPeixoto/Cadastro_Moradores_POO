import java.util.Objects;
import java.util.Scanner;

public class CadastroMoradoresVetor {


    public static void main(String[] args) {

        int quantidadeMoradores;
        String proximoMorador;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de moradores: ");
        quantidadeMoradores = scan.nextInt();

        DadosMoradores[] dadosMoradores = new  DadosMoradores[quantidadeMoradores];

        System.out.println("Cadastrar um morador: ");

        for(int i = 0 ; i < quantidadeMoradores; i++ )
        {
            dadosMoradores[i] = new DadosMoradores();

            System.out.println("Digite o nome do  morador: ");
            dadosMoradores[i].setNome(scan.next());

            System.out.println("Digite o cpf do  morador: ");
            dadosMoradores[i].setCpf(scan.next());

            System.out.println("Digite o numero de celular do  morador: ");
            dadosMoradores[i].setCelular(scan.next());

            System.out.println("Digite a data de nascimento  do  morador: ");
            dadosMoradores[i].setDataDenascimento(scan.next());

            System.out.println("Digite  sexo  do  morador: ");
            dadosMoradores[i].setSexo(scan.next());

            System.out.println("Digite o bloco do  morador: ");
            dadosMoradores[i].setBloco(scan.next());

            System.out.println("Digite  o número do apartamento do morador: ");
            dadosMoradores[i].setApartamento(scan.next());

            System.out.println("Digite o código de acesso do  morador: ");
            dadosMoradores[i].setCodigoAcesso(scan.next());
            if(i+1<quantidadeMoradores) {
                System.out.println("Deseja cadastrar outro morador? S/N");
                proximoMorador = scan.next();
                if(Objects.equals(proximoMorador, "N") || Objects.equals(proximoMorador, "n")){
                    for(int j = i; j <  quantidadeMoradores; j++){
                        System.out.println("\n\nDados do morador: "+j+
                                "\nNome: "+dadosMoradores[i].getNome()+
                                "\nCPF: "+dadosMoradores[i].getCpf()+
                                "\nTelefone: "+dadosMoradores[i].getCelular()+
                                "\nData de nascimento: "+dadosMoradores[i].getDataDenascimento()+
                                "\nSexo do morador: "+dadosMoradores[i].getSexo()+
                                "\nBloco do morador: "+dadosMoradores[i].getBloco()+
                                "\nNúmero do apartamento do morador: "+dadosMoradores[i].getApartamento()+
                                "\nCódigo de acesso do morador: "+dadosMoradores[i].getCodigoAcesso()+ "\n\n");
                    }
                    System.exit(0);
                }
            }

        }

        for(int i = 0; i <  quantidadeMoradores; i++){
            System.out.println("\n\nDados do morador: "+i+
                    "\nNome: "+dadosMoradores[i].getNome()+
                    "\nCPF: "+dadosMoradores[i].getCpf()+
                    "\nTelefone: "+dadosMoradores[i].getCelular()+
                    "\nData de nascimento: "+dadosMoradores[i].getDataDenascimento()+
                    "\nSexo do morador: "+dadosMoradores[i].getSexo()+
                    "\nBloco do morador: "+dadosMoradores[i].getBloco()+
                    "\nNúmero do apartamento do morador: "+dadosMoradores[i].getApartamento()+
                    "\nCódigo de acesso do morador: "+dadosMoradores[i].getCodigoAcesso()+ "\n\n");
        }

    }
}
