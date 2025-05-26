package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public abstract class Base {
    private long id;
    private boolean estaEliminado = false;
}
