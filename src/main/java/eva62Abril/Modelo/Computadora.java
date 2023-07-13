package eva62Abril.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Computadora {
	@Id
	@Column(name="com_codigo")
	private String codigo;
	
	@Column(name="com_marca")
	private String marca;
	
	@Column(name="com_tipo")
	private String tipo;
	
	@Column(name="com_color")
	private String color;
	
	@Column(name="com_modelo")
	private String modelo;

	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Computadora [codigo=" + codigo + ", marca=" + marca + ", tipo=" + tipo + ", color=" + color
				+ ", modelo=" + modelo + "]";
	}

	

	
	
}
