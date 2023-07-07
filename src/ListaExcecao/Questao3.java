package ListaExcecao;

//exceção para dados invalidos
class DadoInvalidoException extends Exception{
	public DadoInvalidoException(String mensagem) {
		super(mensagem);
	}
}

class RepositorioException extends Exception{
	public RepositorioException(String mensagem) {
		super(mensagem);
	}
}

class ClienteJaExistenteException extends Exception{
	public ClienteJaExistenteException(String mensagem) {
		super(mensagem);
	}
}

class ClienteInexistenteException extends Exception {
	 public ClienteInexistenteException(String mensagem) {
	     super(mensagem);
	 }
	}

class Cliente {
	 private String cpf;

	 public Cliente(String cpf) throws DadoInvalidoException {
	     setCpf(cpf);
	 }

	 public String getCpf() {
	     return cpf;
	 }

	 public void setCpf(String cpf) throws DadoInvalidoException {
	     if (cpf == null || cpf.isEmpty()) {
	         throw new DadoInvalidoException("CPF inválido");
	     }
	     this.cpf = cpf;
	 }
	}
