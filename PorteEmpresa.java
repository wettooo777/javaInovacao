public enum PorteEmpresa {
    PEQUENA(100_000),      // Limite de 100 MB/mês
    MEDIA(1_000_000),     // Limite de 1 GB/mês
    GRANDE(100_000_000);  // Limite de 100 GB/mês

    private final long limiteProcessamentoMB;

    PorteEmpresa(long limiteProcessamentoMB) {
        this.limiteProcessamentoMB = limiteProcessamentoMB;
    }

    public long getLimiteProcessamentoMB() {
        return limiteProcessamentoMB;
    }
}