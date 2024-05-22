public class Empregado {
    private String nome;
    private int idade;
    private double salario;

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void promover() {
        if (this.idade > 18) {
            aumentarSalario(25);
            System.out.println("O empregado " + this.nome + " foi promovido!");
        } else {
            System.out.println("O empregado não tem idade necessária");
        }
    }

    public void aumentarSalario(double percent) {
        this.salario = (percent * this.salario / 100) + this.salario;
    }

    public void demitir(int motivo) {
        switch (motivo) {
            case 2:
                double multa = 40 * this.salario / 100;
                System.out.println("O empregado deverá pagar " + multa + " de multa");
                break;
            case 3:
                if (this.salario > 1000 && this.salario <= 2000) {
                    this.salario = 1500;
                } else if (this.salario > 2000 && this.salario <= 3000) {
                    this.salario = 2500;
                } else if (this.salario > 3000 && this.salario <= 4000) {
                    this.salario = 3500;
                } else {
                    this.salario = 4000;
                }
                break;
            default:
                System.out.println("O empregado deverá cumprir aviso prévio");
                break;
        }
    }

    public void fazerAniversario() {
        this.idade++;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
