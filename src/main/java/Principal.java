import com.softII.controlador.ControladorCliente;
import com.softII.controlador.ControladorCompras;
import com.softII.controlador.ControladorAutenticacion;
import com.softII.dominio.Cliente;
import com.softII.dominio.Pedido;
import com.softII.dominio.Usuario;
import com.softII.vista.GestionClientes;
import com.softII.vista.Autenticacion;
import com.softII.vista.Compras;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
		Usuario usuario = new Usuario();

		Autenticacion autenticacion = new Autenticacion();

		ControladorAutenticacion controlador = new ControladorAutenticacion(usuario, autenticacion);

		autenticacion.setControlador(controlador);

		controlador.iniciarVista();
		
*/		
		Pedido pedido = new Pedido();

		Compras compras = new Compras();

		ControladorCompras controlador = new ControladorCompras(compras, pedido);

		compras.setControlador(controlador);

		controlador.iniciarVista();	
		
	}

}
