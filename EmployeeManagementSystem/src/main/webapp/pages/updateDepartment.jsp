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
				<div class="clearfix"></div>
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>Add Company</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<br>
								<form action="/ems/wow/updateCompany" method="post"
									class="form-horizontal form-label-left">

									<div class="form-group">
										<label class="control-label col-md-3 col-sm-3 col-xs-12"
											for="first-name">Cid<span class="required">*</span>
										</label>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<input type="text" name="cid" readonly="readonly"
												value="${company.cid}" class="form-control col-md-7 col-xs-12">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-3 col-xs-12"
											for="first-name">Name<span class="required">*</span>
										</label>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<input type="text" name="name" required="required"
												value="${company.name}" class="form-control col-md-7 col-xs-12">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-md-3 col-sm-3 col-xs-12"
											for="last-name">Address<span class="required">*</span>
										</label>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<input type="text" name="address" required="required"
												value="${company.address}" class="form-control col-md-7 col-xs-12">
										</div>
									</div>
									<div class="form-group">
										<label for="middle-name"
											class="control-label col-md-3 col-sm-3 col-xs-12">Phone</label>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<input id="phone"
												class="form-control col-md-7 col-xs-12" type="text" value="${company.phone}"
												required="required" name="phone">
										</div>
									</div>
									<div class="form-group">
										<label for="middle-name"
											class="control-label col-md-3 col-sm-3 col-xs-12">Email</label>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<input type="text" id="email" name="email"
												value="${company.email}" required="required" class="form-control col-md-7 col-xs-12">
										</div>
									</div>
									<div class="form-group">
										<label for="middle-name"
											class="control-label col-md-3 col-sm-3 col-xs-12">Website</label>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<input name="website" class="form-control col-md-7 col-xs-12"
												value="${company.website}" type="text">
										</div>
									</div>
										<div align="center" style="color: green"><strong>${success}</strong></div>
										<div align="center" style="color: red"><strong>${error}</strong></div>
									<div class="ln_solid"></div>
									<div class="form-group">
										<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
											<button class="btn btn-primary" type="reset">Reset</button>
											<button type="submit" class="btn btn-success">Submit</button>
											<a href="/ems/wow/companies" class="btn btn-info">View All</a>
										</div>
									</div>

								</form>
							</div>
						</div>
					</div>
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