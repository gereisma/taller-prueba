package uy.edu.cei.taller.bean;

public class UsuarioBean {

	private String nombreUsuario;
	private String email;
	private String contraseña;
	private String ubicacion;
	private String activo;
	private String idRol;
	private String valoracion;
	private String verificado;
	private String connId;
	private String isEliminado;
	
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getIdRol() {
		return idRol;
	}

	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}

	public String getValoracion() {
		return valoracion;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}

	public String getVerificado() {
		return verificado;
	}

	public void setVerificado(String verificado) {
		this.verificado = verificado;
	}

	public String getConnId() {
		return connId;
	}

	public void setConnId(String connId) {
		this.connId = connId;
	}

	public String getIsEliminado() {
		return isEliminado;
	}

	public void setIsEliminado(String isEliminado) {
		this.isEliminado = isEliminado;
	}

}
