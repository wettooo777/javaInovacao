public class Main {

    public static void main(String[] args) {
        System.out.println("================================================================");
        System.out.println("   PLATAFORMA DE GESTÃO DE CONHECIMENTO E DECISÃO COM IA");
        System.out.println("==============================================================%%\n");

        MotorTomadaDecisaoService motor = new MotorTomadaDecisaoService();

        // Cenário 1: Consulta de Gerente (idEmpresa = 1, idUsuario = 1)
        System.out.println(">>> CENÁRIO 1: Consulta realizada por GERENTE");
        String perguntaGerente = "Qual a melhor estratégia para a região Sul?";
        String respostaGerente = motor.processarPerguntaEstrategica(1, 1, perguntaGerente, PorteEmpresa.MEDIA, NivelAcesso.GERENTES);

        System.out.println("\n[RESPOSTA DA IA PARA O GERENTE]:");
        System.out.println(respostaGerente);

        System.out.println("\n================================================================");

        // Cenário 2: Consulta de Diretor (idEmpresa = 1, idUsuario = 2)
        System.out.println(">>> CENÁRIO 2: Consulta realizada por DIRETOR");
        String perguntaDiretor = "Qual o balanço geral da empresa e desempenho regional?";
        String respostaDiretor = motor.processarPerguntaEstrategica(1, 2, perguntaDiretor, PorteEmpresa.GRANDE, NivelAcesso.DIRETORES);

        System.out.println("\n[RESPOSTA DA IA PARA O DIRETOR]:");
        System.out.println(respostaDiretor);
    }
}