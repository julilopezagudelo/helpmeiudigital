package co.edu.iudigital.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "casos")

public class Caso implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 7509375994430053778L;

	//id INT NOT NULL AUTO_INCREMENT,
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//fecha_hora DATETIME NULL DEFAULT now(),
	@Column(name = "fecha_hora")
	private LocalDateTime fechaHora;
	
	//latitud FLOAT NULL,
	private Float latitud;
	
	//longitud FLOAT NULL,
	private Float longitud;
	
	//altitud FLOAT NULL,
	private Float altitud;
	
	//visible TINYINT NULL DEFAULT 1,
	private Boolean visible;
	
	//descripcion VARCHAR(200) NULL,
	 @Column(name = "descripcion", length = 200)
	private String descripcion; 
	 
	//url_map TEXT NULL,
	 @Column(name = "url_map")
	 private String urlMap; 
	 
	//rmi_url TEXT NULL,
	 @Column(name = "rmi_url")
	 private String rmiUrl;
	 
	//usuarios_id INT NOT NULL,
	//FOREIGN KEY(usuarios_id) REFERENCES usuarios(id),
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name =  "usuarios_id")
	 private Usuario usuario;
	 
	//delitos_id INT NOT NULL,	
	//FOREIGN KEY(delitos_id) REFERENCES delitos(id),
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "delitos_id")
	 private Delito delito;
	
	@PrePersist
	public void init() {
		if(Objects.isNull(fechaHora)) {
			fechaHora = LocalDateTime.now();
	}
		if(Objects.isNull(visible)) {
			visible = true;
		}
	}

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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Delito getDelito() {
		return delito;
	}

	public void setDelito(Delito delito) {
		this.delito = delito;
	}
}
