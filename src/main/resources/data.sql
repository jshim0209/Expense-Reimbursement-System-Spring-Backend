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
(1700.98, 'Relocation Assistance', 'https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Target_Receipt_5-12-2018.jpg/1200px-Target_Receipt_5-12-2018.jpg', null, '2023-04-24', 2, null, 1, 4),
(234.98, 'Hotel in New York', 'https://c8.alamy.com/comp/CNTYDX/tesco-shopping-receipt-CNTYDX.jpg', '2023-05-04', '2023-04-04', 5, 1, 2, 1),
(145.98, 'Certification', 'https://t3.ftcdn.net/jpg/01/82/01/18/360_F_182011806_mxcDzt9ckBYbGpxAne8o73DbyDHpXOe9.jpg', '2023-05-04', '2023-04-04', 2, 4, 2, 4),
(136.98, 'Train ticket to DC', 'https://www.shutterstock.com/image-vector/realistic-paper-shop-receipt-barcode-260nw-768909406.jpg', null, '2023-04-24', 3, null, 1, 2),
(654.98, 'Dinner with clients', 'https://cdn3.vectorstock.com/i/1000x1000/65/32/paper-cash-sell-receipt-vector-23876532.jpg', '2023-05-04', '2023-04-04', 5, 1, 2, 3),
(43.98, 'Lunch Money', 'https://media-cdn.tripadvisor.com/media/photo-s/0e/54/47/43/receipt.jpg', '2023-05-04', '2023-04-04', 3, 4, 3, 3),
(56.98, 'Programming books', 'https://img.freepik.com/free-vector/realistic-receipt-template_23-2147938550.jpg?w=360', null, '2023-04-24', 2, null, 1, 4);