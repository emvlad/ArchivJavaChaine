
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
db.students.find({ $or :[{"name":"Vic"}, {"age":"43"}]}) //,or condition

db.students.find({"name":"Karen", $or :[{"age":"19"}, {"age":"43"}]}) //,and $or same1,same2

//video 8
db.students.update({ "_id" : ObjectId("5c324a056deff29af8632ebc")},
{$set:{"name":"Karena"}) //modify one document
db.students.find()//verify the update

db.students.update(
{"age" :"43"},
{$set:{"name":"HernFamily"}},
{multi:true}
)  //modify multiple document
db.students.find()//verify the update

//using save function to update or modify
db.students.save(
	{ 
		"_id" : ObjectId("5c324a056deff29af8632ebc"), 
		"name" : "Karena", 
		"age" : "18"
	}
 )
//add document with save functiondb.students.save(
db.students.save(
	{ 
		"_id" : ObjectId("5c324a056deff29af8632eb3"), 
		"name" : "Karenata", 
		"age" : "18"
	}
 )
 
 //video 9 of 22
 //handle with care 'remove()' document - make condition
 
 db.students.remove({"_id" : ObjectId("5c324a056deff29af8632eb3")})
 //verify
 db.students.find({ "name" :"Karenata"})
  db.students.remove({"age" : "43"}, 1) //remove the first one with that criteria
  
  //video 10
  //Projection->find({}, {key:true}) //key or props to be seen truthy.
  //select only necessary data but the whole data 
 
 db.students.find({},{"name":1})//display all value for the props-key
 
 //video 11
 

