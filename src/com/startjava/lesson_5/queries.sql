    
/* all rows */
SELECT *
FROM jaegers;
    
    
/*active jaegers*/
SELECT *
FROM jaegers
WHERE status = TRUE;
    
    
/*mark 1 and 4 jaegers*/
SELECT *
FROM jaegers
WHERE mark IN (1,
               4);
    
    
/*all jaegers except mark 1 and 4*/
SELECT *
FROM jaegers
WHERE mark NOT IN (1,
                   4);
    
    
/*jaegers sorted by mark on descending order*/
SELECT *
FROM jaegers
ORDER BY mark DESC;
    
    
/*oldest jaeger*/
SELECT *
FROM jaegers
WHERE launch =
    (SELECT min(launch)
     FROM jaegers);
    
    
/*jaegers with the most kills*/
SELECT *
FROM jaegers
WHERE kaijuKill =
    (SELECT max(kaijuKill)
     FROM jaegers);
    
    
/*avarage jaeger weight*/
SELECT trunc(avg(weight), 2) AS avg_weight
FROM jaegers;
    
    
/*all active jaegers get one more kill*/
UPDATE jaegers
SET kaijuKill = kaijuKill + 1
WHERE status = TRUE;
    
    
/*delete destroyed jaegers*/
DELETE
FROM jaegers
WHERE status = FALSE;