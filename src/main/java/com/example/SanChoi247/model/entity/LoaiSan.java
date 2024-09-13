package com.example.SanChoi247.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoaiSan {
    // loai_san_id int auto_increment primary key,
    // loai_san_type varchar(50),
    // so_luong_san int,
    // name varchar(2)
    private int loai_san_id;
    private String loai_san_type;
    private int so_luong_san;
    private String name;
}
