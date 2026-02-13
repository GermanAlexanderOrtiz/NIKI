package com.OSAL.NIKI.models;

import jakarta.persistence.*;

@Entity
public class Streamer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idStreamer;
  private String nombreCanal;
  private String descripcion;
  private String llaveTransmision;
  private String horario;
  private Long numeroSeguidores;
  private String cuentaBanco;
  private Long horasStreams;
}
