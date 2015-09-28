-- begin PERFTEST_REQUEST
create table PERFTEST_REQUEST (
    ID uuid,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(255),
    TITLE varchar(255),
    DESCRIPTION varchar(1000),
    STATUS integer,
    --
    primary key (ID)
)^
-- end PERFTEST_REQUEST
-- begin PERFTEST_COMMENT
create table PERFTEST_COMMENT (
    ID uuid,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REQUEST_ID uuid,
    TEXT varchar(1000),
    USER_ID uuid,
    --
    primary key (ID)
)^
-- end PERFTEST_COMMENT
