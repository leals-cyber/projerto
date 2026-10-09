
public class Main {

    public static String processarUsuario(String nome) {

        if (nome == null || nome.trim().isEmpty()) {
            return "Digite seu nome para continuar.";
        }

        return "Olá, " + nome + "!\n"
                + "seja bem vindo  .";
    }
}