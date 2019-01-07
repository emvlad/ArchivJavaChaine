
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
 
 //video 11 of 22: hid_prop,limit,skip,sort document
 //hide IDprop and limite the number of data to display
 db.students.find({},{"name":1, "age":1,"_id":0}) //no limit 
 
 db.students.find({},{"name":1, "age":1,"_id":0}).limit(3)//limited
  
  db.students.find({},{"name":1, "age":1,"_id":0}).skip(6)//skip the first (6) documents to display
   
   db.students.find({},{"name":1, "age":1,"_id":0}).skip(6).limit(2)//skip and show the first 2 document skept.
   
   db.students.find({},{"name":1, "age":1,"_id":0}).sort({"name":1}) //ascending order
   
    db.students.find({},{"name":1, "age":1,"_id":0}).sort({"name":-1}) //descending order
 
 
//video 12 of 22: create and remove index
use stamps
db.createCollection("posts")
//there are 10000 stmpiD document with label_liberty to insert:
for(i=1; i<10000;i++){
	db.posts.insert({"stamp_id":i, "label": "liberty"})
}
//how long it takes
db.posts.find({"stamp_id":1000})

//how long it takes
db.posts.findOne({"stamp_id":1000})
//create index_id for efficiency
db.posts.ensureIndex({"stamp_id":1})
//remove index_id for effisciency
db.posts.dropIndex({"stamp_id":1})

//video 13 of 22: Perform Aggregation function

use school 
db.createCollection("members")
db.members.insert([
			{
				"memb_id":"1"
				"name":"Jean",
			"gender":"male",
			   "age": "39"},
			   
			   { "memb_id":"2"
				"name":"Lyna",
			"gender":"female",
			   "age": "49"},
			   
			   { "memb_id":"3"
				"name":"Myrlene",
			"gender":"female",
			   "age": "29"},
			   
			   { "memb_id":"4"
				"name":"Rico",
			"gender":"male",
			   "age": "19"},
			     { "memb_id":"4"
				"name":"Herlo",
			"gender":"male",
			   "age": "26"}
			])
db.members.find()//verify collection
//create aggregat $sum : $group _id:target, report $sum of male and female members.
 db.members.aggregate([{$group:{_id:"$gender", Report:{$sum:1}}}])
