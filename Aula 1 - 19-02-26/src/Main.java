public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("Ana Souza");
        cliente.setEmail("ana.souza@email.com");
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Email do cliente: " + cliente.getEmail());
    }
}