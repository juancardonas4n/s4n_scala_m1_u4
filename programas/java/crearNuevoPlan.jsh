List<String> crearNuevoPlan(List<String> planAnterior,
				   String nuevoCliente,
				   String clienteActual) {
	int indiceCliente = planAnterior.indexOf(clienteActual);
	planAnterior.add(indiceCliente, nuevoCliente);
	return planAnterior;
}
