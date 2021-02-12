
package funcionario;

public class Funcionario{
    //Atributos
    private String nome;
    private int id;
    private String cargo;
    private double salario;
    
    //Métodos acessores
    /**
     * Atribui um valor ao atributo nome.
     * @param nome String
     */
    public void setNome(String nome){  
        this.nome=nome;
    }
    
    /**
     * Retorna o valor do atributo nome
     * @return String
     */
    public String getNome(){
     return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) { 
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
