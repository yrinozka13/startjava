SELECT * FROM robots;
SELECT * FROM robots WHERE NOT status ='Destroyed';
SELECT * FROM robots WHERE mark IN ('Mark-1', 'Mark-5');
SELECT * FROM robots ORDER BY mark DESC;
SELECT * FROM robots WHERE launch = (SELECT MIN(launch) FROM robots);
SELECT * FROM robots WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM robots);
SELECT * FROM robots WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM robots);
SELECT AVG(weight) AS mark FROM robots;
UPDATE robots SET kaijuKill = kaijuKill + 1 WHERE NOT status ='Destroyed';
DELETE FROM robots WHERE status = 'Destroyed';
SELECT * FROM robots;
