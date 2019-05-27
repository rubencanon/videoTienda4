import com.softII.controlador.ControladorCliente;
import com.softII.dominio.Cliente;
import com.softII.vista.GestionClientes;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Cliente cliente = new Cliente();

		GestionClientes vistaCliente = new GestionClientes();

		ControladorCliente controlador = new  ControladorCliente(cliente, vistaCliente);

		vistaCliente.setControlador(controlador);

		controlador.iniciarVista();
		
		
	}

}
