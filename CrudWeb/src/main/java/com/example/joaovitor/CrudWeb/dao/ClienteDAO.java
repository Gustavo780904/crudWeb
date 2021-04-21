package com.example.joaovitor.CrudWeb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.joaovitor.CrudWeb.dominio.Cliente;

public class ClienteDAO {
	public List<Cliente> listagem() throws SQLException {
		List<Cliente> lista = new ArrayList<Cliente>();
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "select * from cliente";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet resultado = stmt.executeQuery();
		while (resultado.next()) {
			Integer cod_cliente = resultado.getInt("cod_cliente");
			String cpf = resultado.getString("cpf");
			String nome = resultado.getString("nome_cliente");
			String endereco = resultado.getString("endereco");
			String data_nasc = resultado.getString("data_nasc");
			String email = resultado.getString("email");
			String telefone = resultado.getString("telefone");
			
			
			String dataAjustada = data_nasc.substring(8, 10) + "/" + data_nasc.substring(5, 7) + "/" + data_nasc.substring(0, 4);
			
			Cliente cliente = new Cliente(cod_cliente, cpf, nome, endereco, dataAjustada, email, telefone);
			lista.add(cliente);
		}
		resultado.close();
		stmt.close();
		conexao.close();
		return lista;
	}

}
