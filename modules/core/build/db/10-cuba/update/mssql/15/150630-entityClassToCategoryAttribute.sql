-- $Id: 150630-entityClassToCategoryAttribute.sql 21991 2015-07-02 11:03:55Z degtyarjov $
alter table SYS_CATEGORY_ATTR add ENTITY_CLASS varchar(500)^
update SYS_CATEGORY_ATTR set ENTITY_CLASS = DATA_TYPE where IS_ENTITY = 1^
update SYS_CATEGORY_ATTR set DATA_TYPE = 'ENTITY' where IS_ENTITY = 1^
--alter table SYS_CATEGORY_ATTR drop column IS_ENTITY^
