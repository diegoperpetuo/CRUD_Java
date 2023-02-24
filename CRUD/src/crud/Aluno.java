/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;


public class Aluno {
    //Atributos:
    private int Matricula;
    private String nome;
    private Turma T;//Aluno pertence a uma turma
    
    public Aluno(){
    }
    
    public Aluno (int Matricula, String nome){
        this.Matricula=Matricula;
        this.nome=nome;
    }
    
    public int getMatricula(){
    return Matricula;
    }
    
    public void setMatricula (int Matricula){
       this.Matricula=Matricula;
    }
    
    public String getNome(){
    return nome;
    }
    
    public void setNome (String nome){
       this.nome=nome;
    }
    
    public Turma getT() {
        return T;
    }

    public void setT(Turma T) {
        this.T = T;
    }
}
