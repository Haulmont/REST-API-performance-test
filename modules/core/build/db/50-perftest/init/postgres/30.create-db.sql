insert into perftest_request (id, number_,title,description)
select newid(), num, 'Title#'||num, 'Description#'||num from generate_series(1, 100000) as num;

insert into perftest_comment (id, request_id, text) select newid(), id, 'Comment#'||number_ from perftest_request;


