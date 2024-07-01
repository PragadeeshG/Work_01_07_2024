create table if not exists stomp_websocket(
handler Integer not null,
annotation varchar(255) null,
message_mapping varchar(255) null,
send_to varchar(255) null,
filters Integer null,
metric_filters Integer null,
stereotype Integer null,
synthetics varchar(255) null,
html_utils varchar(255) null,
web_socket_config varchar(255) null,
enable_web_socket_message_broker varchar(255) null,
enable_simple_broker varchar(255) null,
set_application_destination_prefixes varchar(255) null,
add_endpoint varchar(255) null,
constraint stomp_websocket_pk primary key(handler));