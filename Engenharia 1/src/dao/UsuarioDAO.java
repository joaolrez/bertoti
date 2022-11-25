/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import modelo.Login;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.mercadoDTO;

/**
 *
 * @author jprez
 */
public class UsuarioDAO{
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<mercadoDTO> lista = new ArrayList<>();
    
    
    public ResultSet autenticacaoUsuario(Login objlogin)  {
        conn = new ConnectionFactory().getConnection();
        
        try {
            String sql = "select * from administrador where senha = ? and usuario = ?";
            
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlogin.getSenha());
            pstm.setString(2, objlogin.getUsuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }    
    
    public void cadastrarMercado (mercadoDTO objcanaisDTO) {
        
        String sql = "INSERT INTO produtos (nome , marca, preco, tipo, quantidade )" + "VALUES (?, ?, ?, ?, ?)";
        
        conn = new ConnectionFactory().getConnection();
        
        try {
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objcanaisDTO.getNome());
            pstm.setString(2, objcanaisDTO.getMarca());
            pstm.setString(3, objcanaisDTO.getPreco());
            pstm.setString(4, objcanaisDTO.getTipo());
            pstm.setString(5, objcanaisDTO.getQuantidade());
            
            pstm.execute();
            pstm.close();
            
        }   catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "cadastrarMercado" + erro);
        }
    }
    
    
    
    
    public ArrayList<mercadoDTO> listarCanais() {
        
        String sql = "select * from produtos ";
        conn = new ConnectionFactory().getConnection();
        
        try{
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                mercadoDTO objmercadoDTO = new mercadoDTO();
                objmercadoDTO.setId(rs.getInt("id"));
                objmercadoDTO.setNome(rs.getString("nome"));
                objmercadoDTO.setMarca(rs.getString("marca"));
                objmercadoDTO.setPreco(rs.getString("preco"));
                objmercadoDTO.setTipo(rs.getString("tipo"));
                objmercadoDTO.setQuantidade(rs.getString("quantidade"));

                lista.add(objmercadoDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CanaisDAO" + erro);
        }
        return lista;
    }
    
 public void excluirCadastros(mercadoDTO objmercadoDTO){
     String sql = "delete from produtos where id = ? ";
     conn = new ConnectionFactory().getConnection();
     
     try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, objmercadoDTO.getId());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "cadastrarCanal" + erro);
        }

    }
 
 public void alterarCadastro(mercadoDTO objmercadoDTO){
    String sql = "UPDATE produtos SET nome = ?, marca = ?, preco = ?, tipo = ?, quantidade = ? WHERE id = ?";    
   
    conn = new ConnectionFactory().getConnection();
    
    
      try {

           pstm = (PreparedStatement) conn.prepareStatement(sql);
           pstm.setString(1, objmercadoDTO.getNome());
           pstm.setString(2, objmercadoDTO.getMarca());
           pstm.setString(3, objmercadoDTO.getPreco());
           pstm.setString(4, objmercadoDTO.getTipo());
           pstm.setString(5, objmercadoDTO.getQuantidade());
           pstm.setInt(6, objmercadoDTO.getId());
            

           pstm.execute();
           pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "AlterarProduto" + erro);
        }
 
 }
 
 public Vector  pesquisar(String pesq) throws Exception {
     Vector  tb = new Vector ();
     
     conn = new ConnectionFactory().getConnection();
     String sql = "select * from produtos where nome like '" + pesq + "%'";
     PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
     
     
     ResultSet rs = ps.executeQuery();
     while(rs.next()){
         Vector nl = new Vector();
         nl.add(rs.getInt("id"));
         nl.add(rs.getString("nome"));
         nl.add(rs.getString("marca"));
         nl.add(rs.getString("preco"));
         nl.add(rs.getString("tipo"));
         nl.add(rs.getString("quantidade"));
         
         tb.add(nl);
         
     }
     return tb;
 }
 }
    
    
