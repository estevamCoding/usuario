package com.estevam.usuario.business.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class TelefoneDTO {

    private String numero;
    private int ddd;
}
