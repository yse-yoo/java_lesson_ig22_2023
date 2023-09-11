-- regist user
INSERT INTO users (name, number) VALUES ("YSE", "0000001");

-- select user
SELECT id FROM users WHERE number = "0000001";
-- users.id = 21

-- select room
SELECT id FROM rooms WHERE name = "203";
-- rooms.id = 6

-- reserve
INSERT INTO reserves (user_id, room_id, checkin_at, checkout_at)
VALUES (21, 6, "2023/07/05 15:00", "2023/07/06 10:00");