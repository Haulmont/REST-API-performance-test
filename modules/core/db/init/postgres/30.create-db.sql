insert into perftest_request (id, number_,title,description,status)
select newid(), num, 'Title#'||num, 'Description#'||num, ((num % 4)+1) * 100 from generate_series(1, 100000) as num;
insert into perftest_comment (id, request_id, text) select newid(), id, 'Comment#'||number_ from perftest_request;
create index idx_request_status on perftest_request(status);

--http://localhost:8080/app-portal/api/query.json?view=_minimal&max=10&e=perftest$Request&q=select c from perftest$Request c&s=dbc9bcf1-9d22-6f20-d158-d82a2e1bd3f6


