# EventLogger
**RESTful application for Even Logger**

RESTful API provides an ability to see and modify events of application logs.

**Tech Stack**

JDK 22, MyBatis, Docker

**Build**

Preprequisite: Java JDK 22

**Run**

docker build --

**SERVER**

localhost:9090

**Sample flow**

See all events:

GET: http://localhost:9090/events/all

Update event:

PUT: http://localhost:9090/events/update/1

Delete event:

DELETE: http://localhost:9090/events/delete/1



