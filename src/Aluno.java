public class Aluno {
    private String nome;
    private String semestre;
    private String sala;
    private String curso;
    private float[] notas = new float[6];
    private Endereco endereco;

    public Aluno(String nome, String semestre, String sala, String curso, float[] notas, Endereco endereco) {
        this.nome = nome;
        this.semestre = semestre;
        this.sala = sala;
        this.curso = curso;
        this.notas = notas;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}