--Recruiters Data
insert into recruiters values (1, 'Ryan Oberoi', 'Apex Systems', ST_GeomFromText('POLYGON((-114.897263 36.039836, -122.4162978 37.708798, -121.939784 37.30325, -118.302486 34.022413, -116.97866 32.744394, -114.897263 36.039836))'), 'Bio Technology', 'Java', 'immediate', 'remote', 'ryan.oberoi@apexsystems.com', '8974356464');
insert into recruiters values (2, 'Natasha Coleman', 'York Solutions', ST_GeomFromText('POLYGON((-87.906471 43.038902, -95.992775 36.153980, -75.704722 36.076944, -87.906471 43.038902))'), 'Healthcare', 'AWS', 'immediate', 'on-site', 'natasha.coleman@yorksolutions.com', '8974356464');

--Skills Data
insert into skills values(1, 'Alpha User', Array['Java','React','AWS','Database','Architecture']);
insert into skills values(2, 'Omega User', Array['AI', 'Data Science', 'React', 'Node']);
insert into skills values(3, 'Test User', Array['Spring','Spring Boot', 'Kubernetes']);
insert into skills values(4, 'User Test', Array['DevOps','AWS', 'Terraform', 'Kubernetes', 'GCP']);
insert into skills values(5, 'Light Speed', Array['Java','AWS', 'Terraform', 'Angular', 'GCP']);
insert into skills values(6, 'High Voltage', Array['Java','Electrode', 'CICD']);
insert into skills values(7, 'Riddance Of Evil', Array['SAP','EWM', 'ABAP']);
insert into skills values(8, 'Centaurus Wolf', Array['Algorithms','Optimization', 'Java']);
insert into skills values(9, 'Benevolent Saint', Array['Leetcode','Hacker Rank', 'Java']);
insert into skills values(10, 'Java Hermit', Array['Application Architecture','Modernization', 'Data Lakes', 'Big Data']);

--ProfileMatch Data
 insert into profilematch values(1, 'Alpha User', 'My SAP Group', ST_GeomFromText('POINT(40.124140 -89.148630)'), Array['Java', 'AWS', 'Spring', 'Spring Boot', 'Microservices', 'CICD'], DATE '2024-08-05', true, Array['0'], 100.0, '{"recruiters":[{"name":"Redolent","email":"redolent@redolent.com","phone":"9431230606"},{"name":"AmericanAirlines","email":"american@amair.com","phone":"8507642323"}]}','harsha.yvr@gmail.com', '4083486229');

 --Employee
insert into employees values(1, 'Alpha user', 'Backend Developer', 'Mygo Consulting', ST_GeomFromText('POINT(41.748489 -88.186111)'), 500, 'immediate', 'alphauser@yahoo.com', '4056783232');
insert into employees values(1, 'Omega user', 'Frontend Developer', 'Mygo Consulting', ST_GeomFromText('POINT(41.748489 -88.186111)'), 500, 'current', 'omegauser@yahoo.com', '6692243434');
insert into employees values(3, 'Test User', 'Test Engineer', 'XYZ inc', ST_GeomFromText('POINT(37.774929 -122.419418)'), 0, 'current', 'testuser@gmail.com', '7863458282');
insert into employees values(4, 'User Test', 'Quality Assurance', 'XYZ inc', ST_GeomFromText('POINT(34.052235 -118.243683)'), 100, 'immediate', 'usertest@gmail.com', '8256437871');
insert into employees values(5, 'Light Speed', 'Backend Developer', 'Walmart Inc', ST_GeomFromText('POINT(37.338207 -121.886330)'), 0, 'immediate', 'lightspeed@gmail.com', '67583437871');
insert into employees values(6, 'High Voltage', 'Full Stack Developer', 'Mercer Crossing', ST_GeomFromText('POINT(32.776665 -96.796989)'), 0, 'immediate', 'highvoltage@gmail.com', '7893421456');
insert into employees values(7, 'Riddance Of Evil', 'Student/Intern', 'Walmart Inc', ST_GeomFromText('POINT(36.371868 -94.202721)'), 500, 'open-to-work', 'riddanceofevil@yahoo.com', '9867865656');
insert into employees values(8, 'Centaurus Wolf', 'Lead Backend Developer', 'River Bend', ST_GeomFromText('POINT(41.81781 -88.1734)'), 500, 'open-to-work', 'centauruswolf@yahoo.com', '8435672323');
insert into employees values(9, 'Benevolent Saint', 'Lead Backend Developer', 'Wolfram Tech', ST_GeomFromText('POINT(41.801140 -88.074791)'), 500, 'immediate', 'benevolentsaint@gmail.com', '7954371111');
insert into employees values(10, 'Java Hermit', 'Java Architect', 'Wolfram Tech', ST_GeomFromText('POINT(41.698643 -88.068398)'), 0, 'immediate', 'javahermit@gmail.com', '8976754343');