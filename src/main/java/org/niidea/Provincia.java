package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class Provincia extends Base{
    private String nombre;
    private Pais pais;
}