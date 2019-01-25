package academia.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import academia.models.Pagamento;

public class PagamentoDAO {
	private Connection connection;

	public PagamentoDAO() {
		connection = ConnectionFactory.getConnection();
	}
	public boolean inserir(Pagamento pagamento) {

		String sql = "insert into pagamento (aluno, treinos, dataPagamento) " + "values ( ?, ?,?);";
	
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			
			stmt.setInt(1, pagamento.getAluno().getId());
			stmt.setInt(2, pagamento.getTreino().getId());
			stmt.setDate(3, new java.sql.Date(pagamento.getDataPagamento().getTimeInMillis()));

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean atualizar(Pagamento pagamento) {

		String sql = "update pagamento set nome=?, dataPagamento=?, where id = ?";
	
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, pagamento.getAluno().getNome());
			
			
			stmt.setDate(2, new java.sql.Date(pagamento.getDataPagamento().getTimeInMillis()));
			
			stmt.setLong(3, pagamento.getId());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}
	public List<Pagamento> getLista() {
		List<Pagamento> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from pagamento");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				Pagamento pagamento = new Pagamento();
				pagamento.setId(rs.getInt("id"));
				pagamento.getAluno().setNome(rs.getString("nome"));
				

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataPagamento"));
				pagamento.setDataPagamento(data);

				// adicionando o objeto à lista
				result.add(pagamento);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public Pagamento getPagamentoById(int id) {
		Pagamento pagamento = new Pagamento();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from pagamento where nome=?");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Aluno
				pagamento.setId(rs.getInt("id"));
				pagamento.getAluno().setNome(rs.getString("nome"));
				

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataPagamento"));
				pagamento.setDataPagamento(data);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pagamento;
	}
	public Pagamento getPagamentoByNome(String nome) {
		Pagamento pagamento= new Pagamento();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from pagamento where nome=?");
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Aluno
				pagamento.setId(rs.getInt("id"));
				pagamento.getAluno().setNome(rs.getString("nome"));
				

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				pagamento.setDataPagamento(data);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pagamento;
	}
	public boolean remover(Pagamento pagamento) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from pagamento where dataPagamento=?");
			stmt.setLong(1, pagamento.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public List<Pagamento> getPagamento() {
		// TODO Auto-generated method stub
		return null;
	
}}
