<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>site-work-Order</title>

    <!-- Bootstrap Core CSS -->
       
       <link href="css/jquery.dataTables.css" rel="stylesheet">
       <link href="css/bootstrap.min.css" rel="stylesheet">
       
    <!-- Custom CSS -->
 
 
 <!-- jQuery Version 1.11.1 -->
  
     <script src="js/jquery.js"></script>
     <script src="js/jquery-1.11.1.min.js"></script> 
     <script src="js/jquery.dataTables.min.js"></script> 
     
     <!-- Bootstrap Core JavaScript -->
     <script src="js/bootstrap.min.js"></script>
     
 
 <!-- jQuery Version 1.11.1 -->
 
    <style>
    body {
        padding-top: 70px;
        /* Required padding for .navbar-fixed-top. Remove if using .navbar-static-top. Change if height of navigation changes. */
    }
    </style>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Site-WorkOrder</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">About</a>
                    </li>
                    <li>
                        <a href="#">Services</a>
                    </li>
                    <li>
                        <a href="#">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">
    
   <table id="example" class="display" cellspacing="0" width="100%">
        <thead>
            <tr>
               <th>Site ID</th>
                <th>Classification</th>
                <th>Lat</th>     
                <th>Lon </th>
                <th>Bts</th>
                <th>Type</th>
                <th>Filtre</th>                     
                <th>Az1</th>
                <th>Ht1</th>
                <th>Hs1</th>
                <th>A1</th>
                <th>Et1 </th>
                <th>Mt1</th>
                <th>M1</th>                
                <th>Az2</th>
                <th>Ht2</th>
                <th>Hs2</th>
                <th>A2</th>
                <th>Et2</th>
                <th>Mt2</th>
                <th>M2</th>                
                <th>Az3</th>
                <th>Ht3</th>
                <th>Hs3</th>
                <th>A3</th>
                <th>Et3</th>
                <th>Mt3</th>
                <th>M3</th>               
                <th>Pylone</th>
                <th>Mast</th>
                <th>Et1800</th>
                <th>Feeder900</th>
                <th>Feeder1800</th>                           
                            
            </tr>
        </thead>
 
        <tfoot>
            <tr>
                <th>Site ID</th>
                <th>Classification</th>
                <th>Lat</th>              
                <th>Lon </th>
                <th>Bts</th>
                <th>Type</th>
                <th>Filtre</th>                     
                <th>Az1</th>
                <th>Ht1</th>
                <th>Hs1</th>
                <th>A1</th>
                <th>Et1 </th>
                <th>Mt1</th>
                <th>M1</th>                
                <th>Az2</th>
                <th>Ht2</th>
                <th>Hs2</th>
                <th>A2</th>
                <th>Et2</th>
                <th>Mt2</th>
                <th>M2</th>                
                <th>Az3</th>
                <th>Ht3</th>
                <th>Hs3</th>
                <th>A3</th>
                <th>Et3</th>
                <th>Mt3</th>
                <th>M3</th>               
                <th>Pylone</th>
                <th>Mast</th>
                <th>Et1800</th>
                <th>Feeder900</th>
                <th>Feeder1800</th>                           
 
            </tr>
        </tfoot>
    </table>
    
    <!--  data/arrays.txt  -->
    
    <script type="text/javascript">
        
       
    $(document).ready(function() {
    	
        $('#example').dataTable( {
            "ajax": "http://localhost:8080/site-workOrder/ManageSite",
            "columns": [
                
                { "data": "SiteID" },
                { "data": "Classification" },
                { "data": "Lat"},
                { "data": "Lon"},
                { "data": "Bts"},
                { "data": "Type"},
                { "data": "Filtre"},                
                { "data": "Az1"},
                { "data": "Ht1"},
                { "data": "Hs1"},
                { "data": "A1"},
                { "data": "Et1"},
                { "data": "Mt1"},
                { "data": "M1"},                
                { "data": "Az2"},
                { "data": "Ht2"},
                { "data": "Hs2"},
                { "data": "A2"},
                { "data": "Et2"},
                { "data": "Mt2"},
                { "data": "M2"},                
                { "data": "Az3"},
                { "data": "Ht3"},
                { "data": "Hs3"},
                { "data": "A3"},
                { "data": "Et3"},
                { "data": "Mt3"},
                { "data": "M3"},               
                { "data": "Pylone"},
                { "data": "Mast"},
                { "data": "Et1800"},
                { "data": "Feeder900"},
                { "data": "Feeder1800"}
            ],
        
        } );
    } );
    </script>

        
    </div>
    <!-- /.container -->


    
</body>

</html>
