create table if not exists http_streaming(
streaming_code varchar(255) not null,
streaming_name varchar(255) null,
streaming_type varchar(255) null,
response_body_emitter varchar(255) null,
response_entity varchar(255) null,
executor_service varchar(255) null,
executors varchar(255) null,
new_cached_thread_pool varchar(255) null,
media_type varchar(255) null,
complete_with_error varchar(255) null,
constraint http_streaming_pk primary key(streaming_code));