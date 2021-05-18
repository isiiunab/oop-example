package co.employes;

public class Factura implements PorPagar{
	private String numeroProducto;
	private String descripcionProducto;
	private int cantidad;
	private double precio;
	
	public Factura(String numeroProducto, String descripcionProducto, int cantidad, double precio) {
		this.numeroProducto = numeroProducto;
		this.descripcionProducto = descripcionProducto;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	@Override
	public double obtenerMontoPagado() {
		return this.calcularValor();
	}
	
	@Override
	public String display() {
		return this.toString();
	}
	
	
	public double calcularValor() {
		return this.cantidad * this.precio;
	}
	
	
	@Override
	public String toString() {
		return "Factura [numeroProducto=" + numeroProducto + ", descripcionProducto=" + descripcionProducto
				+ ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}

	public String getNumeroProducto() {
		return numeroProducto;
	}

	public void setNumeroProducto(String numeroProducto) {
		this.numeroProducto = numeroProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
