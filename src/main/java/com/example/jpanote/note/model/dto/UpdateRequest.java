package com.example.jpanote.note.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UpdateRequest {
	private Long id;
	private String title;
	private String cont;
}
