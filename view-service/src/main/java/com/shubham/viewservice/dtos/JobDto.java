package com.shubham.viewservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class JobDto {

    private String title;
    private Date timestamp;
}
