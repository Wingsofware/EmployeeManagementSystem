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

<title>Department List</title>

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

<!-- Datatables -->
<link href="/vendors/datatables.net-bs/css/dataTables.bootstrap.min.css"
	rel="stylesheet">
<link
	href="/vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css"
	rel="stylesheet">
<link
	href="/vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css"
	rel="stylesheet">
<link
	href="/vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css"
	rel="stylesheet">
<link
	href="/vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css"
	rel="stylesheet">
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
			<div class="right_col" role="main" style="min-height: 914px;">
				<div class="clearfix"></div>

				<div class="row">
					<div class="col-md-12">
						<div class="x_panel">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										Department Details <small>Users</small>
									</h2>

									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<table id="departmentTable"
										class="table table-striped jambo_table bulk_action"
										role="grid" aria-describedby="datatable-buttons_info">
										<thead>
											<tr>
												<td>Id</td>
												<td>Name</td>
												<td width="20%">Action</td>
											</tr>
										</thead>


										<tbody>

										</tbody>
									</table>
								</div>
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
	<!-- Datatables -->
	<script src="/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
    <script src="/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
    <script src="/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
    <script src="/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
    <script src="/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
    <script src="/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
    <script src="/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
    <script src="/vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
    <script src="/vendors/jszip/dist/jszip.min.js"></script>
    <script src="/vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="/vendors/pdfmake/build/vfs_fonts.js"></script>
	<script>
		$(document).ready(function() {

			var table = $('#departmentTable').DataTable({
				"sAjaxSource" : "/ems/rest/user/getDepartmentsByCompany",
				"sAjaxDataProp" : "",
				"order" : [ [ 0, "asc" ] ],
				"aoColumns" : [
						{
							"mData" : "did"
						},
						{
							"mData" : "name"
						},
						{
							"defaultContent" : "<View class='btn btn-primary btn-xs'><i class='fa fa-folder'></i>View</View>"
									+ "<Edit class='btn btn-info btn-xs'><i class='fa fa-pencil'></i>Edit</Edit>"
									+ "<Delete class='btn btn-danger btn-xs'><i class='fa fa-trash-o'></i>Delete</Delete>"
						} ],
	
				"dom" : "Bfrtip",
				"buttons" : [
		            {
		                extend: 'copyHtml5',
		                exportOptions: {
		                	columns: [ 0, 1, 2, 3, 4 ]
		                }
		            },
		            {
		                extend: 'excelHtml5',
		                exportOptions: {
		                	columns: [ 0, 1, 2, 3, 4 ]
		                }
		            },
		            {
		                extend: 'pdfHtml5',
		                exportOptions: {
		                	columns: [ 0, 1, 2, 3, 4 ]
		                }
		            },
		            {
		                extend: 'print',
		                exportOptions: {
		                	columns: [ 0, 1, 2, 3, 4 ]
		                }
		            }]
				});
			$('#departmentTable tbody').on('click','View',function() {
						var data = table.row($(this).parents('tr')).data();
						window.location.replace("/ems/user/companies");
			});
			$('#departmentTable tbody').on('click','Edit',function() {
				var data = table.row($(this).parents('tr')).data();
				window.location.replace("/ems/user/getDepartment/"+data.cid);
			});
			$('#departmentTable tbody').on('click','Delete',function() {
				var data = table.row($(this).parents('tr')).data();
				var r=confirm("Are you sure? Do you want to delete "+data.name);
				if(r==true)
				{
					window.location.replace("/ems/user/deleteDepartment/"+data.did);
				}
			});
			
		});
	</script>
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