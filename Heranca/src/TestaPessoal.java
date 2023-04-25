
import Pessoal.*;
import Administrativo.*;

public class TestaPessoal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Engenheiro engenheiro = new Engenheiro();
        Secretario secretario = new Secretario();
        Diretor diretor = new Diretor();
        
        secretario.setNome("Maria");
        secretario.setEndereco("Rua A, 25");
        secretario.setAnoFomracao(1999);
        secretario.setLinguas(2);
        secretario.setHorasDiarias(4);
        secretario.setId(123456);
        secretario.setNivel(4);
        secretario.setSalario(5000.00);
        
        //Saídas
        System.out.println("Nome: " + secretario.getNome());
        System.out.println("Endereço: " + secretario.getEndereco());
        System.out.println("Ano formação: " + secretario.getAnoFomracao());
        System.out.println("Linguas: " + secretario.getLinguas());
        System.out.println("Horas diárias: " + secretario.getHorasDiarias());
        System.out.println("ID: " + secretario.getId());
        System.out.println("Nível: " + secretario.getNivel());
        System.out.println("Salário: " + secretario.getSalario());
        //Atulização
        secretario.progredir();
        System.out.println("Novo Salário: " + secretario.getSalario());
        
    }    
}
