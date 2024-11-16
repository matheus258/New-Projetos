package br.com.alunonet.Enums;

public enum Curso {
    ADMINISTRACAO("Administração"),
    ENGENHARIA_CIVIL("Engenharia Civil"),
    ENGENHARIA_PRODUCAO("Engenharia de Produção"),
    ENGENHARIA_COMPUTACAO("Engenharia da Computação"),
    CIENCIAS_COMPUTACAO("Ciências da Computação"),
    SISTEMAS_INFORMACAO("Sistemas de Informação"),
    ANALISE_DESENVOLVIMENTO_SISTEMAS("Análise e Desenvolvimento de Sistemas"),
    DIREITO("Direito"),
    MEDICINA("Medicina"),
    ENFERMAGEM("Enfermagem"),
    FARMACIA("Farmácia"),
    PSICOLOGIA("Psicologia"),
    PEDAGOGIA("Pedagogia"),
    ARQUITETURA_URBANISMO("Arquitetura e Urbanismo"),
    DESIGN_GRAFICO("Design Gráfico"),
    PUBLICIDADE_PROPAGANDA("Publicidade e Propaganda"),
    JORNALISMO("Jornalismo"),
    EDUCACAO_FISICA("Educação Física"),
    LETRAS("Letras"),
    MATEMATICA("Matemática"),
    FISICA("Física"),
    QUIMICA("Química"),
    BIOLOGIA("Biologia"),
    RELACOES_INTERNACIONAIS("Relações Internacionais"),
    MARKETING("Marketing"),
    ECONOMIA("Economia"),
    CONTABILIDADE("Ciências Contábeis"),
    GASTRONOMIA("Gastronomia"),
    TURISMO("Turismo"),
    ODONTOLOGIA("Odontologia"),
    VETERINARIA("Medicina Veterinária"),
    FISIOTERAPIA("Fisioterapia");

    private String curso;

    private Curso(String curso) {
        this.curso = curso;
    }

}
