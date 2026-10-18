public class Calendario {

    public int diaSemana(int dia, int mes, int ano) {
        int f;

        f = ano + dia + 3 * (mes - 1) - 1;

        if (mes < 3) {
            ano = ano - 1;
        }

        if (mes >= 3) {
            f = f - (int) (0.4 * mes + 2.3);
        }

        f = f + (ano / 4) - (int) ((ano / 100 + 1) * 0.75);
        f = f % 7;

        return f;
    }

    public boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasNoMes(int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return -1;
        }

        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return ehBissexto(ano) ? 29 : 28;
            default:
                return 31;
        }
    }

    public void imprimeMes(int mes, int ano) {
        int[][] matriz = new int[6][7];
        char[] semana = new char[7];
        int dc, qt;
        int d = 1;

        semana[0] = 'D';
        semana[1] = 'S';
        semana[2] = 'T';
        semana[3] = 'Q';
        semana[4] = 'Q';
        semana[5] = 'S';
        semana[6] = 'S';
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = 0;
            }
        }

        dc = diaSemana(1, mes, ano);
        qt = diasNoMes(mes, ano);


        for (int i = dc; i < 7; i++) {
            matriz[0][i] = d;
            d++;
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = d;
                d++;

                if (d > qt) {
                    break;
                }
            }

            if (d > qt) {
                break;
            }
        }

        System.out.print("\n");
        if (mes == 1) {
            System.out.print("Mes: Janeiro");
        } else if (mes == 2) {
            System.out.print("Mes: Fevereiro");
        } else if (mes == 3) {
            System.out.print("Mes: Marco");
        } else if (mes == 4) {
            System.out.print("Mes: Abril");
        } else if (mes == 5) {
            System.out.print("Mes: Maio");
        } else if (mes == 6) {
            System.out.print("Mes: Junho");
        } else if (mes == 7) {
            System.out.print("Mes: Julho");
        } else if (mes == 8) {
            System.out.print("Mes: Agosto");
        } else if (mes == 9) {
            System.out.print("Mes: Setembro");
        } else if (mes == 10) {
            System.out.print("Mes: Outubro");
        } else if (mes == 11) {
            System.out.print("Mes: Novembro");
        } else if (mes == 12) {
            System.out.print("Mes: Dezembro");
        }
        System.out.println(" Ano: " + ano);
        for (int i = 0; i < semana.length; i++) {
            System.out.print(semana[i] + "\t");
        }
        System.out.print("\n");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public void imprimeCalendario(int ano) {
        
        for (int i = 1; i <= 12; i++) {
            imprimeMes(i, ano);
        }
    }
}