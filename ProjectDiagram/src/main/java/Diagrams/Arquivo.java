/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diagrams;
import java.util.*;

/**
 *
 * @author Aluno
 */
public abstract class Arquivo {
    private String conteudo;
    private Float tamanho;
    private Date dataCriacao;
    private Date dataModificacao;
    private String autor;
    
    public float getTamanho() {
        return tamanho;
    }
    
    public String getExtensao() {
        return conteudo;
    }
}
