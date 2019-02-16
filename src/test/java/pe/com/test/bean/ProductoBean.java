package pe.com.test.bean;

public class ProductoBean {

	private String nombre;
	private Integer IdCategoria;
	private Double precio;
	
	
	public ProductoBean(String nombre, Integer IdCategoria, Double precio) {
		this.nombre = nombre;
		this.IdCategoria = IdCategoria;
		this.precio = precio;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public Integer getIdCategoria(){
		return IdCategoria;
	}
	
	public Double getPrecio(){
		return precio;
	}
	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void setIdCategoria(Integer IdCategoria){
		this.IdCategoria = IdCategoria;
	}
	
	public void setPrecio(Double precio){
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "ProductoBean: " + this.nombre +""+ this.IdCategoria+""+this.precio;
	}
	
	
}

