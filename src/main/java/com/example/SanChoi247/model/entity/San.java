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
public class San {
    // san_id int auto_increment primary key,
    // name varchar(64),
    // description text,
    // location varchar(256),
    // loai_san_id int,
    // foreign key(loai_san_id) references loaiSan(loai_san_id),
    // chu_san_id int,
    // foreign key (chu_san_id) references chuSan(chu_san_id),
    // poster text,
    // banner text,
    // is_approve int
    private int san_id;
    private String name;
    private String description;
    private String location;
    private LoaiSan loaiSan;
    private ChuSan chuSan;
    private String poster;
    private String banner;
    private int is_approve;// 0. pending 1. Approved 2. Hide 3. Rejected 4.Request PayMent 5. Resolved
}
