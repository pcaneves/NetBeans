package grupoeturmad_pi;

import java.util.Scanner;

public class GrupoETurmaD_PI {

    static Scanner input = new Scanner(System.in);
    static int vida = 3;

    
    static void entrada() {
        System.out.println("<--- RPG --->");
        System.out.println("SEJA BEM-VINDO");
        System.out.println("");
        System.out.println("Neste jogo o personagem tem como objetivo principal atravessar por todos os Estados do Brasil,");
        System.out.println("a procura da cura do COVID - 19. No meio do caminho o personagem terá alguns obstáculos,");
        System.out.println("onde esses obstáculos tanto podem lhe dar curiosidades sobre esses Estados a qual ele terá que atravessar,");
        System.out.println("como também podem levá-lo para a morte, pois se ele não conseguir passar esses obstáculos, ");
        System.out.println("ele ficará cada vez mais distante da cura. Para o usuário/jogador serão apenas perguntas de matemática,");
        System.out.println("onde ele irá escolher o nível de dificuldade dessas perguntas. Mas para o personagem");
        System.out.println("serão grandes obstáculos! Ele precisa ser forte e enfrentar esses obstáculos, porque a vida da humanidade está em perigo.");
        System.out.println("");
    }

    
    //Na função entrada, o usúario entrará com o nome desejado para o personagem.
    static String entradaNome() {
        String nome;
        System.out.print("Informe o nome do personagem: ");
        nome = input.next();

        return nome;
    }

    //Após a entrada do nome do personagem, o usuário entrará com o nível que deseja jogar.
    static int entradaNivel() {
        int op;

        System.out.println("");
        System.out.println("Infome o nível desejado: ");
        System.out.println("1 - Fácil");
        System.out.println("2 - Intermediário");
        System.out.println("3 - Avançado");
        System.out.println("4 - Sair");
        op = input.nextInt();

        while (op <= 0 || op > 4) {
            System.err.println("Opção inválida, digite 1, 2, 3 ou 4!!!");
            op = input.nextInt();
        }
        return op;
    }

    //Nesta função será chamado outras funções, de acordo com o nível escolhido.
    static void nivel(String nome, String[] curiosidade, int op) {
        switch (op) {
            case 1:
                nivelFacil(nome, curiosidade);
                break;
            case 2:
                nivelIntermediario(nome, curiosidade);
                break;
            case 3:
                nivelAvancado(nome, curiosidade);
                break;
            case 4:
                System.out.println("Até a próxima!");
                System.exit(0);
                break;
            default:
                System.err.println("Opção Inválida!");
        }
    }

    //Na função curiosidade foi criado um vetor com uma curiosidade de cada estado, onde as mesmas serão chamadas a cada resposta correta em todos os níveis.
    static String[] curiosidade() {

        String curiosidade[] = new String[27];

        curiosidade[0] = ("O litoral do Rio Grande do Sul apresenta a maior faixa contínua de areia do planeta. É a Praia do Cassino, que conta tem uma costa de 224 km.");
        curiosidade[1] = ("A única filial fora da Rússia do famoso Teatro Bolshoi fica em Joinville.");
        curiosidade[2] = ("Curitiba, capital do Paraná, é considerada a Capital mais fria do Brasil.");
        curiosidade[3] = ("São Paulo é tida como o maior destino turístico dentro do Brasil.");
        curiosidade[4] = ("O território de Minas Gerais é mais que duas vezes maior que o Reino Unido.");
        curiosidade[5] = ("O Rio já fez parte de uma colônia francesa, quando os mesmos ocuparam o litoral brasileiro.");
        curiosidade[6] = ("A Pedra Azul no município de Domingos Martins, pode \"mudar de cor\" até 36 vezes por dia pela incidência da luz solar.");
        curiosidade[7] = ("O Castelo de Gárcia D'ávila é um dos três monumentos históricos que sobreviveram à época da colonização.");
        curiosidade[8] = ("Sergipe é o menor estado brasileiro.");
        curiosidade[9] = ("Alagoas possui a segunda maior barreira de corais do mundo.");
        curiosidade[10] = ("Foi em Olinda a ser observado o primeiro cometa da America Latina. Ele foi batizado com o nome da cidade.");
        curiosidade[11] = ("Com 54,7 árvores por habitante e mais de 7 km² de florestas, João Pessoa foi, por 18 anos, a cidade mais verde da América Latina. Em 2010, perdeu o título para Curitiba.");
        curiosidade[12] = ("O Forte dos Reis Magos que deu origem a cidade de Natal.");
        curiosidade[13] = ("O Ceará aboliu a escravidão quatro anos antes da Lei Áurea, em 1884.");
        curiosidade[14] = ("Teresina foi a primeira capital planejada do país!");
        curiosidade[15] = ("O Estado possui a única cidade fundada por franceses no Brasil, que é São Luís. O nome do município foi dado em Homenagem ao rei francês Luís XIII.");
        curiosidade[16] = ("Tocantins é o estado mais novo do Brasil.");
        curiosidade[17] = ("O segundo maior acidente radioativo do mundo aconteceu em Goiânia.");
        curiosidade[18] = ("O termo candango antes era usado de forma pejorativa para referir-se a trabalhadores que vieram de fora para construir a cidade.\n" + "");
        curiosidade[19] = ("É o segundo estado brasileiro com maior número de casamentos entre divorciados.");
        curiosidade[20] = ("Na bandeira do Mato Grosso, o azul representa o céu, o branco paz e o verde sua extensão territorial. A estrela é o ideal republicano e riquezas minerais.");
        curiosidade[21] = ("No Pará acontece uma das maiores festas religiosas do mundo, o Círio de Nazaré. Devotos da Nossa Senhora de Nazaré tomam as ruas em cultos e procissões. O evento já reuniu mais de dois milhões de pessoas e ocorre em outubro.");
        curiosidade[22] = ("O Amapá só se tornou um Estado em 1988, e elegeu seu primeiro governador em 1990. Antes disso, era ligado ao Estado do Pará (Grã-Pará). ");
        curiosidade[23] = ("O estado possui a maior população indígena do país.");
        curiosidade[24] = ("Manaus é uma das cidades mais conhecidas fora do Brasil, sendo um dos maiores destinos turísticos do país.");
        curiosidade[25] = ("As pessoas do Acre são as últimas do país a desejarem \"Feliz Ano Novo\" devido o fuso horário da região.  O Acre tem o fuso horário +2 em relação ao horário de Brasília.");
        curiosidade[26] = ("Grande parte da população desse estado é de imigrantes.");

        return curiosidade;
    }

    //Na função de nível fácil, as perguntas são exibidas atavés de um vetor.
    static void nivelFacil(String nome, String[] curiosidade) {
        String pergunta[] = new String[27];
        String resp = null;
        int x = 0;

        // No for é feita a validação de vida, que inicia em 3, e equanto vida for maior que zero será exibida as perguntas
        // Para cada pergunta possui um switch com as resposta e uma validação com while, equanto a resposta for diferente da correta e vida maior que 0
        //irá ficar repetindo a pergunta
        for (int i = vida; vida > 0; i--) {
            if (vida > 0) {

                do {
                    System.out.println("");
                    pergunta[0] = ("1- Qual o resultado da equação 5 + 50 / 25? ");
                    System.out.println(pergunta[0]);
                    System.out.println("");
                    System.out.println("A) 2,2");
                    System.out.println("B) 7");
                    System.out.println("C) 2");
                    System.out.println("D) 7,2");
                    resp = input.next();

                    resp = resp.toUpperCase();

                    switch (resp) {
                        case "A":
                            vida = vida - 1;
                            System.out.println("");
                            System.out.println("Resposta incorreta! Tente novamente.");
                            System.out.println("VIDA = " + vida);
                            break;
                        case "B":
                            System.out.println("");
                            System.out.println("Resposta correta!");
                            System.out.println("VIDA = " + vida);
                            x++;
                            System.out.println("");
                            System.out.println("Você está no Rio Grande do Sul!");
                            System.out.println("Curiosidade:");
                            System.out.println(curiosidade[0]);
                            System.out.println("");
                            break;
                        case "C":
                            vida = vida - 1;
                            System.out.println("");
                            System.out.println("Resposta incorreta! Tente novamente.");
                            System.out.println("VIDA = " + vida);
                            break;
                        case "D":
                            vida = vida - 1;
                            System.out.println("");
                            System.out.println("Resposta incorreta! Tente novamente.");
                            System.out.println("VIDA = " + vida);
                            break;
                        default:
                            System.err.println("Opção inválida!");
                    }
                    if (vida <= 0) {
                        System.out.println("GAME OVER");
                    }
                } while (!"B".equals(resp));

            }

            do {
                pergunta[1] = ("2- Qual o resultado da equação 50 + 2 x 5 ?");
                System.out.println(pergunta[1]);
                System.out.println("");
                System.out.println("A) 30");
                System.out.println("B) 75");
                System.out.println("C) 60");
                System.out.println("D) 50");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Santa Catarina!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[1]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[2] = ("3- Qual o resultado da equação (7 x 7)/ 2?");
                System.out.println(pergunta[2]);
                System.out.println("");
                System.out.println("A) 24,5");
                System.out.println("B) 30,5");
                System.out.println("C) 20,5");
                System.out.println("D) 29");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Paraná!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[2]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[3] = ("4- Qual o resultado da equação 2 +(2 x 2) - 2?");
                System.out.println(pergunta[3]);
                System.out.println("");
                System.out.println("A) 4");
                System.out.println("B) 7");
                System.out.println("C) 5");
                System.out.println("D) 6");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em São Paulo!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[3]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[4] = ("5- Qual o resultado da equação 45 x 8 x 2?");
                System.out.println(pergunta[4]);
                System.out.println("");
                System.out.println("A) 800");
                System.out.println("B) 680");
                System.out.println("C) 700");
                System.out.println("D) 720");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!:");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Minas Gerais!");
                        System.out.println("Curiosidade");
                        System.out.println(curiosidade[4]);
                        System.out.println("");
                        x++;
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[5] = ("6- Qual o resultado da equação 25 / 25 x 0?");
                System.out.println(pergunta[5]);
                System.out.println("");
                System.out.println("A) 0");
                System.out.println("B) 1");
                System.out.println("C) 25");
                System.out.println("D) 10");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou no Rio de Janeiro!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[5]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[6] = ("7- Qual o resultado da potência 7 elevado à 2?");
                System.out.println(pergunta[6]);
                System.out.println("");
                System.out.println("A) 14");
                System.out.println("B) 7");
                System.out.println("C) 49");
                System.out.println("D) 1");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou no Espirito Santo!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[6]);
                        System.out.println("");
                        x++;
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[7] = ("8- Qual o resultado da equação 86 x (26 + 152)?");
                System.out.println(pergunta[7]);
                System.out.println("");
                System.out.println("A) 15300");
                System.out.println("B) 15303");
                System.out.println("C) 15308");
                System.out.println("D) 15350");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou na Bahia!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[7]);
                        System.out.println("");
                        x++;
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }

            } while (!"C".equals(resp));

            do {
                pergunta[8] = ("9- No número 3498, qual número ocupa a ordem das unidades de milhar?");
                System.out.println(pergunta[8]);
                System.out.println("");
                System.out.println("A) 3");
                System.out.println("B) 8");
                System.out.println("C) 9");
                System.out.println("D) 4");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Sergipe!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[8]);
                        System.out.println("");
                        x++;
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[9] = ("10- Qual o resultado da equação 42 x 3 + 85?");
                System.out.println(pergunta[9]);
                System.out.println("");
                System.out.println("A) 215");
                System.out.println("B) 210");
                System.out.println("C) 211");
                System.out.println("D) 200");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Alagoas!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[7]);
                        System.out.println("");
                        x++;
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[10] = ("11- Qual o resultado da equação (3 + 6 x 5 + 6) /2?");
                System.out.println(pergunta[10]);
                System.out.println("");
                System.out.println("A)19,5");
                System.out.println("B)36");
                System.out.println("C)36,5");
                System.out.println("D)19");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Pernambuco!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[10]);
                        System.out.println("");
                        x++;
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[11] = ("12-Uma indústria produziu 7440 unidades de certo produto, num período de cinco anos. Supondo que a produção tenha dobrado a cada ano, o número de unidades produzidas no primeiro ano foi: ");
                System.out.println(pergunta[11]);
                System.out.println("");
                System.out.println("A) 248");
                System.out.println("B) 240");
                System.out.println("C) 480");
                System.out.println("D) 488");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Paraíba!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[11]);
                        System.out.println("");
                        x++;
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[12] = ("13- Qual o resultado da divisão 66 / 3?");
                System.out.println(pergunta[12]);
                System.out.println("");
                System.out.println("A) 25");
                System.out.println("B) 23");
                System.out.println("C) 24");
                System.out.println("D) 22");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou no Rio Grande do Norte!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[12]);
                        System.out.println("");
                        x++;
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[13] = ("14- Qual o resultado da equação 81 - 9 + 18");
                System.out.println(pergunta[13]);
                System.out.println("");
                System.out.println("A) 90");
                System.out.println("B) 91");
                System.out.println("C) 89");
                System.out.println("D) 92");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Ceará!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[13]);
                        System.out.println("");
                        x++;
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[14] = ("15- Qual o resultado da equação (12 + 12)/ 2");
                System.out.println(pergunta[14]);
                System.out.println("");
                System.out.println("A) 17");
                System.out.println("B) 16");
                System.out.println("C) 12");
                System.out.println("D) 19");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou no Piauí!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[14]);
                        x++;
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[15] = ("16- Três lápis de tamanhos diferentes são tais que o segundo é 2cm maior que o primeiro e o terceiro ultrapassa o segundo em 3cm. Se a soma dos comprimentos dos três lápis é 28cm, determine, em cm, o comprimento do lápis intermediário.");
                System.out.println(pergunta[15]);
                System.out.println("");
                System.out.println("A) 6");
                System.out.println("B) 18");
                System.out.println("C) 9");
                System.out.println("D)7");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Maranhão!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[15]);
                        System.out.println("");
                        x++;
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[16] = ("17- Qual o resultado da divisão 6572 ÷ 53 ");
                System.out.println(pergunta[16]);
                System.out.println("");
                System.out.println("A) 123");
                System.out.println("B) 122");
                System.out.println("C) 124");
                System.out.println("D) 125");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Tocantins!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[16]);
                        System.out.println("");
                        x++;
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[17] = ("18- Qual o resultado da raiz quadrada de 81?");
                System.out.println(pergunta[17]);
                System.out.println("");
                System.out.println("A) 7");
                System.out.println("B) 9");
                System.out.println("C) 12");
                System.out.println("D) 21");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        x++;
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Goias!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[17]);
                        System.out.println("");
                        x++;
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[18] = ("19- Qual o resultado da raiz quadrada de 121?");
                System.out.println(pergunta[18]);
                System.out.println("");
                System.out.println("A) 7");
                System.out.println("B) 9");
                System.out.println("C) 10");
                System.out.println("D) 11");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Brasília/Distrito Federal!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[18]);
                        System.out.println("");
                        x++;
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[19] = ("20- Qual o resultado da equação (42 / 2) x 4");
                System.out.println(pergunta[19]);
                System.out.println("");
                System.out.println("A) 50");
                System.out.println("B) 84");
                System.out.println("C) 81");
                System.out.println("D) 91");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou no Mato Grosso do Sul!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[19]);
                        System.out.println("");
                        x++;
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[20] = ("21- Qual o resultado da equação 21 + 56 x 2");
                System.out.println(pergunta[20]);
                System.out.println("");
                System.out.println("A) 131");
                System.out.println("B) 132");
                System.out.println("C) 133");
                System.out.println("D) 134");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou no Mato Grosso!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[20]);
                        System.out.println("");
                        x++;
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[21] = ("22- Qual o resultado da equação 2 x 4 - 50?");
                System.out.println(pergunta[21]);
                System.out.println("");
                System.out.println("A)-42");
                System.out.println("B) 42");
                System.out.println("C) 41");
                System.out.println("D) -41");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou no Pará!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[21]);
                        System.out.println("");
                        x++;
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[22] = ("23- A soma de minha idade com as de minhas duas filhas é 64. Eu tenho trinta anos a mais do que uma\n"
                        + "delas, e a diferença de idade entre as duas são cinco anos. Sabendo que já fiz quarenta anos, qual a\n"
                        + "minha idade?");
                System.out.println(pergunta[22]);
                System.out.println("");
                System.out.println("A) 40");
                System.out.println("B) 41");
                System.out.println("C) 42");
                System.out.println("D) 43");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Amapá!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[22]);
                        System.out.println("");
                        x++;
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[23] = ("24- O dobro de um número adicionado ao seu triplo corresponde a 20. Qual é o número?");
                System.out.println(pergunta[23]);
                System.out.println("");
                System.out.println("A) 2");
                System.out.println("B) 20");
                System.out.println("C) 3");
                System.out.println("D) 4");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Roraima!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[23]);
                        System.out.println("");
                        x++;
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[24] = ("25- No número 6974, qual número ocupa a ordem das unidades de milhar?");
                System.out.println(pergunta[24]);
                System.out.println("");
                System.out.println("A) 7");
                System.out.println("B) 9");
                System.out.println("C) 6");
                System.out.println("D) 4");
                resp = input.next();
                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Amazonas!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[24]);
                        System.out.println("");
                        x++;
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[25] = ("26- Considere os números naturais ímpares 1, 3, 5...2001. Se x = 1.3.5...2001, o algarismo que\n"
                        + "ocupa a ordem das unidades de x é");
                System.out.println(pergunta[25]);
                System.out.println("");
                System.out.println("A) 5");
                System.out.println("B) 6");
                System.out.println("C) 7");
                System.out.println("D) 8");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou no Acre!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[25]);
                        System.out.println("");
                        x++;
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[26] = ("27- Um certo número de ingressos para um show foi dividido igualmente entre os alunos presentes em\n"
                        + "uma sala de aula. Sabe-se que, se houvesse 8 alunos a mais na sala, cada um deles receberia 1\n"
                        + "ingresso a menos e se houvesse 10 alunos a menos, cada um receberia 2 ingressos a mais. Nessas\n"
                        + "condições, é correto afirmar que o número de ingressos que coube a cada aluno presente foi");
                System.out.println(pergunta[26]);
                System.out.println("");
                System.out.println("A) 6");
                System.out.println("B) 5");
                System.out.println("C) 7");
                System.out.println("D) 8");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        System.out.println("");
                        System.out.println("Você chegou em Rondônia!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[26]);
                        System.out.println("");
                        x++;
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                // A cada pergunta é feito a validação das vidas, se vida = 0, então o usuário perdeu o jogo.
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            //O x sigfinica a contagem das perguntas, para cada pergunta respondida corretamente soma +1 em x
            //O if valida se passaram por todas as 27 perguntas, caso positivo, todas as 27 perguntas corretamente, mostra que o usuário ganhou o jogo
            //Dá a opção do usuário jogar novamente ou não
            if (x == 27) {
                System.out.println("VOCÊ ENCONTROU A CURA, FINALMENTE CHEGOU AO SEU OBJETIVO FINAL!");
                System.out.println("Parabéns " + nome + "!");
                System.out.println("");
                System.out.println("Você deseja jogar novamente? (1 - Sim | 2 - Não)");
                int r = input.nextInt();

                switch (r) {
                    case 1:
                        int op = entradaNivel();
                        nivel(nome, curiosidade, op);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("Obrigado por jogar!");
                        System.exit(0);
                        break;
                }
            }
        }
    }

    //Na função de nível intermediário, as perguntas são exibidas atavés de um vetor.
    static void nivelIntermediario(String nome, String[] curiosidade) {
        String pergunta[] = new String[27];
        String resp = null;
        int x = 0;

        // No for é feita a validação de vida, que inicia em 3, e equanto vida for maior que zero será exibida as perguntas
        // Para cada pergunta possui um switch com as resposta e uma validação com while, equanto a resposta for diferente da correta e vida maior que 0
        //irá ficar repetindo a pergunta
        for (int i = vida; vida > 0; i--) {
            if (vida > 0) {

                do {
                    System.out.println("");
                    pergunta[0] = ("1 - Qual o resultado da equação m + 4 – 3m = 4 + 12m?");
                    System.out.println(pergunta[0]);
                    System.out.println("");
                    System.out.println("A) m = 7");
                    System.out.println("B) m = 8");
                    System.out.println("C) m = 10");
                    System.out.println("D) m = 9");
                    resp = input.next();
                    resp = resp.toUpperCase();

                    switch (resp) {
                        case "A":
                            vida = vida - 1;
                            System.out.println("");
                            System.out.println("Resposta incorreta! Tente novamente.");
                            System.out.println("VIDA = " + vida);
                            break;
                        case "B":
                            System.out.println("");
                            System.out.println("Resposta correta!");
                            System.out.println("VIDA = " + vida);
                            x++;
                            System.out.println("");
                            System.out.println("Você está no Rio Grande do Sul!");
                            System.out.println("Curiosidade:");
                            System.out.println(curiosidade[0]);
                            System.out.println("");
                            break;
                        case "C":
                            vida = vida - 1;
                            System.out.println("");
                            System.out.println("Resposta incorreta! Tente novamente.");
                            System.out.println("VIDA = " + vida);
                            break;
                        case "D":
                            vida = vida - 1;
                            System.out.println("");
                            System.out.println("Resposta incorreta! Tente novamente.");
                            System.out.println("VIDA = " + vida);
                            break;
                        default:
                            System.err.println("Opção inválida!");
                    }
                    if (vida <= 0) {
                        System.out.println("GAME OVER");
                        System.exit(0);
                    }
                } while (!"B".equals(resp));

            }

            do {
                pergunta[1] = ("2 - Qual o resultado da equação 3 (x + 2) = 15?");
                System.out.println(pergunta[1]);
                System.out.println("");
                System.out.println("A) x = 6");
                System.out.println("B) x = 3,5");
                System.out.println("C) x = 3");
                System.out.println("D) x = 4");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Santa Catarina!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[1]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[2] = ("3 - Qual o resultado da equação –2 (-m + 2) = 3 (2m + 3)?");
                System.out.println(pergunta[2]);
                System.out.println("");
                System.out.println("A) m = -4");
                System.out.println("B) m = 4");
                System.out.println("C) m = 3");
                System.out.println("D) m = -3");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou no Paraná!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[2]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);

                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[3] = ("4 - Qual o resultado da equação 5 (x – 4) = - 3 + 9(x – 1)?");
                System.out.println(pergunta[3]);
                System.out.println("");
                System.out.println("A) m = 12");
                System.out.println("B) x = 2");
                System.out.println("C) x = -1");
                System.out.println("D) x = -2");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em São Paulo!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[3]);
                        System.out.println("");
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }

            } while (!"D".equals(resp));

            do {
                pergunta[4] = ("5 - Qual o resultado da equação 7 (x – 2) = 21 – 2x?");
                System.out.println(pergunta[4]);
                System.out.println("");
                System.out.println("A) x = 7");
                System.out.println("B) x = 10");
                System.out.println("C) x = 8");
                System.out.println("D) x = 9");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Minas Gerais!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[4]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[5] = ("6 - Qual o resultado da equação 4 (2x – 1) = 2 (x + 2)?");
                System.out.println(pergunta[5]);
                System.out.println("");
                System.out.println("A) x = 3");
                System.out.println("B) x = 1");
                System.out.println("C) x = 2");
                System.out.println("D) x = -1");
                resp = input.next();

                resp = resp.toUpperCase();

                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou no Rio de Janeiro!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[5]);
                        System.out.println("");
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[6] = ("7 - Qual o resultado da equação 8x – 11 = 4x + 13?");
                System.out.println(pergunta[6]);
                System.out.println("");
                System.out.println("A) x = 7");
                System.out.println("B) x = 6");
                System.out.println("C) x = 8");
                System.out.println("D) x = 5");
                resp = input.next();

                resp = resp.toUpperCase();

                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Espírito Santo!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[6]);
                        System.out.println("");
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[7] = ("8 - Qual o resultado da equação 9x - 8 + 8 = 37 + 8?");
                System.out.println(pergunta[7]);
                System.out.println("");
                System.out.println("A) x = 10");
                System.out.println("B) x = 15");
                System.out.println("C) x = 5");
                System.out.println("D) x = 7");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Bahia!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[7]);
                        System.out.println("");
                        break;
                    case "D":

                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[8] = ("9 - Qual o resultado da equação 3 (x + 3) – 5 = 22?");
                System.out.println(pergunta[8]);
                System.out.println("");
                System.out.println("A) x = 9");
                System.out.println("B) x = 10");
                System.out.println("C) x = 8");
                System.out.println("D) x = 7");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Sergipe!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[8]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[9] = ("10 - Fatorando a expressão 25x2 - 36 com base na fatoração da diferença de dois quadrados, tem-se:?");
                System.out.println(pergunta[9]);
                System.out.println("");
                System.out.println("A) (5x - 6)(5x - 6)");
                System.out.println("B) ((5x + 6)(5x + 6))2");
                System.out.println("C) (5x + 6)(- 5x + 6)");
                System.out.println("D) (5x + 6)(5x - 6)");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Alagoas!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[9]);
                        System.out.println("");
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[10] = ("11 - Qual o resultado da equação 2(2x + 7) = 3(4x – 5) – 3?");
                System.out.println(pergunta[10]);
                System.out.println("");
                System.out.println("A) m = 1");
                System.out.println("B) x = 2");
                System.out.println("C) x = 3");
                System.out.println("D) x = 4");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Pernambuco!");
                        System.out.println("Curiosidade:");

                        System.out.println(curiosidade[10]);
                        System.out.println("");
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[11] = ("12 - Qual é a forma fatorada de 2x³ - 4x² + 6x?");
                System.out.println(pergunta[11]);
                System.out.println("");
                System.out.println("A) 2x (x² – 2x – 3)");
                System.out.println("B) 2x² (x - 3 - 2)");
                System.out.println("C) x² (2x - 2x - 3)");
                System.out.println("D) x (2x² - 2 - 3)");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Paraíba!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[11]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[12] = ("13 - Qual é a forma fatorada de 5x² + 10x³ + 15x?");
                System.out.println(pergunta[12]);
                System.out.println("A) 5x (2x + x +3)");
                System.out.println("B) 5x (x + 2x + 3)");
                System.out.println("C) 5x² (x + 2x + 3)");
                System.out.println("D) 5x (2x + x² + 3)");
                resp = input.next();

                resp = resp.toUpperCase();

                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Rio Grande do Norte!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[12]);
                        System.out.println("");
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " +  vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[13] = ("14 - Qual é a forma fatorada de 6x – 3y?");
                System.out.println(pergunta[13]);
                System.out.println("A) 3 (x – 2y)");
                System.out.println("B) 3 (2x – y)");
                System.out.println("C) 3x (2x – y)");
                System.out.println("D) 3² (2x – y)");
                resp = input.next();

                resp = resp.toUpperCase();

                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou no Ceará!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[13]);
                        System.out.println("");
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[14] = ("15 - Qual é a forma fatorada de a² - b²?");
                System.out.println(pergunta[14]);
                System.out.println("");
                System.out.println("A) (a + b)(a - b)");
                System.out.println("B) (a - b)(a + b)");
                System.out.println("C) (a² + b)(a - b)");
                System.out.println("D) (a² + b)(a - b²)");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Piauí!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[14]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[15] = ("16 - Qual é a forma fatorada de xy² - 2x + x³?");
                System.out.println(pergunta[15]);
                System.out.println("");
                System.out.println("A) x (y - 2 + x²)");
                System.out.println("B) x² (y² - 2 + x)");
                System.out.println("C) x (y - 2² + x²)");
                System.out.println("D) x (y² - 2 + x²)");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Maranhão!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[15]);
                        System.out.println("");
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[16] = ("17 - Qual é a forma fatorada de 6² + 4x?");
                System.out.println(pergunta[16]);
                System.out.println("");
                System.out.println("A) x (3x - 2)");
                System.out.println("B) 2x (3x - 2)");
                System.out.println("C) 2x² (3x - 2)");
                System.out.println("D) 2x (3x² - 2)");
                resp = input.next();

                resp = resp.toUpperCase();

                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Tocantins!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[16]);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[17] = ("18 - Qual é a forma fatorada de 2x³ - 4x² + 6x?");
                System.out.println(pergunta[17]);
                System.out.println("");
                System.out.println("A) 2x (x² – 2x – 3)");
                System.out.println("B) 2x² (x - 3 - 2)");
                System.out.println("C) x² (2x - 2x - 3)");
                System.out.println("D) x (2x² - 2 - 3)");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Goiás!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[17]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[18] = ("19 - Qual é a forma fatorada de 8x³ - 4x³ + 12x?");
                System.out.println(pergunta[18]);
                System.out.println("");
                System.out.println("A) 4x (2x - x² – 3)");
                System.out.println("B) x (2x² - x – 3))");
                System.out.println("C) 4x² (2x² - x – 3)");
                System.out.println("D) 4x (2x² - x – 3))");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Brasília/Distrito Federal!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[18]);
                        System.out.println("");
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[19] = ("20 - Qual é o produto notável de (3x - 5)²?");
                System.out.println(pergunta[19]);
                System.out.println("");
                System.out.println("A) 9x – 20 + 25x");
                System.out.println("B) 9x – 20x³ + 25");
                System.out.println("C) 9x – 20x + 25");
                System.out.println("D) 9x³ – 20x + 25");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Mato Grosso do Sul!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[19]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[20] = ("21 - Qual é o produto notável de (y – 3)²?");
                System.out.println(pergunta[20]);
                System.out.println("");
                System.out.println("A) y² - 6y + 9");
                System.out.println("B) y - 6y² + 9");
                System.out.println("C) y² - 6y² + 9");
                System.out.println("D) y² - 6y + 9²");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou no Mato Grosso!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[20]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[21] = ("22 - Qual é o produto notável de (a + b)²?");
                System.out.println(pergunta[21]);
                System.out.println("");
                System.out.println("A) a + 2ab + b²");
                System.out.println("B) a² + 2ab + b²");
                System.out.println("C) a + 2ab² + b²");
                System.out.println("D) a² + 2ab² + b²");
                resp = input.next();

                resp = resp.toUpperCase();

                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Pará");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[21]);
                        System.out.println("");
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[22] = ("23 - Qual é o produto notável de (x + a)(x – a)²?");
                System.out.println(pergunta[22]);
                System.out.println("");
                System.out.println("A) x – a²");
                System.out.println("B) x² – a²");
                System.out.println("C) x² – a");
                System.out.println("D) x – a");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Amapá!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[22]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[23] = ("24 - Qual é o produto notável de (3x + y)²?");
                System.out.println(pergunta[23]);
                System.out.println("");
                System.out.println("A) 9x² + 6xy + y");
                System.out.println("B) 9x² + 6xy² + y²");
                System.out.println("C) 9x² + 6xy + y²");
                System.out.println("D) 9x + 6xy + y²");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Roraima!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[23]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[24] = ("25 - O quíntuplo de um número mais 15 é igual ao dobro desse número adicionado de 45. Qual é esse número??");
                System.out.println(pergunta[24]);
                System.out.println("");
                System.out.println("A) 30");
                System.out.println("B) 25");
                System.out.println("C) 10");
                System.out.println("D) 20");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Amazonas!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[24]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[25] = ("26 - Qual é a forma fatorada mais reduzida do polinômio 4x2y3x4 – 16x3y2?");
                System.out.println(pergunta[25]);
                System.out.println("");
                System.out.println("A) 4x2y2");
                System.out.println("B) Yz4 – 4x");
                System.out.println("C) 4x2y2z3 (yz – 4x)");
                System.out.println("D) 4x2y2 (yx4 – 4x");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou no Acre!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[25]);
                        System.out.println("");
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[26] = ("27 - Qual é o resultado mais simplificado da divisão da expressão 4ky – 6y + 2kz – 3z pela expressão 2k - 3??");
                System.out.println(pergunta[26]);
                System.out.println("");
                System.out.println("A) (2y + x)(2k + z)");
                System.out.println("B) 2y + z");
                System.out.println("C) (2y + z) (2k + 3)");
                System.out.println("D) 2k + 3");
                resp = input.next();

                resp = resp.toUpperCase();

                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Rondônia!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[26]);
                        System.out.println("");
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.out.println("");
                        System.err.println("Opção inválida!");
                        System.out.println("VIDA = " + vida);
                }
                // A cada pergunta é feito a validação das vidas, se vida = 0, então o usuário perdeu o jogo.
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            //O x sigfinica a contagem das perguntas, para cada pergunta respondida corretamente soma +1 em x
            //O if valida se passaram por todas as 27 perguntas, caso positivo, todas as 27 perguntas corretamente, mostra que o usuário ganhou o jogo
            //Dá a opção do usuário jogar novamente ou não
            if (x == 27) {
                System.out.println("VOCÊ ENCONTROU A CURA, FINALMENTE CHEGOU AO SEU OBJETIVO FINAL!");
                System.out.println("Parabéns " + nome + "!");
                System.out.println("");
                System.out.println("Você deseja jogar novamente? (1 - Sim | 2 - Não)");
                int r = input.nextInt();

                switch (r) {
                    case 1:
                        int op = entradaNivel();
                        nivel(nome, curiosidade, op);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("Obrigado por jogar!");
                        System.exit(0);
                        break;
                }
            }
        }
    }

    //Na função de nível avançado, as perguntas são exibidas atavés de um vetor.
    static void nivelAvancado(String nome, String[] curiosidade) {
        String pergunta[] = new String[27];
        String resp = null;
        int x = 0;

        // No for é feita a validação de vida, que inicia em 3, e equanto vida for maior que zero será exibida as perguntas
        // Para cada pergunta possui um switch com as resposta e uma validação com while, equanto a resposta for diferente da correta e vida maior que 0
        //irá ficar repetindo a pergunta
        for (int i = vida; vida > 0; i--) {
            if (vida > 0) {

                do {
                    System.out.println("");
                    pergunta[0] = ("1) Ao somar todos os gastos da semana, Maria somou, por engano,"
                            + " duas vezes o valor da conta do supermercado, o que resultou num gasto total"
                            + " de R$ 832,00. Porém, se ela não tivesse somado nenhuma vez a conta do supermercado,"
                            + " o valor encontrado seria R$ 586,00. O valor correto dos gastos de Maria durante essa semana foi");
                    System.out.println(pergunta[0]);
                    System.out.println("A) R$ 573,00.");
                    System.out.println("B) R$ 684,00.");
                    System.out.println("C) R$ 709,00");
                    System.out.println("D) R$ 765,00");
                    System.out.println("E) R$ 825,00.");
                    resp = input.next();

                    resp = resp.toUpperCase();

                    switch (resp) {
                        case "A":
                            vida = vida - 1;
                            System.out.println("");
                            System.out.println("Resposta incorreta! Tente novamente.");
                            System.out.println("VIDA = " + vida);
                            break;
                        case "B":
                            vida = vida - 1;
                            System.out.println("");
                            System.out.println("Resposta incorreta! Tente novamente.");
                            System.out.println("VIDA = " + vida);
                            break;
                        case "C":
                            System.out.println("");
                            System.out.println("Resposta correta!");
                            System.out.println("VIDA = " + vida);
                            x++;
                            System.out.println("");
                            System.out.println("Você está no Rio Grande do Sul!");
                            System.out.println("Curiosidade:");
                            System.out.println(curiosidade[0]);
                            System.out.println("");
                            break;
                        case "D":
                            vida = vida - 1;
                            System.out.println("");
                            System.out.println("Resposta incorreta! Tente novamente.");
                            System.out.println("VIDA = " + vida);
                            break;
                        case "E":
                            vida = vida - 1;
                            System.out.println("");
                            System.out.println("Resposta incorreta! Tente novamente.");
                            System.out.println("VIDA = " + vida);
                            break;
                        default:
                            System.err.println("Opção Inválida!");
                            System.out.println("VIDA = " + vida);
                    }
                    if (vida <= 0) {
                        System.out.println("GAME OVER");
                        System.exit(0);
                    }
                } while (!"C".equals(resp));

            }

            do {
                pergunta[1] = ("2) 3/5 de um número somados a ½ é igual a 2/3 desse mesmo número. "
                        + "Indique a opção que apresenta esse número.");
                System.out.println(pergunta[1]);
                System.out.println("A) 0");
                System.out.println("B) 1");
                System.out.println("C) 20/33");
                System.out.println("D) 33/20");
                System.out.println("E) 15/2");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Santa Catarina!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[1]);
                        System.out.println("");
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"E".equals(resp));

            do {
                pergunta[2] = ("3) Qual é o valor de x que poderá satisfazer a equação do primeiro "
                        + "grau: 3x + 4(1 + x) + 2 = 5x – x – 6?");
                System.out.println(pergunta[2]);
                System.out.println("");
                System.out.println("A) 4");
                System.out.println("B) -4");
                System.out.println("C) 2");
                System.out.println("D) 3");
                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou no Paraná!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[2]);
                        System.out.println("");
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[3] = ("4) Em um dado momento em que Ari e Iná atendiam ao público nos guichês de dois caixas de"
                        + " uma Agência do Banco do Brasil, foi observado que a fila de pessoas à frente do guichê ocupado"
                        + " por Ari tinha 4 pessoas a mais que aquela formada frente ao guichê que Iná ocupava. Sabendo que,"
                        + " nesse momento, se 8 pessoas da fila de Ari passassem para a fila de Iná, esta última ficaria com o"
                        + " dobro do número de pessoas da de Ari, então, o total de pessoas das duas filas era:");
                System.out.println(pergunta[3]);
                System.out.println("");
                System.out.println("A) 24");
                System.out.println("B) 26");
                System.out.println("C) 30");
                System.out.println("D) 32");
                System.out.println("E) 36");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em São Paulo!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[3]);
                        System.out.println("");
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"E".equals(resp));

            do {
                pergunta[4] = ("5) O valor de x na equação 2x/3 – x/5 = 6(x – 2) é:");
                System.out.println(pergunta[4]);
                System.out.println("");
                System.out.println("A) 160/73");
                System.out.println("B) 120/53");
                System.out.println("C) 180/83");
                System.out.println("D) 140/63");
                System.out.println("E) 100/43");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Minas Gerais!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[4]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[5] = ("6) Existe um número que somado com seu triplo é igual ao dobro desse "
                        + "número somado com doze. O valor desse número é:");
                System.out.println(pergunta[5]);
                System.out.println("");
                System.out.println("A) 3");
                System.out.println("B) 4");
                System.out.println("C) 5");
                System.out.println("D) 6");
                System.out.println("E) 7");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Rio de Janeiro!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[5]);
                        System.out.println("");
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[6] = ("7) Existe um número que somado com seu triplo é igual ao dobro desse "
                        + "número somado com doze. O valor desse número é:");
                System.out.println(pergunta[6]);
                System.out.println("");
                System.out.println("A) 3");
                System.out.println("B) 4");
                System.out.println("C) 5");
                System.out.println("D) 6");
                System.out.println("E) 7");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Espírito Santo!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[6]);
                        System.out.println("");
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[7] = ("8) João tem 5 filhos, sendo que dois deles são gêmeos. A média das idades deles é 8,6 anos."
                        + " Porém, se não forem contadas as idades dos gêmeos, a média dos demais passa a ser de 9 anos."
                        + " Pode-se concluir que a idade dos gêmeos, em anos, é:");
                System.out.println(pergunta[7]);
                System.out.println("");
                System.out.println("A) 6,5");
                System.out.println("B) 7,0");
                System.out.println("C) 7,5");
                System.out.println("D) 8,0");
                System.out.println("E) 8,5");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Bahia!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[7]);
                        System.out.println("");
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[8] = ("9) Se somarmos três unidades ao dobro do número x, obteremos o mesmo resultado "
                        + "que alcançamos ao subtrair duas unidades do triplo do mesmo número x. Dessa forma, "
                        + "o quádruplo do número x é igual a:");;
                System.out.println(pergunta[8]);
                System.out.println("");
                System.out.println("A) 20");
                System.out.println("B) 16");
                System.out.println("C) 12");
                System.out.println("D) 8");
                System.out.println("E) 4");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Sergipe!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[8]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[9] = ("10) O conjunto solução da equação x² – 3.x 10 = 0, é:");
                System.out.println(pergunta[9]);
                System.out.println("");
                System.out.println("A) S = {- 5; -1}");
                System.out.println("B) S = {- 2; 0}");
                System.out.println("C) S = {- 2; 5}");
                System.out.println("D) S = {- 2; -5}");
                System.out.println("E) S = {- 5; 0}");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Alagoas!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[9]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[10] = ("11) Determine o produto das raízes da equação x² – 3x + 36 = 2x – x² – 14.");
                System.out.println(pergunta[10]);
                System.out.println("");
                System.out.println("A) 2,5");
                System.out.println("B) 10");
                System.out.println("C) 25");
                System.out.println("D) 100");
                System.out.println("E) 50");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Pernambuco!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[10]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[11] = ("12) Determine o produto das raízes da equação x² – 3x + 36 = 2x – x² – 14.");
                System.out.println(pergunta[11]);
                System.out.println("");
                System.out.println("A) 2,5");
                System.out.println("B) 10");
                System.out.println("C) 25");
                System.out.println("D) 100");
                System.out.println("E) 50");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Paraíba!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[11]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[12] = ("13) A soma entre dois números positivos é 37. Se o produto entre eles é 330,"
                        + " então o valor da diferença entre o maior e o menor número é:");
                System.out.println(pergunta[12]);
                System.out.println("");
                System.out.println("A) 7");
                System.out.println("B) 23");
                System.out.println("C) 61");
                System.out.println("D) 17");
                System.out.println("E) 49");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Rio Grande do Sul!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[12]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[13] = ("14) Se x1 > x2 são as raízes da equação x² – 27x + 182 = 0, então o valor de 1/x2 – 1/x1 é:");
                System.out.println(pergunta[13]);
                System.out.println("");
                System.out.println("A) 1/27");
                System.out.println("B) 1/13");
                System.out.println("C) 1");
                System.out.println("D) 1/182");
                System.out.println("E) 1/14");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Ceará!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[13]);
                        System.out.println("");
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[14] = ("15) Uma senhora tinha entre trinta e quarenta ações de uma empresa para dividir igualmente entre todos os seus netos."
                        + " Num ano, quando tinha 3 netos, se a partilha fosse feita, deixaria 1 ação sobrando. No ano seguinte, nasceu mais um neto e, "
                        + "ao dividir igualmente entre os quatro netos o mesmo número de ações, ela observou que sobrariam 3 ações. Nesta última situação, "
                        + "quantas ações receberá cada neto?");
                System.out.println(pergunta[14]);
                System.out.println("");
                System.out.println("A) 6");
                System.out.println("B) 7 ");
                System.out.println("C) 8");
                System.out.println("D) 9");
                System.out.println("E) 10");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Piauí!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[14]);
                        System.out.println("");
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[15] = ("16) Cláudio resolveu fazer uma coleção de calendários. Começou guardando o calendário de 1975 e,"
                        + " a cada ano, guardava o calendário do ano. Hoje, a coleção de Cláudio já possui várias duplicatas "
                        + "(por exemplo, o calendário de 1986 é idêntico ao de 1975), mas ainda não está completa. "
                        + "Em que ano Cláudio completará sua coleção?");
                System.out.println(pergunta[15]);
                System.out.println("");
                System.out.println("A) 1996");
                System.out.println("B) 1997");
                System.out.println("C) 1998");
                System.out.println("D) 1999");
                System.out.println("E) 2000");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Maranhão!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[16]);
                        System.out.println("");
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"E".equals(resp));

            do {
                pergunta[16] = ("17) O seguinte trecho de artigo de um jornal local relata uma corrida beneficente de bicicletas:"
                        + " “Alguns segundos após a largada, Ralf tomou a liderança, seguido de perto por David e Rubinho, "
                        + "nesta ordem. Daí em diante, eles não mais deixaram as primeiras três posições e, em nenhum momento da"
                        + " corrida, estiveram lado a lado mais do que dois competidores. A liderança, no entanto, mudou de mãos nove"
                        + " vezes entre os três, enquanto que em mais oito ocasiões diferentes aqueles que corriam na segunda e terceira "
                        + "posições trocaram de lugar entre si. Após o término da corrida, Rubinho reclamou para nossos repórteres que"
                        + " David havia conduzido sua bicicleta de forma imprudente pouco antes da bandeirada de chegada. Desse modo,"
                        + " logo atrás de David, Rubinho não pôde ultrapassá-lo no final da corrida.” Com base no trecho acima, você conclui que:");
                System.out.println(pergunta[16]);
                System.out.println("");
                System.out.println("A) David ganhou a corrida. ");
                System.out.println("B) Ralf ganhou a corrida. ");
                System.out.println("C) Rubinho chegou em terceiro lugar. ");
                System.out.println("D) Ralf chegou em segundo lugar. ");
                System.out.println("E) não é possível determinar a ordem de chegada,"
                        + " porque o trecho não apresenta uma descrição matematicamente correta.");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                    case "b":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Tocantins!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[16]);
                        System.out.println("");
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"E".equals(resp));

            do {
                pergunta[17] = ("18) Considere as seguintes afirmações sobre números reais positivos: I. Se x > 4 e y < 2, "
                        + "então x² – 2y > 12. II. Se x > 4ou y < 2, então x² – 2y > 12. III. Se x² < 1 e y2 > 2, então x² – 2y < 0. "
                        + "Então, destas é (são) verdadeira(s):");
                System.out.println(pergunta[17]);
                System.out.println("");
                System.out.println("A) apenas I.  ");
                System.out.println("B) apenas I e II.  ");
                System.out.println("C) apenas II e III.  ");
                System.out.println("D) apenas I e III.  ");
                System.out.println("E) todas.");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Goiás!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[17]);
                        System.out.println("");
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[18] = ("19) Numa fazenda, o rebanho bovino é formado por quatro tipos de raças. "
                        + "O veterinário dessa fazenda observa que num período de 58 dias o volume de ração V(k),"
                        + " em metros cúbicos, dado ao rebanho no k-ésimo dia desse período é dado por V(k) k 2k k 14 3 2 1,2,3,...,"
                        + "58 = , k + - + = . Sabendo que os volumes (em metros cúbicos) de ração dada a cada uma das quatro raças do"
                        + " rebanho são números inteiros, pode-se concluir que a quantidade de dias nos quais todas as raças receberam"
                        + " o mesmo volume de ração foi ");
                System.out.println(pergunta[18]);
                System.out.println("");
                System.out.println("A) 44");
                System.out.println("B) 40");
                System.out.println("C) 36");
                System.out.println("D) 24");
                System.out.println("E) 14");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Brasília/Distrito Federal!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[18]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[19] = ("20) Uma dona de casa programou uma recepção no aniversário de seu marido "
                        + " e solicitou a um Buffet que fizesse 7 salgadinhos de um certo tipo para cada convidado."
                        + " No dia da recepção, ao receber os salgadinhos, notou que havia 2 a mais do que o encomendado."
                        + " Por outro lado, compareceram à recepção 3 convidados a mais do que o esperado. "
                        + "A dona da casa resolveu o imprevisto, distribuindo exatamente 6 salgadinhos para cada convidado presente."
                        + " Com base nessas informações, assinale a opção que contém o número de salgadinhos preparados pelo buffet.");
                System.out.println(pergunta[19]);
                System.out.println("");
                System.out.println("A) 108");
                System.out.println("B) 114");
                System.out.println("C) 120");
                System.out.println("D) 126");
                System.out.println("E) 132");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Mato Grosso do Sul!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[19]);
                        System.out.println("");
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"B".equals(resp));

            do {
                pergunta[20] = ("21) Ainda que a grande disparidade de renda no Brasil tenha razões históricas,"
                        + " econômicas e políticas que ultrapassam a ação do Parlamento, não deixa de ser "
                        + "agressiva a crueza com que senadores aprovaram um salário mínimo de R$ 65,00 para o país "
                        + "e um rendimento de R$ 12 mil para si mesmos. "
                        + "(Jornal Folha de S. Paulo - 15/10/94) "
                        + "Digitando-se em uma máquina calculadora, nesta ordem: "
                        + "1º) O valor da proposta de salário de Senador. 2º) O sinal de menos. 3º) O valor do salário mínimo."
                        + " 4º) O sinal de igual Cada vez que se repete a operação do 4º item, a máquina subtrai,"
                        + " do número que aparece no visor, um salário mínimo. O número total de vezes que deve ser digitado o sinal"
                        + " até se obter um número negativo pela primeira vez é igual a:");
                System.out.println(pergunta[20]);
                System.out.println("");
                System.out.println("A) 183");
                System.out.println("B) 184");
                System.out.println("C) 185");
                System.out.println("D) 186");
                System.out.println("E) 187");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Mato Grosso!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[20]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[21] = ("22) Considere que em uma indústria todos os seus operários trabalham com desempenhos"
                        + " iguais e constantes. Sabe se que 24 desses operários, trabalhando 6 horas por dia, durante 10 dias,"
                        + " conseguem realizar 75% de uma determinada tarefa. O número de operários que conseguirão realizar toda "
                        + "a tarefa em 15 dias, trabalhando 8 horas por dia, é igual a");
                System.out.println(pergunta[21]);
                System.out.println("");
                System.out.println("A) 12");
                System.out.println("B) 14");
                System.out.println("C) 16");
                System.out.println("D) 18");
                System.out.println("E) 20");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Pará!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[21]);
                        System.out.println("");
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"C".equals(resp));

            do {
                pergunta[22] = ("23) Dario, Pelé, Puskas e Zico foram famosos artilheiros da história do futebol mundial"
                        + " por terem marcado muitos gols. Um deles marcou 926 gols. Outro marcou 799. Houve ainda um,"
                        + " entre eles, que marcou 1176 gols. Sabe-se que:\n"
                        + "\n"
                        + "Dario fez menos do que 1000 gols;\n"
                        + "Pelé é o maior artilheiro da história do futebol com 1280 gols;\n"
                        + "Zico fez menos gols do que Dario.\n"
                        + "\n"
                        + "Com base nessas informações, pode-se concluir, corretamente, que:");
                System.out.println(pergunta[22]);
                System.out.println("");
                System.out.println("A) Zico fez mais de 1000 gols");
                System.out.println("B) Zico fez mais gols do que Dario");
                System.out.println("C) Zico fez mais gols do que Puskas");
                System.out.println("D) Dario fez 926 gols");
                System.out.println("E) Dario fez mais gols do que Puskas");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Amapá!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[22]);
                        System.out.println("");
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[23] = ("24) Em uma carpintaria há mestres-carpinteiros e aprendizes. Os mestres têm todos a mesma "
                        + "capacidade de trabalho. Os aprendizes, também. Se 8 mestres juntamente com 6 aprendizes têm a mesma "
                        + "capacidade de produção de 6 mestres juntamente com 10 aprendizes, a capacidade de um dos mestres, sozinho,"
                        + " corresponde à de:");
                System.out.println(pergunta[23]);
                System.out.println("");
                System.out.println("A) 2 aprendizes");
                System.out.println("B) 3 aprendizes");
                System.out.println("C) 4 aprendizes");
                System.out.println("D) 5 aprendizes");
                System.out.println("E) 6 aprendizes");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Roraima!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[23]);
                        System.out.println("");
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"A".equals(resp));

            do {
                pergunta[24] = ("25) Seis pessoas, dentre as quais está Elias, estão aguardando em uma fila para"
                        + " serem atendidas pelo caixa de uma loja. Nesta fila, Carlos está à frente de Daniel,"
                        + " que se encontra imediatamente atrás de Bruno. Felipe não é o primeiro da fila, mas "
                        + "está mais próximo do primeiro lugar do que do último. Sabendo que Ari será atendido antes"
                        + " do que Carlos e que Carlos não é o quarto da fila, pode-se concluir que a pessoa que ocupa"
                        + " a quarta posição da fila");
                System.out.println(pergunta[24]);
                System.out.println("");
                System.out.println("A) certamente é Bruno.");
                System.out.println("B) certamente é Daniel.");
                System.out.println("C) certamente é Elias.");
                System.out.println("D) pode ser Bruno ou Daniel.");
                System.out.println("E) pode ser Bruno ou Elias.");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "E":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Amazonas!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[24]);
                        System.out.println("");
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"E".equals(resp));

            do {
                pergunta[25] = ("26) As irmãs Luciana, Rosana e Joana, de idades diferentes, possuem cada uma delas apenas"
                        + " um cão de estimação. Os nomes dos cães são: Rex, Bobby e Touro. Um dos cães é preto, outro"
                        + " é marrom e o outro é branco. A ordem expressa na questão não representa a ordem das cores nem"
                        + " a ordem das donas. Sabe-se que Rex, um cão marrom, não é de Joana e pertence à irmã com idade do meio."
                        + " Rosana, que não é a mais nova, tem um cão branco que não é o Touro. Sendo assim, é possível concluir"
                        + " corretamente que ");
                System.out.println(pergunta[25]);
                System.out.println("");
                System.out.println("A) Rex é marrom e é de Rosana.");
                System.out.println("B) Bobby é branco e é de Luciana.");
                System.out.println("C) Touro não é branco e pertence a Rosana.");
                System.out.println("D) Touro não é marrom e pertence à irmã mais nova.");
                System.out.println("E) Rosana é a dona de Bobby que é preto.");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Acre!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[25]);
                        System.out.println("");
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                if (vida <= 0) {
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            do {
                pergunta[26] = ("27) O século XIX é o período que se estende de 1801 até 1900. Alberto nasceu no século XIX."
                        + " Em 1872, ao comemorar seu aniversário, Alberto notou que sua idade coincidia com os dois últimos"
                        + " algarismos do ano em que nasceu. Nessas condições, Alberto completou 5 anos de idade em:");
                System.out.println(pergunta[26]);
                System.out.println("");
                System.out.println("A) 1853.");
                System.out.println("B) 1836.");
                System.out.println("C) 1825.");
                System.out.println("D) 1841.");
                System.out.println("E) 1848.");

                resp = input.next();

                resp = resp.toUpperCase();
                switch (resp) {
                    case "A":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "B":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "C":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    case "D":
                        System.out.println("");
                        System.out.println("Resposta correta!");
                        System.out.println("VIDA = " + vida);
                        x++;
                        System.out.println("");
                        System.out.println("Você chegou em Rondônia!");
                        System.out.println("Curiosidade:");
                        System.out.println(curiosidade[26]);
                        System.out.println("");
                        break;
                    case "E":
                        vida = vida - 1;
                        System.out.println("");
                        System.out.println("Resposta incorreta! Tente novamente.");
                        System.out.println("VIDA = " + vida);
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                        System.out.println("VIDA = " + vida);
                }
                // A cada pergunta é feito a validação das vidas, se vida = 0, então o usuário perdeu o jogo.
                if (vida <= 0) {
                    System.out.println("");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            } while (!"D".equals(resp));

            //O x sigfinica a contagem das perguntas, para cada pergunta respondida corretamente soma +1 em x
            //O if valida se passaram por todas as 27 perguntas, caso positivo, todas as 27 perguntas corretamente, mostra que o usuário ganhou o jogo
            //Dá a opção do usuário jogar novamente ou não
            if (x == 27) {
                System.out.println("VOCÊ ENCONTROU A CURA, FINALMENTE CHEGOU AO SEU OBJETIVO FINAL!");
                System.out.println("Parabéns " + nome + "!");
                System.out.println("");
                System.out.println("Você deseja jogar novamente? (1 - Sim | 2 - Não)");
                int r = input.nextInt();

                switch (r) {
                    case 1:
                        int op = entradaNivel();
                        nivel(nome, curiosidade, op);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("Obrigado por jogar!");
                        System.exit(0);
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        entrada();
        String nome = entradaNome();
        String[] curiosidade = curiosidade();
        int op = entradaNivel();
        nivel(nome, curiosidade, op);

    }
}
