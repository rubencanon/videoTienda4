package com.softII.dominio;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.softII.Util.JPAUtil;

/**
 * Hello world!
 *
 */
public class A1Principal {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		JPAUtil jpa = new JPAUtil();

		EntityManager em = jpa.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		/*
		Usuario user = new Usuario();
		
		user.setDocumentoId("81754742");
		user = user.buscarUsuario();
		
		
		user.getApellidos();
		
		/*
		/*
		Cliente cliente = new Cliente();
		Usuario usuario = new Usuario();
		Transaccion transaccion = new Transaccion();

		Pago pago = new Pago();

		pago.setTipoPago("Tarjeta");
		pago.setValor(new Double(1000000));
		

		Categoria categoria = new Categoria();
		
		List<Categoria> categoorias = categoria.listarCategorias();
		
		
		Rol rol = new Rol();
		
		List<Rol> roles = rol.listarRoles();

		
TipoTransaccion tipoTran = new TipoTransaccion();

List<TipoTransaccion> tipos = tipoTran.listarTiposTransaccion();
		// System.out.println("Nombre Cliente:" + cliente.getNombre1());

usuario.setIdUsuario("RUBEN.CANON");
usuario = usuario.buscarUsuario();



Set<Rol> rolesU = usuario.getRoles();

for (Rol rol2 : rolesU) {
	

	Set<Privilegio> provilegios = rol2.getPrivilegios();
	
	for (Privilegio p : provilegios) {
		System.out.println(p.getNombrePrivilegio());

	}
	
	
}
*/

	}
}
