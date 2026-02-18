package com.projects.auth.one_key_backend.dtos;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
    private UUID id = UUID.randomUUID();
    private String name;
}
