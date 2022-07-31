package co.edu.iudigital.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CasoDTO implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -4779886773654447822L;

	private Long id;
	
	private LocalDateTime fechaHora;
	
	private Float latitud;
	
	private Float longitud;
	
	private Float altitud;
	
	private Boolean visible;
	
	private String descripcion; 
	 
	 private String urlMap; 
	 
	 private String rmiUrl;
	 
	 private Long usuarioId;
	 
	 private String nombre;
	 
	 private String image;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Float getLatitud() {
		return latitud;
	}

	public void setLatitud(Float latitud) {
		this.latitud = latitud;
	}

	public Float getLongitud() {
		return longitud;
	}

	public void setLongitud(Float longitud) {
		this.longitud = longitud;
	}

	public Float getAltitud() {
		return altitud;
	}

	public void setAltitud(Float altitud) {
		this.altitud = altitud;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlMap() {
		return urlMap;
	}

	public void setUrlMap(String urlMap) {
		this.urlMap = urlMap;
	}

	public String getRmiUrl() {
		return rmiUrl;
	}

	public void setRmiUrl(String rmiUrl) {
		this.rmiUrl = rmiUrl;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	 
}
