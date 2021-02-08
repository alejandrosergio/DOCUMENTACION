<?php

$connection = mysqli_connect(
  'localhost', 'root', '', 'tasks-app'
);

/* for testing connection */

  if($connection) {
    echo 'database is connected';
  }else{
    echo 'erno connect database';
  }

?>
