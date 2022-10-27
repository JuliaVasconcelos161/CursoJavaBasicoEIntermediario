package com.loiane.cursojava.aula46;

public interface BancoDeDados extends SqlDCL, SqlDML, SqlDDL{
	
		void abrirConexao();
		void fecharConexao();
		

}
