<%@include file="include/header.jsp"%>
<%@include file="include/sidebar.jsp"%>

<section class="content">
	<div class="container-fluid">
		<div class="block-header">
			<h2>POST YOUR GRIEVANCE HERE</h2>
		</div>

		<!-- Select -->
		<div class="row clearfix">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="card">
					<form action="/" method="post">
						<div class="body">
							<h2 class="card-inside-title">Select Your Grievance Category</h2>
							<div class="row clearfix">
								<div class="col-sm-12">
									<select class="form-control show-tick" required>
										<option value="">-- Please select --</option>
										<option value="10">10</option>
										<option value="20">20</option>
										<option value="30">30</option>
										<option value="40">40</option>
										<option value="50">50</option>
									</select>
								</div>
							</div>
							<h2 class="card-inside-title">Report Your Grievance Here</h2>
							<div class="form-group">
								<div class="form-line">
									<textarea required rows="1"
										class="form-control no-resize auto-growth"
										placeholder="Please type what you want... And please don't forget the ENTER key press multiple times :)"></textarea>
								</div>
							</div>
							<h2 class="card-inside-title">Attach Your Files Here</h2>
							<div class="form-group">

								<!-- <button type="file" class="btn bg-blue waves-effect">
                                    <i class="material-icons">save</i>
                                    <span>ATTACH FILES</span>
                                </button> -->
								
									<input type="file" class="btn btn-primary" value="Attach File">
								

							</div>
							<button type="submit" class="btn btn-danger waves-effect">
								<i class="material-icons">trending_up</i> <span>SUBMIT
									GRIEVANCE</span>
							</button>

						</div>
					</form>
				</div>
			</div>
		</div>
		<!-- #END# Textarea -->




	</div>
</section>
<%@include file="include/form_footer.jsp"%>