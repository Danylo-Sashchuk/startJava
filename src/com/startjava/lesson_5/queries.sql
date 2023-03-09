select * from jaegers;
select * from jaegers where status = true;
select * from jaegers where mark IN (1, 4);
select * from jaegers where mark NOT IN (1, 4);
/* test comment */
select * from jaegers order by mark desc;
select * from jaegers where launch = (select min(launch) from jaegers);
select * from jaegers where kaijuKill = (select max(kaijuKill) from jaegers);
select trunc(avg(weight), 2) as avg_weight from jaegers;
update jaegers set kaijuKill = kaijuKill + 1 where status = true;
delete from jaegers where status = false;