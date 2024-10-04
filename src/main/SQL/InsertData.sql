--Recruiters Data
insert into recruiters values (1, 'Ryan Oberoi', 'Apex Systems', ST_GeomFromText('POLYGON((-114.897263 36.039836, -122.4162978 37.708798, -121.939784 37.30325, -118.302486 34.022413, -116.97866 32.744394, -114.897263 36.039836))'), 'Bio Technology', 'Java', 'immediate', 'remote', 'ryan.oberoi@apexsystems.com', '8974356464');
insert into recruiters values (2, 'Natasha Coleman', 'York Solutions', ST_GeomFromText('POLYGON((-87.906471 43.038902, -95.992775 36.153980, -75.704722 36.076944, -87.906471 43.038902))'), 'Healthcare', 'AWS', 'immediate', 'on-site', 'natasha.coleman@yorksolutions.com', '8974356464');

--Skills Data
insert into skills values(1, 'Harshavardhan Reddy Yeruva', Array['Java','React','AWS','Database','Architecture']);
insert into skills values(2, 'Vishnu Vardhan Reddy Yeruva', Array['AI', 'Data Science', 'React', 'Node']);
insert into skills values(3, 'Test User', Array['Spring','Spring Boot', 'Kubernetes']);
insert into skills values(4, 'User Test', Array['DevOps','AWS', 'Terraform', 'Kubernetes', 'GCP']);
insert into skills values(5, 'Light Speed', Array['Java','AWS', 'Terraform', 'Angular', 'GCP']);
insert into skills values(6, 'High Voltage', Array['Java','Electrode', 'CICD']);
insert into skills values(7, 'Riddance Of Evil', Array['SAP','EWM', 'ABAP']);
insert into skills values(8, 'Centaurus Wolf', Array['Algorithms','Optimization', 'Java']);
insert into skills values(9, 'Benevolent Saint', Array['Leetcode','Hacker Rank', 'Java']);
insert into skills values(10, 'Java Hermit', Array['Application Architecture','Modernization', 'Data Lakes', 'Big Data']);

--ProfileMatch Data
 insert into employee_new values(1, 'Harshavardhan Reddy Yeruva', 'My SAP Group', ST_GeomFromText('POINT(40.124140 -89.148630)'), Array['Java', 'AWS', 'Spring', 'Spring Boot', 'Microservices', 'CICD'], DATE '2024-08-05', true, Array['0'], 100.0, '{"recruiters":[{"name":"Redolent","email":"redolent@redolent.com","phone":"9431230606"},{"name":"AmericanAirlines","email":"american@amair.com","phone":"8507642323"}]}','harsha.yvr@gmail.com', '4083486229');
