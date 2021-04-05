create table if not exists test
(
    id   bigint      not null comment 'id' primary key,
    name varchar(50) comment '名称',
    password varchar(50) comment '密码'
)
    comment '测试';

