/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.ArrayList;

public class Turma {
    //Atributos:
    private int Id;
    private String nome;
    private ArrayList <Aluno> ListaAluno;//Turma tem lista de alunos
    
    //Métodos Construtores
    public Turma(){
        ListaAluno = new ArrayList(); //Instância da lista
    }
    
    public Turma (int Id, String nome){
        this.Id=Id;
        this.nome=nome;
        ListaAluno = new ArrayList();
    }
    
    public int getId(){
    return Id;
    }
    
    public void setId (int Id){
       this.Id=Id;
    }
    
    public String getNome(){
    return nome;
    }
    
    public void setNome (String nome){
       this.nome=nome;
    }
    
    //Métodos gets e sets para manipular a ArrayList
    
    //Retornar a lista inteira de alunos
    public ArrayList <Aluno> getListaAluno() {
        return ListaAluno;
    }
    
    //Atribuir lista ao atributo
    public void setListaAluno(ArrayList <Aluno> ListaAluno) {
        this.ListaAluno = ListaAluno;
}
    
    //Adicionar aluno
    public void addAluno(Aluno A){
        A.setT(this);//Mudar atributo (T) para adicionar aluno a uma turma
        //Quando se adiciona um aluno a uma turma, deve-se alterar o atributo da turma do aluno
        ListaAluno.add(A);
    }

}
