CREATE TABLE mana_building
(
  relation_id  BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  mana_id      BIGINT   NOT NULL,
  dorm_id      BIGINT   NOT NULL,
  gmt_creat    DATETIME NULL,
  gmt_modified DATETIME NULL,
  CONSTRAINT manager_building_relation_id_uindex
  UNIQUE (relation_id),
  CONSTRAINT manager_building_mana_id_uindex
  UNIQUE (mana_id),
  CONSTRAINT manager_building_dorm_id_uindex
  UNIQUE (dorm_id)
)
  ENGINE = InnoDB;

CREATE TABLE mana_stu
(
  relation_id  BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  mana_id      BIGINT   NOT NULL,
  stu_id       BIGINT   NOT NULL,
  gmt_creat    DATETIME NULL,
  gmt_modified DATETIME NULL,
  CONSTRAINT mana_stu_relation_id_uindex
  UNIQUE (relation_id),
  CONSTRAINT mana_stu_mana_id_uindex
  UNIQUE (mana_id),
  CONSTRAINT mana_stu_stu_id_uindex
  UNIQUE (stu_id)
)
  ENGINE = InnoDB;

CREATE TABLE stu_building
(
  relation_id  BIGINT UNSIGNED AUTO_INCREMENT
  COMMENT '学生和寝室关系id'
    PRIMARY KEY,
  stu_id       BIGINT UNSIGNED     NOT NULL
  COMMENT '学生id',
  dorm_id      BIGINT UNSIGNED     NOT NULL
  COMMENT '寝室id',
  bed_num      TINYINT DEFAULT '0' NULL,
  gmt_create   DATETIME            NOT NULL
  COMMENT '创建时间',
  gmt_modified DATETIME            NOT NULL
  COMMENT '修改时间',
  CONSTRAINT stu_id
  UNIQUE (stu_id)
)
  ENGINE = InnoDB;

CREATE TABLE stu_inter
(
  inter_id     BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  stu_id       BIGINT      NOT NULL,
  inter        VARCHAR(40) NOT NULL,
  gmt_creat    DATETIME    NULL,
  gmt_modified DATETIME    NULL,
  CONSTRAINT stu_inter_inter_id_uindex
  UNIQUE (inter_id),
  CONSTRAINT stu_inter_stu_id_uindex
  UNIQUE (stu_id)
)
  ENGINE = InnoDB;

CREATE TABLE tbl_building
(
  dorm_id             BIGINT UNSIGNED AUTO_INCREMENT
  COMMENT '寝室id'
    PRIMARY KEY,
  building_number     VARCHAR(10)                  NOT NULL
  COMMENT '寝室楼栋',
  dorm_number         VARCHAR(10)                  NOT NULL
  COMMENT '寝室号',
  dorm_max_people     TINYINT UNSIGNED             NOT NULL
  COMMENT '最多入住人数',
  dorm_current_people TINYINT UNSIGNED DEFAULT '0' NOT NULL
  COMMENT '当前入住人数',
  dorm_1_bed          TINYINT UNSIGNED DEFAULT '0' NOT NULL
  COMMENT '一号床位，0无1有',
  dorm_2_bed          TINYINT UNSIGNED DEFAULT '0' NOT NULL
  COMMENT '二号床位，0无1有',
  dorm_3_bed          TINYINT UNSIGNED DEFAULT '0' NOT NULL
  COMMENT '三号床位，0无1有',
  dorm_4_bed          TINYINT UNSIGNED DEFAULT '0' NOT NULL
  COMMENT '四号床位，0无1有',
  dorm_5_bed          TINYINT UNSIGNED DEFAULT '0' NOT NULL
  COMMENT '五号床位，0无1有',
  dorm_6_bed          TINYINT UNSIGNED DEFAULT '0' NOT NULL
  COMMENT '六号床位，0无1有',
  gmt_create          DATETIME                     NOT NULL
  COMMENT '创建时间',
  gmt_modified        DATETIME                     NOT NULL
  COMMENT '修改时间',
  CONSTRAINT dorm_id
  UNIQUE (dorm_id)
)
  ENGINE = InnoDB;

CREATE TABLE tbl_manager
(
  mana_id       BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  mana_name     VARCHAR(10) NULL,
  mana_password VARCHAR(50) NULL,
  mana_email    VARCHAR(50) NULL,
  gmt_creat     DATETIME    NULL,
  gmt_modified  DATETIME    NULL,
  CONSTRAINT tbl_manager_mana_id_uindex
  UNIQUE (mana_id)
)
  ENGINE = InnoDB;

CREATE TABLE tbl_stu
(
  stu_id       BIGINT UNSIGNED AUTO_INCREMENT
  COMMENT '学生id'
    PRIMARY KEY,
  stu_card_id  VARCHAR(20) NOT NULL
  COMMENT '学号',
  stu_name     VARCHAR(50) NOT NULL
  COMMENT '学生名',
  stu_password VARCHAR(50) NOT NULL
  COMMENT '用户密码',
  stu_email    VARCHAR(50) NULL,
  gmt_create   DATETIME    NOT NULL
  COMMENT '创建时间',
  gmt_modified DATETIME    NOT NULL
  COMMENT '修改时间',
  CONSTRAINT stu_card_id
  UNIQUE (stu_card_id)
)
  ENGINE = InnoDB;


