<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   <link rel="stylesheet" href="index.css">
</head>
<body>
    <!-- <h1>Name: ${details.name} <br>Age: ${details.age} <br>Address: ${details.address}</h1> -->
    <h1>Inser User Details</h1>
   <form action="addUser" method="get">
    <label for="">Id</label>
    <input type="text" name="id" ><br>
    <label for="">Name</label>
    <input type="text" name="name" ><br>
    <label for="">Age</label>
    <input type="text" name="age"><br>
    <label for="">Address</label>
    <input type="text" name="address" id=""><br>
    <input type="submit" name="" id="">
   </form>
   <h1>Show User Details</h1>
   <form action="getUser" method="get">
    <label for="">Id</label>
    <input type="text" name="id" ><br>
    <input type="submit" name="" id="">
   </form>
   <h1>Delete User Details</h1>
   <form action="deleteUser" method="get">
    <label for="">Id</label>
    <input type="text" name="id" ><br>
    <input type="submit" name="" id="">
   </form>
   <h1>Update User Details</h1>
   <form action="updateUser" method="get">
    <label for="">Id</label>
    <input type="text" name="id" ><br>
    <input type="submit" name="" id="">
   </form>
</body>
</html>