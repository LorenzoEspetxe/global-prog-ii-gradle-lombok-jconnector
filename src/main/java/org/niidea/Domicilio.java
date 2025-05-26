package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class Domicilio extends Base{
    public String calle;
    public int numero;
    public int cp;
    public Localidad localidad;
}
