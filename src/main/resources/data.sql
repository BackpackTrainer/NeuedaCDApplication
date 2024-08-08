INSERT INTO ARTIST (name) VALUES
('Pink Floyd'),
('The Beatles'),
('Harry Chapin'),
('Jimmy Buffet');


INSERT INTO CD (title, artist_id) VALUES
('Brilliant Choices', (SELECT artist_id FROM ARTIST where name = 'Pink Floyd')),
('Dark Side of the Moon', (SELECT artist_id FROM Artist where name = 'Pink Floyd')),
('Abby road', (SELECT artist_id FROM Artist where name = 'The Beatles')),
('Heads and Tails', (SELECT artist_id FROM Artist where name = 'Harry Chapin')),
('Bars, Boats & Ballads', (SELECT artist_id FROM Artist where name = 'Jimmy Buffet'));
