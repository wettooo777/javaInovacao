public class SecurityGovernanceFilter {

    public static boolean validarAcessoAoConhecimento(NivelAcesso perfilUsuario, String categoriaDado) {
        if ("FINANCEIRO_CONFIDENCIAL".equals(categoriaDado) && perfilUsuario != NivelAcesso.DIRETORES) {
            return false; // Bloqueia acesso a dados sensíveis para quem não é DIRETOR
        }
        return true;
    }
}