const mongoose = require('mongoose');

const Schema = mongoose.Schema;

const detailSchema = new Schema({

    _id: mongoose.Schema.Types.ObjectId,
  
    name: { type: 'string' },
        
   address: { type: 'string' },

   gmail: { type: 'string' },
        
   phone:  { type: 'number' }
   
})

module.exports = mongoose.model('DetailData',detailSchema)