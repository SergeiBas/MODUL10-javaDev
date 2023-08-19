INSERT INTO client (name)
VALUES ('Seraphina'),
       ('Orion'),
       ('Isabella'),
       ('Jasper'),
       ('Elara'),
       ('Atticus'),
       ('Livia'),
       ('Maximus'),
       ('Evangeline'),
       ('Felix');

INSERT INTO planet (planet_id, name)
VALUES ('VRDN', 'Veridion'),
       ('ASTR', 'Astra'),
       ('CELM', 'Caelum'),
       ('LYRA','Lyra'),
       ('ZEP7', 'Zephyr');

INSERT INTO ticket (client_id, from_planet_id, to_planet_id)
VALUES (1, 'VRDN', 'ASTR'),
       (2, 'CELM', 'ZEP7'),
       (3, 'LYRA', 'ASTR'),
       (4, 'VRDN', 'ZEP7'),
       (5, 'VRDN', 'LYRA'),
       (6, 'ASTR', 'CELM'),
       (7, 'ZEP7', 'ASTR'),
       (8, 'CELM', 'LYRA'),
       (9, 'VRDN', 'ZEP7'),
       (10, 'ASTR', 'VRDN');