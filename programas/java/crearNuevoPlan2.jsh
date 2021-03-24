List<String> crearNuevoPlan(List<String> planAnterior,
				   String nuevoCliente,
				   String clienteActual) {
	int indiceCliente = planAnterior.indexOf(clienteActual);
	List<String> planNuevo = new ArrayList<>(planAnterior);
	planNuevo.add(indiceCliente, nuevoCliente);
	return planAnterior;
}