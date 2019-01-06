
/*
set evironnement variable:
Control Panel\System and Security\System
->advanced system properties->environnement variables
=================Start Coinnection=======================
C:\Users\Emchris>cd c:\Program Files (x86)\MongoDB\bin
as admin-->mongod.exe
C:\Users\Emchris>cd c:\Program Files (x86)\MongoDB\bin
as admin-->mongo.exe
================== Start GUI=======================
-->Studio 3T <==
name your new connection
Save
connect
IntelliShell
*/
//database ->Collections->Documents

//create database
use school //create database if not exists or use it
//1-run db to list current database
//2-show dbs to list all databases that content documents inserted.
//3-create collection - refresh connection
db.createCollection("teachers")
db.createCollection("students")
show collections

//delete a collection or a current database 
db.students.drop()
db.teachers.drop()
db.dropDatabase()

//add one document
db.teachers.insert({"name":"Corrine", "age": "35"})
db.students.insert({"name":"Karen", "age": "19"})

//add multi documents with array-json
db.students.insert([
			{"name":"Jean",
			   "age": "39"},
			{"name":"Marly",
			   "age": "23"}])


db.students.find()

db.students.insert([
{"name":"Junior", "age": "18"},
{"name":"Vic", "age": "26"}])

//viwe like json-array with pretty()
db.students.find().pretty()

db.students.findOne() //the first record or document

db.students.find({"name":"Junior"})//criteria name

//criteria agrégat
db.students.find({"age":{$gt: "50"}}) //greater than

db.students.find({"age":{$lt: "50"}})//less than

db.students.find({"age":{$lte: "20"}})//less than or equal

db.students.find({"age":{$ne: "18"}}).pretty()//not equal
//next: video 7

db.students.find({"age":"19", "name":"Karen"})// ,and condition
db.students.find({ $or :[{"name":"Karen"}, {"age":"19"}]}) //,or condition






