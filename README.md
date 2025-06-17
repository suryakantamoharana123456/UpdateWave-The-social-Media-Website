1. User Roles & Authentication
a. Roles: Celebrity & Public
b. Auth via mock login or JWT
c. Add buttons to load dummy user credentials for quick login
2. Celebrity Functionality
a. Create post: Text and optional image
b. View self-posts (pagination or list view)
c. Post timestamps
3. Public User Functionality
a. Browse and follow celebrities
b. See a separate feed of followed celebrities
c. Feed supports infinite scroll- Load more on scroll
4. Real-Time Updates
a. When a celebrity posts:
i. Their followers get notified in real time
ii. Notification badge updates
b. Use Redis Pub/Sub + WebSocket to broadcast updates
5. UI Features
a. Lazy load post images
b. Smooth transitions on scroll
c. Notification tab with badge count
d. Responsive layout (mobile & desktop)
6. Technology - React, Redux Toolkit , MUI, Tailwind CSS, javascript, jwt authentication, mqsql, Spring Boot, Socket, 
