package com.coffee.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
	private int ino;
	private int iprice;
	private int oprice;
	private int amount;
	private String remark;
	private String resdate;
	private Product product;
}
