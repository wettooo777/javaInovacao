import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DocumentoRepository {

    public List<DocumentoSilo> buscarDocumentosPorPermissao(int idEmpresa, NivelAcesso perfilUsuario) {
        List<DocumentoSilo> documentos = new ArrayList<>();

        // Se for DIRETOR, busca todos os documentos. Caso contrário, ignora confidenciais.
        String sql = (perfilUsuario == NivelAcesso.DIRETORES)
                ? "SELECT id_documento, departamento, conteudo_bruto, categoria_seguranca FROM documentos_silo WHERE id_empresa = ?"
                : "SELECT id_documento, departamento, conteudo_bruto, categoria_seguranca FROM documentos_silo WHERE id_empresa = ? AND categoria_seguranca != 'FINANCEIRO_CONFIDENCIAL'";

        try (Connection conn = ConexaoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idEmpresa);
            ResultSet rs = stmt.executeQuery();

            // Mapeia o resultado do SQL para objetos Java
            while (rs.next()) {
                DocumentoSilo doc = new DocumentoSilo(
                    rs.getString("id_documento"),
                    rs.getString("departamento"),
                    rs.getString("conteudo_bruto"),
                    rs.getString("categoria_seguranca")
                );
                documentos.add(doc);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar documentos no banco: " + e.getMessage());
        }

        return documentos;
    }

    public void salvarHistoricoConsulta(int idUsuario, String pergunta, String resposta) {
        String sql = "INSERT INTO historico_consultas (id_usuario, pergunta_usuario, resposta_ia) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idUsuario);
            stmt.setString(2, pergunta);
            stmt.setString(3, resposta);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao salvar histórico: " + e.getMessage());
        }
    }
}