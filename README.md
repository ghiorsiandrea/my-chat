
<div align="middle">

<h1>I will introduce you to "my-chat"</h1>
</div>

<br>
<br>

<div align="middle">
<img src="assets/java.png" height="100" width="120">
<img src="assets/sockets.jpg" height="100" width="120"/>
</div>
<br>
<br>

`A chat application that works with Client - Server architecture in a multimodule project`

<br>

Client> Application that makes requests to the server.

In this case, it implies the request to communicate using MyChat
with another Client through the Server.

<br>

Server> A program that receives a request, performs the required
service, and returns the results in the form of a response.

<br>

###                   MYCHAT-CLIENT IS   THIS IS THE CLIENT'S APP

<br>

`Follow the steps below to be able to run the application on your PC`

1) Clone the modules

2) In terminal type "export PORT = (the desired port)

3) Run the command mvn clean package

4) Run first the command "java -jar ./server/target/server-1.0-SNAPSHOT-jar-with-dependencies.jar"

5) Next run "java -jar ./client/target/client-1.0-SNAPSHOT-jar-with-dependencies.jar"

<br>

MyChat was based on reading the YouTube Java course "Computer Pills",
however, you will appreciate that I have made several modifications
in order to make it more efficient (for example, in the reuse of
sockets), as well as I have applied various knowledge acquired for
the purpose of improving the user experience.
<br>
<div align="middle">
<img src="assets/javacourse.png" height="100" width="120"/>
</div>
<br>

