/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class ProdutosDTO {
    private int id;
    private String nome;
    private double valor; // <-- Certifique-se de que é double aqui
    private String status;

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getValor() { return valor; } // <-- Retorna double
    public void setValor(double valor) { this.valor = valor; } // <-- Recebe double

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
