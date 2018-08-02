## The project is a demonstration of Rest API using Springbot 2 and JPA using in memory database.
## Run Main class UserEntityManagerCommandLineRunner as springboot app, initially class is adding a user
## CRUD operations are exposed.
##TO add user below is the request body example as POST

{
   
    "name": "abbas",
    "role": "admin"
}

## Update for same , the request body will be below if Primary key is 2 

{
    "id": 2
    "name": "abbas",
    "role": "admin"
}

##In memory backend is used record exists till app is running
##MySelf used POSTMAN plugin to test the app