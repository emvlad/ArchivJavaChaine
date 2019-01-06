
/*
=================Start Coinnection=======================
C:\Users\Emchris>cd c:\Program Files (x86)\MongoDB\bin
-->mongod.exe
C:\Users\Emchris>cd c:\Program Files (x86)\MongoDB\bin
-->mongo.exe
================== Start GUI=======================
-->Studio 3T <==
name your new connection
Save
connect
IntelliShell
*/

use school //create if not exists or use it
db.createCollection("students")
show collections

db.students.drop()


db.students.insert({"name":"Karen", "age": "19"})

db.students.insert([
			{"name":"Jean",
			   "age": "39"},
			{"name":"Marly",
			   "age": "23"}])


db.students.find()

db.students.insert([
{"name":"Junior", "age": "18"},
{"name":"Vic", "age": "26"}])


db.students.find().pretty()

db.students.findOne()

db.students.find({"name":"Junior"})

db.students.find({"age":{$gt: "50"}})

db.students.find({"age":{$lt: "50"}})

db.students.find({"age":{$lte: "20"}})

db.students.find({"age":{$ne: "18"}}).pretty()
//next: video 7




