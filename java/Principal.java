import com.softII.controlador.ControladorCliente;
import com.softII.controlador.ControladorCompras;
import com.softII.controlador.ControladorAutenticacion;
import com.softII.dominio.Cliente;
import com.softII.dominio.Pedido;
import com.softII.dominio.Usuario;
import com.softII.vista.Autenticacion;
import com.softII.vista.Compras;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Autenticacion autenticacion = new Autenticacion();

		ControladorAutenticacion controlador = new ControladorAutenticacion(autenticacion);

		autenticacion.setControlador(controlador);

		controlador.iniciarVista();

	}

}
