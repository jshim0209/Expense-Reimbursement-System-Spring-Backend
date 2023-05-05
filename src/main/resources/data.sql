INSERT INTO user_table (first_name, last_name, email, username, password, is_manager)
VALUES ('Jiwon', 'Shim', 'jshim@email.com', 'jshim', 'jiwon1234', true),
('Jason', 'Vonortas', 'jvonortas@email.com', 'jvonortas', 'jason1234', false),
('Joe', 'Cho', 'jcho@email.com', 'jcho', 'joe1234', false),
('Andy', 'Choi', 'achoi@email.com', 'achoi', 'andy1234', true),
('Minah', 'Kim', 'mkim@email.com', 'mkim', 'minah1234', false);

INSERT INTO type (type)
VALUES ('Lodging'),
('Travel'),
('Food'),
('Other');

INSERT INTO status (status)
VALUES ('Pending'),
('Approved'),
('Rejected');

INSERT INTO reimbursements (amount, description, receipt, time_resolved, time_submitted, author_id, resolver_id, status_id, type_id)
VALUES
(1700.98, 'Relocation Assistance', 'assets/images/receipts/receipt1.jpg', null, '2023-04-24', 2, null, 1, 4),
(234.98, 'Hotel in New York', 'assets/images/receipts/receipt1.jpg', '2023-05-04', '2023-04-04', 5, 1, 2, 1),
(145.98, 'Certification', 'assets/images/receipts/receipt1.jpg', '2023-05-04', '2023-04-04', 2, 4, 2, 4),
(136.98, 'Train ticket to DC', 'assets/images/receipts/receipt1.jpg', null, '2023-04-24', 3, null, 1, 2),
(654.98, 'Dinner with clients', 'assets/images/receipts/receipt1.jpg', '2023-05-04', '2023-04-04', 5, 1, 2, 3),
(43.98, 'Lunch Money', 'assets/images/receipts/receipt1.jpg', '2023-05-04', '2023-04-04', 3, 4, 3, 3),
(56.98, 'Programming books', 'assets/images/receipts/receipt1.jpg', null, '2023-04-24', 2, null, 1, 4);