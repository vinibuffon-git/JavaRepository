//Igor Porto e Vinícius Buffon

package AppIMC;

import tools.Entrada;

public class TestePessoa {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome(Entrada.leiaString("Digite o seu nome"));
        pessoa1.setIdade(Entrada.leiaInt("Digite sua idade"));
        pessoa1.setAltura(Entrada.leiaDouble("Digite a sua altura"));
        pessoa1.setPeso(Entrada.leiaDouble("Digite o seu peso"));
        pessoa1.setSexo(Entrada.leiaChar("Digie o seu sexo dentre M e F"));

        System.out.println(pessoa1.getNome() + " seu status do IMC é: " + pessoa1.CalcualrIMC() + ".");
        
        System.exit(0);
    }
}
