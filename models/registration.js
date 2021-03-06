/**
______           _     _             _   _
 /$$$$$$$                      /$$             /$$                          /$$     /$$
| $$__  $$                    |__/            | $$                         | $$    |__/
| $$  \ $$  /$$$$$$   /$$$$$$  /$$  /$$$$$$$ /$$$$$$    /$$$$$$  /$$$$$$  /$$$$$$   /$$  /$$$$$$  /$$$$$$$
| $$$$$$$/ /$$__  $$ /$$__  $$| $$ /$$_____/|_  $$_/   /$$__  $$|____  $$|_  $$_/  | $$ /$$__  $$| $$__  $$
| $$__  $$| $$$$$$$$| $$  \ $$| $$|  $$$$$$   | $$    | $$  \__/ /$$$$$$$  | $$    | $$| $$  \ $$| $$  \ $$
| $$  \ $$| $$_____/| $$  | $$| $$ \____  $$  | $$ /$$| $$      /$$__  $$  | $$ /$$| $$| $$  | $$| $$  | $$
| $$  | $$|  $$$$$$$|  $$$$$$$| $$ /$$$$$$$/  |  $$$$/| $$     |  $$$$$$$  |  $$$$/| $$|  $$$$$$/| $$  | $$
|__/  |__/ \_______/ \____  $$|__/|_______/    \___/  |__/      \_______/   \___/  |__/ \______/ |__/  |__/
                     /$$  \ $$
                    |  $$$$$$/
                     \______/

 **/


var mongoose = require('mongoose')
, Schema = mongoose.Schema
, ObjectId = Schema.ObjectId


var RegistrationSchema = new Schema ({
    "title" : String,
    "description" : String,
    "domainType" : String,
    "data": {
        "message": {
            "node": {
                "actsAs": String,  //this I think can be used as: ['Server','Device'] etc...
                "nodeId": String, //generated using node-uuid
                "location": {
                    "latitude": Number,
                    "longitude": Number,
                    "altitude": Number
                },
                "api": {
               		"getLocation": {
               			"name": {type:String,required: false,default:"name"},
               			"description": {type:String,required: false,default:"description"},
               			"parameters": {},
               			"returns": {}
               		},
               		"getStatus": {
               			"name": {type:String,required: false,default:"name"},
               			"description": {type:String,required: false,default:"description"},
               			"parameters": {},
               			"returns": {}
               		},
               		"setLocation": {
               			"name":         {type:String,required: false,default:"name"},
               			"description":  {type:String,required: false,default:"Description"},
               			"parameters": {
                            "latitude":{type:String,required: false,default:'33.2'},
               				"longitude":{type:String,required: false,default:'110.3'},
                            "altitude":{type:String,required: false,default:'10.2'}
               			},
               			"returns": {}
               		},
               		"setStatus": {
               			"name": String,
               			"description": String,
               			"parameters": {
               				"status": String
               			},
               			"returns": {}
               		}
               	},
                "status": String,
                "protocol": {
                    "rest": {
                        "Mirror": {
                            "domain": String,
                            "port": Number,
                            "endpoint": String
                        }
                    },
                    "messenger": {
                        "on_publish": {
                            "exchange": String,
                            "routing_key": String,
                            "manageExchange": Boolean
                        },
                        "heartbeat": {
                            "exchange": String,
                            "routing_key": String,
                            "manageExchange": Boolean
                        },
                        "on_ack": {
                            "exchange": String,
                            "routing_key": String,
                            "manageExchange": Boolean
                        },
                        "command_server": {
                            "exchange": String,
                            "routing_key": String,
                            "manageExchange": Boolean
                        }
                    }
                },
                "description": String
            },
            "originTimestamp": Date,
            "seqId": Number,
            "requestAck": Boolean,
            "timestamp": Date,
            "updated": Date
        }
    }
})

module.exports = mongoose.model('Registration',RegistrationSchema)