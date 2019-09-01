const express = require("express");
var mongoose =require('mongoose');
var bodyParser = require('body-parser');
const app=express();
// const assert = require('assert');
const fetch = require('node-fetch');
const fs=require("fs");




	const detailData = require('./model/detail')

	app.use(bodyParser.urlencoded({extended : false}));
	app.use(bodyParser.json());

	//connecting mongodb

	mongoose.Promise=global.Promise;
	mongoose.connect('mongodb://localhost:27017/testdb',function(err,db){

		if(err){
			console.log("error:"+err)
		}
		
		console.log("Connected successfully to server");

	})

	//insert data using post method
	app.post('/detail/info',(req,res,next)=>{
	
	const data= new detailData({
		_id : new mongoose.Types.ObjectId,
		name : req.body.name,
		address : req.body.address,
		gmail : req.body.gmail,
		phone : req.body.phone,
			
	})
	data.save().then(result =>{
		console.log(result);
	})
	.catch (err => console.log(err));

	
	})

	//get data from mongodb

	app.get('/data',(error, res, body)=>{
	detailData.find()
	.then(docs =>{
		// console.log(docs);
		res.status(200).json(docs);

	})
	.catch(err =>{
		console.log(err);
		});
	})


		// 	const MongoClient = require('mongodb').MongoClient;
		// 	const assert = require('assert');
			 
		
		// 	const url = 'mongodb://localhost:27017';
			 
			
		// 	const dbName = 'myproject';
			 
		
		// 	MongoClient.connect(url, function(err, client) {
		// 	  assert.equal(null, err);

		// 	  console.log("error:"+err)
		// 	  console.log("Connected successfully to server");
			 
		// 	  const db = client.db(dbName);

			

		// 	  		var myobj = { name: "Ajeet Kumar", age: "28", address: "Delhi" }  
		// 			db.collection("employees").insertOne(myobj, function(err, res) {  
		// 				if (err) throw err;  
		// 				console.log("1 record inserted"); 

		// 			})

		// 			db.collection("employees").findOne({},function(err,result){

		// 				if (err) throw err;
		// 				    console.log(result);
		// 			});

						
			 
		// 	  client.close();
		// });

//read file 
	
// function readJSON(){
//   fs.readFile(__dirname+"/file.txt", 'utf8', function (err, data){
  	
//   		console.log(err);	

//   		var x = new Promise((res,rej)=>{
//   			 setTimeout(()=>{
//   			 	res(console.log(data));
//   			 },2000)
//   		})
//   		x.catch(function(error) {
//   				console.log("" +error);
// 		});

//   })
    
// }
// var x=new readJSON();

//count url word in nodejs

	// fetch('https://www.google.com/')
	//     .then(function(res) {
	//         return res.text();
	//     }).then(function(body) {
	       
	//    		var count = body.split(' ').length;

	//    		console.log("URL total word count = "+count)

	//     });


app.get('/',(req,res)=>{
	res.send("Welcome page");
})

app.listen(3000,()=>{
	console.log("Server is running 3000")
})