
package AppBanco;

public class TestaContaBanco {
    
    public static void main(String[] args) {
        
        //Compilando as contas do banco
        
        ContaBanco objConta1 = new ContaBanco();
        objConta1.setNome("juca");
        objConta1.setNumConta(123);
        objConta1.setSaldoConta(500);
        
        ContaBanco objConta2 = new ContaBanco();
        objConta2.setNome("Pericles");
        objConta2.setNumConta(456);
        objConta2.setSaldoConta(1000);
        
        
        System.out.println("Saldo das contas cadastradas no banco:");
        System.out.println("Saldo Conta 1: " + objConta1.getSaldoConta());
        System.out.println("Saldo Conta 2: " + objConta2.getSaldoConta());
        System.out.println("");
        
        //Depositor R$ 100 na Conta1
        objConta1.depositar(100);
        
        //Sacar R$ 400 da Conta2
        objConta2.sacar(400);
        
        System.out.println("Saldo das contas após depósito e transferência:");
        System.out.println("Saldo Conta 1: " + objConta1.getSaldoConta());
        System.out.println("Saldo Conta 2: " + objConta2.getSaldoConta());
        System.out.println("");
        
        //Transferir R$ 100 da Conta1 para a Conta2
        System.out.println("Tentativa de transfêrencia entre as contas:");
        if (objConta1.transferir(500, objConta2)){
            System.out.println("Transferência bem sucedida");
        } else {
            System.out.println("Houve uma falha na transferência, valor insu"
                    + "ficiente, saldo não alterado");
        }
        
        System.out.println("Saldo Conta 1: " + objConta1.getSaldoConta());
        System.out.println("Saldo Conta 2: " + objConta2.getSaldoConta());
    }
    
}
