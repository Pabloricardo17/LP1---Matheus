
import java.util.Scanner;

public class MenuCadastro {

    private RegistroDB registroDB;
    private Scanner teclado;

    public MenuCadastro(RegistroDB registroDB) {
        this.registroDB = registroDB;
        this.teclado = new Scanner(System.in);
    }

    public MenuCadastro() {
        this.registroDB = registroDB;
        this.teclado = new Scanner(System.in);
        desenharMenu();
    }

    public void desenharMenu() {


        int opcao;
        do {
            System.out.println();
            System.out.println("+===================================+");
            System.out.println("|       MENU REGISTRO                     |");
            System.out.println("+===================================+");
            System.out.println("|                                 |");
            System.out.println("|  [1] - Inserir Registros         |");
            System.out.println("|  [2] - Listar Todos              |");
            System.out.println("|  [3] - Pesquisar por Nome         |");
            System.out.println("|  [4] - Remover                   |");
            System.out.println("|  [5] - Atualizar                 |");
            System.out.println("|  [6] - Sair                      |");
            System.out.println("+-----------------------------------+");
            System.out.print("Digite sua opção: ");

            opcao = teclado.nextInt();
            RegistroDB db = new RegistroDB();
            switch (opcao) {
                case 1:
                    int id = teclado.nextInt();
                    String nome = teclado.next();
                    String sobrenome = teclado.next();
                    int idade = teclado.nextInt();
                    db.inserir(new Registro(idade, nome, sobrenome, idade));
                    break;
                case 2:
                    db.listarTodos();
                    break;
                case 3:
                    //  pesquisarPorNome();
                    System.out.println("Teste");
                    break;
                case 4:
                    //removerRegistro();
                    System.out.println("Teste");

                    break;
                case 5:
                    //atualizarRegistro();
                    System.out.println("Teste");
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("");
            }
        } while (opcao != 6);

    }

//   // public void inserirRegistro(){
//
//        //RegistroDB inserirRegistro;
//        public void inserir ( inserirRegistro) {
//
//
//            try {
//                connection = ConexaoDB.getConexao();
//
//                String sql = "INSERT INTO REGISTRO " +
//                        "(id, nome, sobrenome, idade) "
//                        + "VALUES (?, ?, ?, ?)";
//                preparedStatement = connection.prepareStatement(sql);
//
//
//                preparedStatement.setInt(1, registro.getId());
//                preparedStatement.setString(2,  registro.getNome());
//                preparedStatement.setString(3, registro.getSobreNome());
//                preparedStatement.setInt(4, registro.getIdade());
//
//                int linhas = preparedStatement.executeUpdate();
//
//                System.out.println("Linhas alteradas: "+linhas);
//
//            }catch (Exception e) {
//                e.printStackTrace();
//            }finally {
//                if(preparedStatement != null) {
//                    try {
//                        preparedStatement.close();
//                    }catch (Exception e){
//                        System.out.println("Já fechado");
//                    }
//                }
//            }
//        }
//
//    }



}

