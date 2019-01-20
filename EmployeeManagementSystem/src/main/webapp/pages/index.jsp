<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>EMS</title>

<!-- Bootstrap -->
<link href="/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link href="/vendors/nprogress/nprogress.css" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="/build/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">

			<!-- sidebar menu -->
			<%@ include file="menu/sidemenu.jsp"%>
			<!-- /sidebar menu -->

			<!-- top navigation -->
			<%@ include file="menu/topmenu.jsp"%>
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main">
				<div class="">
					<table class="table table-striped">
						<tr>
							<td><div class="box-header with-border">
									<h3 class="box-title">Masters</h3>
								</div></td>
						</tr>
						<tr>
							<td><a class="btn btn-block btn-social btn-dropbox"
								onclick="Transactions();" data-toggle="modal"
								data-target="#myModal_transaction">Employee</a></td>
							<td><a class="btn btn-block btn-social btn-flickr"
								onclick="member();" data-toggle="modal"
								data-target="#myModal_member">Member</a></td>
							<td><a class="btn btn-block btn-social btn-google"
								onclick="account();" data-toggle="modal"
								data-target="#myModal_account">Account</a></td>
							<td><a class="btn btn-block btn-social btn-facebook"
								onclick="loan();" data-toggle="modal"
								data-target="#myModal_loan">Loan</a></td>
						</tr>

					</table>

				</div>
			</div>
			<!-- /page content -->

			<!-- footer content -->
			<footer>
				<div class="pull-right">
					Employee Management System by <a href="https://www.wingsofware.com">WINGSOFWARE</a>
				</div>
				<div class="clearfix"></div>
			</footer>
			<!-- /footer content -->
		</div>
	</div>

	<!-- TRANSACTION******************************************************************************************-->
	<div class="container">
		<!-- Modal -->
		<div class="modal fade" id="myModal_transaction"
			data-backdrop="static" data-keyboard="false" role="dialog">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Transactions</h4>
					</div>
					<div class="modal-body">
						<section class="content">
							<div class="row">
								<div class="col-xs-12">
									<!-- /.box-header -->
									<div class="box-body" id="ttable">
										<table id="t_transaction" style="width: 100%"
											class="table table-bordered table-striped">
											<thead>
												<tr>
													<th>Emp.ID</th>
													<th>Name</th>
													<th>Phone</th>
													<th>Email</th>
													<th>Aadhaar</th>
													<th>PAN</th>
												</tr>
											</thead>
										</table>
									</div>
								</div>
							</div>
						</section>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ***************************************************************************************************-->

	<!-- jQuery -->
	<script src="/vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="/vendors/fastclick/lib/fastclick.js"></script>
	<!-- NProgress -->
	<script src="/vendors/nprogress/nprogress.js"></script>
	<!-- validator -->
	<script src="/vendors/validator/validator.js"></script>
	<!-- Custom Theme Scripts -->
	<script src="/build/js/custom.min.js"></script>
	<!-- DataTables -->
	<script src="/plugins/datatables/jquery.dataTables.min.js"></script>
	<script src="/plugins/datatables/dataTables.bootstrap.min.js"></script>
	<!-- SlimScroll -->
	<script src="/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<!-- FastClick -->
	<script src="/plugins/fastclick/fastclick.js"></script>
	<!-- AdminLTE App -->
	<script src="/dist/js/app.min.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="/dist/js/demo.js"></script>

</body>
</html>