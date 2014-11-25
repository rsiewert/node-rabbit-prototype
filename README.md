# Nodes-Talking

##Dependencies:
    ant : http://ant.apache.org/bindownload.cgi

##Install/Config:
    clone the repository
    cd <install dir>
    npm install
    cd common
    echo "jdk.home=<your jdk home>" > build.properties

##Run (in common dir):
    ant     // to build the Infrastructure.jar file
    ant run //to populate the database with registration documents
    cd ..
    nodemon server //start the server

##Nodes-Talking System
Nodes-Talking provides all the components needed to set up and maintain a community of Nodes. Nodes can be servers or devices or
extended to be other types. Nodes have protocols and APIs and are self-describing as they register with persistence servers (themselves Nodes).
We envision uses of Nodes-Talking to include setup and adminstration of a system of remote sensors, control devices, logging servers, etc.
The system is flexible enough to be adapted to other uses as well.

A complete Node-Talking system consists of at least three elements, base versions of each provided:

1. A Nodes-Talking server (Nodejs based with a Mongodb implementation of the backend database)
2. Devices that register and provide protocols for communications and published APIs for interaction. (Java based Device Test included)
3. User device to administer or interact with Nodes (Android based user device included)

## Nodes-Talking Technology Base

Node-talking is based on opensource Java, MongoDB (with ability to roll new implementations such as File Based, CouchDB etc), nodejs.  Nodes-talking builds an infrastructure using these technologies to provide the basis for a community of Nodes.

## Contributing

We have a loosely-coupled architecture for Nodes-Talking and encourage  contributions within each of the three main systems (Devices, Servers, User Applications). Get in touch with us. We would love to hear from you!
Current contributors are 4 developers and 2 consultants.


## Copyright and license


Licensed under the **[Apache License, Version 2.0] [license]** (the "License");
you may not use this software except in compliance with the License.

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


