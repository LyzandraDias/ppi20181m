package academia.daos;

import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.List;

	import academia.models.Treinos;
	public class TreinosDAO {

		private Connection connection;

		public TreinosDAO() {
			connection = ConnectionFactory.getConnection();
		}
		
		public boolean inserir(Treinos treinos) {

			String sql = "insert into treinos (nome,valor) " + "values (?, ?);";
		
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);

				stmt.setString(1, treinos.getNome());
				stmt.setInt(2, treinos.getValor());
				
				

				stmt.execute();
				stmt.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}

			return true;
		}
		
		public List<Treinos> getLista() {
			List<Treinos> result = new ArrayList<>();
		
			try {
				PreparedStatement stmt = this.connection.prepareStatement("select * from treinos");
				ResultSet rs = stmt.executeQuery();
		
				while (rs.next()) {
					// criando o objeto livro
					Treinos treinos = new Treinos();
					treinos.setId(rs.getInt("id"));
					treinos.setNome(rs.getString("nome"));
					treinos.setValor(rs.getInt("valor"));
					
		
					
		
					// adicionando o objeto à lista
					result.add(treinos);
				}
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
		}

		public boolean alterar(Treinos treinos) {
			String sql = "insert into treinos (nome,valor) values (?, ?);";
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				
				stmt.setString(1, treinos.getNome());
				stmt.setLong(2, treinos.getValor());
				stmt.setLong(3, treinos.getId());
		
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

		public boolean remover(Treinos treinos) {
			try {
				PreparedStatement stmt = connection.prepareStatement("delete" + "from treinos where id=?");
				stmt.setLong(1, treinos.getId());
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

		public Treinos getTreinosById(int id) {
		Treinos treino = new Treinos();
		
			try {
				PreparedStatement stmt = this.connection.prepareStatement("select * from treinos where id=?");
				stmt.setLong(1, id);
				ResultSet rs = stmt.executeQuery();
		
				while (rs.next()) {
					// criando o objeto livro
					treino.setId(rs.getInt("id"));
					treino.setNome(rs.getString("nome"));
					treino.setValor(rs.getInt("valor"));
					
		
					
				}
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return treino;
		}

		public List<Treinos> buscar() {
			// TODO Auto-generated method stub
			return null;
		}
	
}


	
