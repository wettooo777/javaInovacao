# 📊 Gerador Interativo de Gráficos

Aplicação web interativa e responsiva para geração e visualização instantânea de gráficos a partir de arquivos de dados ou entrada manual, sem depender de APIs externas ou custos de processamento em nuvem.

---

## 🛠️ Tecnologias Utilizadas

- **Front-end:** HTML5, CSS3 (Layout Responsivo) e JavaScript Vanilla (Client-Side).
- **Renderização de Gráficos:** [Chart.js](https://www.chartjs.org/) via CDN.
- **Ambiente de Desenvolvimento:** GitHub Codespaces.

---

## 📈 Tipos de Gráficos Suportados

1. **Pizza (Pie Chart)**
2. **Colunas (Vertical Bar Chart)**
3. **Barras (Horizontal Bar Chart)**
4. **Linhas (Line Chart)**
5. **Área (Filled Line Chart)**
6. **Histograma (Frequency Distribution)**
7. **Dispersão (Scatter Plot)**

---

## 📂 Formatos de Dados Aceitos (Importação)

A aplicação extrai automaticamente rótulos e valores numéricos de arquivos locais:

- **CSV (`.csv` / `.txt`):** Compatível com o padrão brasileiro (separador `;` e vírgula decimal `,`) e internacional (separador `,` e ponto decimal `.`).
- **JSON (`.json`):** Listas de objetos contendo pares de chave/valor (categoria e número).
- **SQL (`.sql`):** Scripts contendo comandos `INSERT INTO ... VALUES ('Categoria', Valor);`.

---

## 🚀 Como Executar no GitHub Codespaces

1. Abra o terminal integrado do Codespaces e inicie um servidor HTTP simples:
   ```bash
   python3 -m http.server 8080