package grupoE_WesleyPolianaLeonardoLucas;

import java.util.Random;
import java.util.Scanner;

public class GrupoE_WesleyPolianaLeonardoLucas {

    /*
                    Centro Universitario Senac 
                    TADS - 1º semestre de 2020 
                    < Dr. Fernando Almeida> 

                    Projeto SEMESTRAL I
                    Arquivo: < Grupo E - WesleyPolianaLeonardoLucas >

                    < Wesley Alexandre Coelho > 
                    < Poliana Camila Araujo Neves > 
                    < Leonardo Camiletti Chiva > 
                    < Lucas Pereira Costa >
    
                    < 14/06/2020 > 
     */
    static Scanner entrada = new Scanner(System.in);
    static int opcao = 0;

    //Criação do tabuleiro
    static String[][] inicializarTabuleiro() {
        String[][] matriz = new String[3][3];
        for (int i = 0; i < matriz.length; i++) { // Linha
            for (int j = 0; j < matriz[0].length; j++) { // Coluna
                matriz[i][j] = "_";
            }
        }
        return matriz;
    }

    //Imprime tabuleiro
    static void imprimirTabuleiro(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // Linha
            for (int j = 0; j < matriz[0].length; j++) //Coluna
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }

    //Explica a regra do jogo.
    static void imprimeMenuPrincipal() {
        System.out.println("Bem vindo ao Jogo da Velha!!!");
        System.out.println("Preencha com as coordenadas linha x coluna");
        System.out.println("O jogo terminará 3 pontos, a cada partida vencida, ganha 1 ponto!");
        System.out.println("Boa sorte!!!");
        System.out.println("");
    }

    static void jogadaMaquinaFacil(String[][] matriz, String jogador1) {
        boolean check;

        if (jogador1.equals("X")) {
            check = false;
            while (check == false) {
                int xM = xMaquina();
                int yM = yMaquina();
                if (matriz[xM][yM].equals("_")) {
                    matriz[xM][yM] = "X";
                    check = true;
                }
            }
        } else {
            check = false;
            while (check == false) {
                int xM = xMaquina();
                int yM = yMaquina();
                while (!matriz[xM][yM].equals("_")) {
                    System.err.println("Essa posição já está ocupada, digite em outra posição!!!");
                    xM = xMaquina();
                    yM = yMaquina();
                }
                /*  if (matriz[xM][yM].equals("_")) {
                    matriz[xM][yM] = "jogador1";
                    check = true;
                }*/

                if (matriz[xM][yM].equals("_")) {
                    matriz[xM][yM] = "O";
                }
            }
        }
    }

    static void menu(String[][] matriz, String[] jogador) {
        int x;
        System.out.println("Digite 1 para jogar o modo: Jogador X Jogador");
        System.out.println("Digite 2 para jogar o modo: Jogador contra a Máquina - Nível Fácil");
        opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                jogadaUsuario(matriz, jogador);
                break;
            case 2:
                jogadaUsuario(matriz, jogador);
                break;
        }
    }

    // Ler linha
    static int leiaCoordenadaDaLinha() {
        int linha;
        System.out.print("Digite a linha: (0 | 1 | 2): ");
        linha = entrada.nextInt();
        return linha;
    }

    // Ler coluna
    static int leiaCoordenadaDaColuna() {
        int coluna;
        System.out.print("Digite a coluna: (0 | 1 | 2): ");
        coluna = entrada.nextInt();
        System.out.println("");
        return coluna;
    }

    // De acordo acordo com a linha(int linha) e coluna(int coluna) passadas pelo jogador (X ou O (String jogador), na função jogar() valida se a posição
    // está preenchida, se não preenche de acordo com o jogador passado como parâmetro)
    static boolean posicaoValida(int linha, int coluna, String[][] matriz, String jogador) {
        if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
            if (matriz[linha][coluna].equals("_")) {
                matriz[linha][coluna] = jogador;
                return true;
            } else {
                while (!matriz[linha][coluna].equals("_")) {
                    System.err.println("Essa posição já está ocupada, digite em outra posição!!!");
                    linha = leiaCoordenadaDaLinha();
                    coluna = leiaCoordenadaDaColuna();
                }
                if (matriz[linha][coluna].equals("_")) {
                    matriz[linha][coluna] = jogador;
                }
            }
        }
        return false;
    }

    static void jogar(String[][] matriz, String[] jogador) {
        int jogada, pontX = 0, pontO = 0;
        String v;
        int linha = 0, coluna = 0, x;
        boolean cont = false;
        while (pontX < 3 || pontO < 3) {
            String jogador1 = jogador[0];
            for (jogada = 1; jogada <= 9; jogada++) {
                imprimirTabuleiro(matriz);
                if ("X".equals(jogador1)) {
                    System.out.println("É a vez do jogador X");
                    linha = leiaCoordenadaDaLinha();
                    coluna = leiaCoordenadaDaColuna();
                } else {
                    System.out.println("É a vez do jogador O");
                    linha = leiaCoordenadaDaLinha();
                    coluna = leiaCoordenadaDaColuna();
                }
                if (posicaoValida(linha, coluna, matriz, jogador1)) {
                    if (opcao != 2) {
                        if ("X".equals(jogador1)) {
                            jogador1 = "O";
                        } else {
                            jogador1 = "X";
                        }
                    }
                }
                while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                    System.err.println("Jogada inválida, digite um número de 0 à 2!!!");
                    linha = leiaCoordenadaDaLinha();
                    coluna = leiaCoordenadaDaColuna();
                }
                if (jogada >= 5) {
                    x = validacao(matriz, linha, coluna, jogador1);
                    v = verificaVencedor(x, pontX, pontO);
                    verificaVelha(jogada, pontX, pontO);
                    cont = ganhador(x);
                    pontX = pontX(x, pontX);
                    pontO = pontO(x, pontO);
                    if (pontX == 3) {
                        System.exit(0);
                    } else if (pontO == 3) {
                        System.exit(0);
                    }
                    if (cont == true) {
                        break;
                    }
                    if ("X".equals(v)) {
                        jogador[0] = "X";
                        jogador[1] = "O";
                    } else {
                        jogador[0] = "O";
                        jogador[1] = "X";
                    }
                }
                if (opcao == 2 && jogada < 9) {
                    jogadaMaquinaFacil(matriz, jogador1);
                    jogada++;
                    if (jogada >= 5) {
                        x = validacao(matriz, linha, coluna, jogador1);
                        v = verificaVencedor(x, pontX, pontO);
                        verificaVelha(jogada, pontX, pontO);
                        cont = ganhador(x);
                        pontX = pontX(x, pontX);
                        pontO = pontO(x, pontO);
                        if (pontX == 3) {
                            System.exit(0);
                        } else if (pontO == 3) {
                            System.exit(0);
                        }
                        if (cont == true) {
                            break;
                        }
                        if ("X".equals(v)) {
                            jogador[0] = "X";
                            jogador[1] = "O";
                        } else {
                            jogador[0] = "O";
                            jogador[1] = "X";
                        }
                    }
                }
            }
            limpaMatriz(matriz);
        }
    }

    static String[][] limpaMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "_";
            }
        }
        return matriz;
    }

    static int validacao(String[][] matriz, int linha, int coluna, String jogador1) {
        int jogo = 0, X = 0, O = 0;
        int empate = 0;
        if (O < 3 && X < 3) {
            X = 0;
            O = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                if (matriz[0][i] == "X") {
                    X++;
                } else if (matriz[0][i] == "O") {
                    O++;
                }
            }
        }
        if (O < 3 && X < 3) {
            X = 0;
            O = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                if (matriz[1][i] == "X") {
                    X++;
                } else if (matriz[1][i] == "O") {
                    O++;
                }
            }
        }
        if (O < 3 && X < 3) {
            X = 0;
            O = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                if (matriz[2][i] == "X") {
                    X++;
                } else if (matriz[2][i] == "O") {
                    O++;
                }
            }
        }
        if (O < 3 && X < 3) {
            X = 0;
            O = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                if (matriz[i][0] == "X") {
                    X++;
                } else if (matriz[i][0] == "O") {
                    O++;
                }
            }
        }
        if (O < 3 && X < 3) {
            X = 0;
            O = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                if (matriz[i][1] == "X") {
                    X++;
                } else if (matriz[i][1] == "O") {
                    O++;
                }
            }
        }
        if (O < 3 && X < 3) {
            X = 0;
            O = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                if (matriz[i][2] == "X") {
                    X++;
                } else if (matriz[i][2] == "O") {
                    O++;
                }
            }
        }
        if (O < 3 && X < 3) {
            X = 0;
            O = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                if (matriz[i][i] == "X") {
                    X++;
                } else if (matriz[i][i] == "O") {
                    O++;
                }
            }
        }
        if (O < 3 && X < 3) {
            X = 0;
            O = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                if ((matriz[0][2] == "X") && (matriz[1][1] == "X") && (matriz[2][0] == "X")) {
                    X++;
                } else if ((matriz[0][2] == "O") && (matriz[1][1] == "O") && (matriz[2][0] == "O")) {
                    O++;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == "X" || matriz[i][j] == "O") {
                    empate++;
                }
            }
        }
        if (O == 3) {
            jogo = 1;
        } else if (X == 3) {
            jogo = 2;
        } else if (empate == 9) {;
            jogo = 0;
        }
        return jogo;
    }

    static boolean ganhador(int jogo) {
        if (jogo == 1 || jogo == 2) {
            return true;
        }
        return false;
    }

    //Verifica se algum dos jogadores ganhou, se sim, qual.
    static String verificaVencedor(int jogo, int pontX, int pontO) {
        String jogador = null;
        switch (jogo) {
            case 1:
                System.out.printf("O jogador 'O' ganhou!!! \n");
                jogador = "O";
                pontuacao(jogo, pontX, pontO);
                break;
            case 2:
                System.out.println("O jogador 'X' ganhou!!! \n");
                jogador = "X";
                pontuacao(jogo, pontX, pontO);
                break;
        }
        return jogador;
    }

    static int pontX(int jogo, int pontX) {
        if (jogo == 2) {
            pontX++;
        }
        return pontX;
    }

    static int pontO(int jogo, int pontO) {
        if (jogo == 1) {
            pontO++;
        }
        return pontO;
    }

    static void pontuacao(int jogo, int pontX, int pontO) {
        System.out.println("Pontuação:");
        System.out.println("O jogador X está com " + pontX(jogo, pontX) + " pontos");
        System.out.println("O jogador O está com " + pontO(jogo, pontO) + " pontos");
        System.out.println("");
    }

    //Verifica se o jogo deu velha, de acordo com variável retornada da função jogar
    static void verificaVelha(int jogo, int pontX, int pontO) {
        if (jogo == 9) {
            System.out.println("Deu velha!!! \n");
            pontuacao(jogo, pontX, pontO);
        }
    }

    // Inicia matriz, jogador, e chama função jogar
    static void modoJogador() {
        String[][] matriz = inicializarTabuleiro();
        String[] jogador = jogador();
        imprimirTabuleiro(matriz);
        jogar(matriz, jogador);
    }

    // Usuário informa com qual simbolo deseja iniciar
    static String[] jogador() {
        String[] simbolo = new String[2];
        String opcao;
        System.out.println("Você deseja jogar com 'X' ou 'O'?");
        opcao = entrada.next();
        opcao = opcao.toUpperCase();
        System.out.println("");
        while (!(("X".equals(opcao)) || ("O".equals(opcao)))) {
            System.err.println("Opção inválida, digite 'X' ou 'O'!!!");
            opcao = entrada.next();
            opcao = opcao.toUpperCase();
        }
        if ("X".equals(opcao)) {
            simbolo[0] = "X";
            simbolo[1] = "O";
        } else {
            simbolo[0] = "O";
            simbolo[1] = "X";
        }
        return simbolo;
    }

    static void jogadaUsuario(String[][] matriz, String[] jogador1) {
        jogar(matriz, jogador1);
    }

    static int xMaquina() {
        Random random = new Random();
        int matrizX = random.nextInt(3);
        return matrizX;
    }

    static int yMaquina() {
        Random random = new Random();
        int matrizY = random.nextInt(3);
        return matrizY;
    }

    public static void main(String[] args) {
        imprimeMenuPrincipal();
        String[][] matriz = inicializarTabuleiro();
        String[] jogador = jogador();
        menu(matriz, jogador);
    }
}
