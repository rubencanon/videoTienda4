import com.softII.controlador.ControladorCliente;
import com.softII.controlador.ControladorAutenticacion;
import com.softII.dominio.Cliente;
import com.softII.dominio.Usuario;
import com.softII.vista.GestionClientes;
import com.softII.vista.Autenticacion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Usuario usuario = new Usuario();

		Autenticacion autenticacion = new Autenticacion();

		ControladorAutenticacion controlador = new ControladorAutenticacion(usuario, autenticacion);

		autenticacion.setControlador(controlador);

		controlador.iniciarVista();
		
		
		
		
	}

}
