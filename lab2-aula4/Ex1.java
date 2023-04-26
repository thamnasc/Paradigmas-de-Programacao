
/*
1) Implemente as seguintes classes usando o conceito de herança:
a. Data com os atributos dia, mês, ano e métodos get/set
b. Funcionário com os atributos nome, matrícula, data de contratação, se é
estrangeiro e métodos get/set.
c. Funcionário mensalista com o atributo salário mensal e métodos get/set.
d. Funcionário horista com os atributos valor da hora e número de horas
trabalhadas e métodos get/set
*/

public class Ex1 
{
    public static void main (String[] args)
    {
        Data data = new Data((byte) 14, (byte) 4, (short) 1990);
        FuncHorista func = new FuncHorista("Fulana", 1, data, true, 6.5f, 42);
        Funcionario func2 = new Funcionario("Fulana", 1, data, true);

       /*  System.out.println(func.getNome());
        System.out.println(func.getMatricula());
        System.out.println(func.getDataContr());
        System.out.println(func.isEstrangeiro());
        System.out.println(func.getValorHora());
        System.out.println(func.getHoras()); */

        System.out.println(func2.toString());
    }
}