public class DocumentoSilo {
    private String id;
    private String departamento;
    private String conteudoBruto;
    private String categoriaSeguranca;
    private long timestamp;

    public DocumentoSilo(String id, String departamento, String conteudoBruto, String categoriaSeguranca) {
        this.id = id;
        this.departamento = departamento;
        this.conteudoBruto = conteudoBruto;
        this.categoriaSeguranca = categoriaSeguranca;
        this.timestamp = System.currentTimeMillis();
    }

    public String getId() { return id; }
    public String getDepartamento() { return departamento; }
    public String getConteudoBruto() { return conteudoBruto; }
    public String getCategoriaSeguranca() { return categoriaSeguranca; }
    public long getTimestamp() { return timestamp; }
}