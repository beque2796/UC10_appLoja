
package model;

public class Estado {
     private int codigo;
    private String nome;
    
    public Estado(){
        
    }
     public Estado(String nome){
         this.nome = nome;
        
    }
     
     public int getCodigo(){
         return codigo;
         
     }
    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    
     public String getNome(){
         return nome;
         
     }
     public void setNome (int codigo){
        this.nome = nome;
    }
    
}

