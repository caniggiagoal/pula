<#import "/app/macros/commonBase.ftl" as b><@b.html title="employee.title">
<style>
.t-simple-no input{ width: 100px}
.t-simple-no select{ width:100px}
</style>
  <div class="top" id="__top"> </div>
<div class="body">
    <!-- condition -->
    <#include "condition.ftl"/>
    <!-- listview -->
    <div class="l forList" id="listview">
      <form id="batchForm">
        <div id="dt"> </div>
      </form>
      <!-- left ends --> 
    </div>

	<!-- edit form -->
	<div id="inputPanel" class="l h">
	
	</div>
  </div>


<!-- others -->
<#include "/calendar.ftl"/>
<link rel="stylesheet" type="text/css" href="${base}/static/app/css/t-style.css"></link>
<script type="text/javascript" src="${base}/static/library/puerta/t-table.js"></script> 
<script type="text/javascript" src="${base}/static/app/javascript/chargeback.js"></script>
<script type="text/javascript" src="${base}/static/library/mootools/modules/mbox/mt.mbox.js"></script>
<script type="text/javascript" src="${base}/static/library/puerta/t-simple-no.js"></script>
<script type="text/javascript">

var pageVars = {
	queryString:'',
	action : '_create',
	id :'',
	base :'${base}'
}

var pageConsts= {
	PS_PREPAY : 2 ,
	S_INPUT : 1
}
var lang = {
	name:'名称',no:'编号',domain:'退单管理',gender:'性别',status:'状态',print:'打印条码',printOK:'选中项已成功输出打印',file:'档案'
	,view:'查看',birthday:'生日',branchName:'所在分支机构',assign:'指派',levelName:'级别',barcode:'卡号',tipsOfTSN:'输入名称加载'
}

	function checkAssign(){
		if(isEmpty($F("branchId"))){
			alert("请选取分支机构");
			$("branchId").focus();
			return false;
		}

		return true ;
	}

	function check(){
		

		
		return true ;
	}
</script>
</@b.html>