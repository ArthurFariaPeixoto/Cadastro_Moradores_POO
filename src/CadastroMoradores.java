import java.util.Objects;
import java.util.Scanner;

public class CadastroMoradores {

    public static void main(String[] args){
        int quantidadeMoradores;
        String proximoMorador;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de moradores: ");
        quantidadeMoradores = scan.nextInt();



        for(int i=0; i<quantidadeMoradores; i++){
            DadosMoradores dadosMoradores = new DadosMoradores();

            System.out.println("Digite o nome do morador: ");
            dadosMoradores.setNome(scan.next());

            System.out.println("Digite o cpf do morador: ");
            dadosMoradores.setCpf(scan.next());

            System.out.println("Digite o numero de telefone do morador: ");
            dadosMoradores.setCelular(scan.next());

            System.out.println("Digite a data de nascimento do morador: ");
            dadosMoradores.setDataDenascimento(scan.next());

            System.out.println("Digite o sexo do morador: ");
            dadosMoradores.setSexo(scan.next());

            System.out.println("Digite o bloco do morador: ");
            dadosMoradores.setBloco(scan.next());

            System.out.println("Digite o apartamento do morador: ");
            dadosMoradores.setApartamento(scan.next());

            System.out.println("Digite o codigo de acesso do morador: ");
            dadosMoradores.setCodigoAcesso(scan.next());

            System.out.println("\n\nDados do morador: \n\nNome: "+dadosMoradores.getNome()+"\nCPF: "+dadosMoradores.getCpf()+"\nTelefone: "+dadosMoradores.getCelular()+"\nData de nascimento: "+dadosMoradores.getDataDenascimento()+
                    "\nSexo: "+dadosMoradores.getSexo()+"\nBloco: "+dadosMoradores.getBloco()+"\nApartamento: "+dadosMoradores.getApartamento()+"\nCodigo de acesso: "+dadosMoradores.getCodigoAcesso()+"\n");

            if(i+1<quantidadeMoradores) {
                System.out.println("Deseja cadastrar outro morador? S/N");
                proximoMorador = scan.next();
                if(Objects.equals(proximoMorador, "N") || Objects.equals(proximoMorador, "n")){
                    System.exit(1);
                }
            }

        }
    }
}
