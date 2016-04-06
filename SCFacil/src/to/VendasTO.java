package to;

public class VendasTO {

	package to;

	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.List;

	public class VendasTO {
		
		private int codVenda;
		public int getCodVenda() {
			return codVenda;
		}
		public void setCodVenda(int codVenda) {
			this.codVenda = codVenda;
		}
		public Calendar getDate() {
			return date;
		}
		public void setDate(Calendar date) {
			this.date = date;
		}
		public ClienteTO getCliente() {
			return cliente;
		}
		public void setCliente(ClienteTO cliente) {
			this.cliente = cliente;
		}
		public List<ProdutoTO> getProdutos() {
			return produtos;
		}
		public void setProdutos(List<ProdutoTO> produtos) {
			this.produtos = produtos;
		}
		private Calendar date;
		private ClienteTO cliente;
		private List<ProdutoTO> produtos = new ArrayList<>();

	}
}
