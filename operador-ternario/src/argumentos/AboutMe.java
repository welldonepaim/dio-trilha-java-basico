package argumentos;

public class AboutMe {
    public static void main(String[] args) {r


        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        System.out.println("ola me chamo" + nome + " " + sobrenome + "tenho " + idade + "\ne " + altura + " \n");
    }

    }

