package com.example.jpanote.note.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
// 사용자에게 데이터를 반환하기 위한 DTO
public class CreateResponse {
	private Long id;
	private String title;
	private String cont;
	private String senderEmail;
	private String receiverEmail;
}
