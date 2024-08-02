# EventLogger
**RESTful application for Even Logger**

RESTful API provides an ability to see and modify events of application logs.

**Tech Stack**

JDK 21, MyBatis, Docker

**Build**

Preprequisite: Java JDK 21

**Run**

docker build --

**SERVER**

localhost:8080

**Sample flow**

See all events:

GET: http://localhost:8080/events/all

Update event:

PUT: http://localhost:8080/events/update/1

Delete event:

DELETE: http://localhost:8080/events/delete/1



