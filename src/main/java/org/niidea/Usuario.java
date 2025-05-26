package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class Usuario extends Base{
    private String auth0id;
    private String username;
}
