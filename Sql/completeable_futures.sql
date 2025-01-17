create table if not exists completeable_futures(
streaming_code varchar(255) not null,
xhr_method varchar(255) null,
sse_emitter char null,
non_blocking_service Integer null,
event_source varchar(255) null,
get_element_by_id varchar(255) null,
create_text_node varchar(255) null,
create_element varchar(255) null,
append_child varchar(255) null,
on_message_event_id Integer null,
on_message_event_name varchar(255) null,
server_sent_event varchar(255) null,
client_recieved_event varchar(255) null,
constraint completeable_futures_pk primary key(streaming_code));