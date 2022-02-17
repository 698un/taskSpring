
ALTER TABLE t_users ADD role_id BIGINT NOT NULL;
UPDATE t_users set role_id = 2;


