<%-- 
    Document   : navbar
    Created on : 28/09/2018, 13:09:24
    Author     : Gus
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Import Google Icon Font-->
         <link href='https://fonts.googleapis.com/icon?family=Material+Icons' rel='stylesheet'>

        <link rel='stylesheet' type='text/css' href='../resources/bootstrap/css/bootstrap.min.css'>
        <link rel='stylesheet' type='text/css' href='../resources/css/custom.css'>
        <link rel='stylesheet' type='text/css' href='../resources/css/jquery.dataTables.min.css'>
        <link rel='stylesheet' type='text/css' href='../resources/css/select2.min.css'>
        <link rel='stylesheet' type='text/css' href='../resources/css/select2.min.css'>

        <title>Blu - Vitality</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg fixed-top double-nav navbar-white bg-white scrolling-navbar" style="">
            <div class="">
                <a href="#slide-out" data-activates="slide-out" class="button-collapse">
                    <i class="fa fa-bars"></i>
                </a>
            </div>

            <!-- Breadcrumb-->
            <div class="breadcrumb-dn mr-auto">
                <img class="mr-3" src="../resources/images/logo.gif" alt="" width="90" height="48">
            </div>

            <!-- Links -->
            <ul class="nav navbar-nav navbar-dark bg-dar nav-flex-icons ml-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle waves-effect waves-light" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fa fa-user"></i>
                        <span class="clearfix d-none d-sm-inline-block text-dark">Account</span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                        <a class="dropdown-item waves-effect waves-light" href="#">Action</a>
                        <a class="dropdown-item waves-effect waves-light" href="#">Another action</a>
                        <a class="dropdown-item waves-effect waves-light" href="#">Something else here</a>
                    </div>
                </li>
            </ul>
        </nav>
