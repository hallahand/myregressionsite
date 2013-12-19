
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object logInfo extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[String],Long,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(text: List[String], runID: Long = -1):play.api.templates.Html = {
        _display_ {
def /*6.2*/log/*6.5*/(logInfo:String) = {{
    
def replace = logInfo.replaceAll(_, _)

var logInfoFixed=replace("INFO:","<br/><font color=\"green\">INFO:</font>") replace("ERROR:","<br/><font color=\"red\">ERROR:</font>")

    //Output
    logInfoFixed
    
}};def /*19.2*/promptBug/*19.11*/(bug: Bug, index: Int) = {{
	var id : String = "addBugNum_" + index
	var funcName = "submitBugNum" + index
    var jscript : String = """<script>
	function """+funcName+"""(){
		$('#"""+id+"""').submit(function (){
			var formdata = $(this).serialize();
				$.ajax({
					type: "POST",
					url: jsRoutes.controllers.Application.addBugNum().url,
					data: formdata,
					success: function(data){
						alert('Submitted');
					}
				});
			document.getElementById(""""+id+"""").style.visibility = "hidden";
			return false;
		});
	}
	</script>"""
	
	var form : String = """<form id=""""+id+"""" name=""""+id+"""" method="POST">
	<fieldset>
	<div class="clearfix ">
		<label for="bugNum">Bug Number for difference: <b>"""+bug.difference.name+"""</b></label>
		<div class="input">
			<input type="text" id="number" name="number" value="" required pattern="\d*">
			<span class="help-inline">Required (Numbers only)</span>
		</div>
			<input type="hidden" id="id" name="id" value=""""+bug.id+"""">
		</div>
	</fieldset>

		<div class="actions">
			<input type="submit" value="Save this Bug Number" class="btn primary" onclick="return """+funcName+"""()">
	</div>

</form>"""
    
	Html(jscript+" \n "+form)
}};def /*63.2*/promptDifference/*63.18*/(difference: Difference, index: Int, files: String) = {{
	var id : String = "addDiffDesc_" + index
	var funcName = "submitDiffDesc" + index
    var jscript : String = """<script>
	function """+funcName+"""(){
		$('#"""+id+"""').submit(function (){
			var formdata = $(this).serialize();
			$.ajax({
				type: "POST",
				url: jsRoutes.controllers.Application.addDiffDesc().url,
				data: formdata,
				success: function(data){
					alert('Submitted');
				}
			});
			document.getElementById(""""+id+"""").style.visibility = "hidden";
			return false;
		});
	}
	</script>"""
	
	var form : String = """<form id=""""+id+"""" name=""""+id+"""" method="POST">
	<fieldset>
	<div class="clearfix ">
		<label for="DiffDesc">Please describe the difference that occureed in these files: <b>"""+files+"""</b></label>
		<div class="input">
			<input type="text" id="name" name="name" value="" required pattern="(\w|\s|\.|-)+">
			<span class="help-inline">Required (only word characters)</span>
		</div>
			<input type="hidden" id="id" name="id" value=""""+difference.id+"""">
		</div>
	</fieldset>

		<div class="actions">
			<input type="submit" value="Save this Difference" class="btn primary" onclick="return """+funcName+"""()">
	</div>

</form>"""
    
	Html(jscript+" \n "+form)
}};
Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*5.30*/("""
"""),format.raw/*15.2*/("""
"""),format.raw/*18.39*/("""
"""),format.raw/*59.2*/("""
"""),format.raw/*62.37*/("""
"""),format.raw/*103.2*/("""

"""),_display_(Seq[Any](/*105.2*/homeSkeleton/*105.14*/ {_display_(Seq[Any](format.raw/*105.16*/("""
	<script type="text/javascript" src="/assets/javascripts/routes"></script>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	
	"""),_display_(Seq[Any](/*109.3*/if(runID !=(-1 : Long))/*109.26*/{_display_(Seq[Any](format.raw/*109.27*/("""
		<H2><a href='"""),_display_(Seq[Any](/*110.17*/routes/*110.23*/.Application.getData(runID))),format.raw/*110.50*/("""'>View Run</a><br/></H2>
	""")))})),format.raw/*111.3*/("""
	
	<div class="addMissingInfo">
		"""),_display_(Seq[Any](/*114.4*/for((difference,index) <- Difference.getMissingDiffDesc(runID).zipWithIndex) yield /*114.80*/{_display_(Seq[Any](format.raw/*114.81*/("""
			"""),_display_(Seq[Any](/*115.5*/if(index==0)/*115.17*/{_display_(Seq[Any](format.raw/*115.18*/("""
				<H3>Missing Difference Description/Name</H3>
			""")))})),format.raw/*117.5*/("""
			"""),_display_(Seq[Any](/*118.5*/promptDifference(difference,index, PageOut.listFilesFromDiff(runID,difference)))),format.raw/*118.84*/("""
		""")))})),format.raw/*119.4*/("""
		
		"""),_display_(Seq[Any](/*121.4*/for((bug,index) <- Bug.getMissingBugNum(runID).zipWithIndex) yield /*121.64*/{_display_(Seq[Any](format.raw/*121.65*/("""
			"""),_display_(Seq[Any](/*122.5*/if(index==0)/*122.17*/{_display_(Seq[Any](format.raw/*122.18*/("""
				<H3>Missing Bug Number</H3>
			""")))})),format.raw/*124.5*/("""
			"""),_display_(Seq[Any](/*125.5*/(promptBug(bug,index)))),format.raw/*125.27*/("""
		""")))})),format.raw/*126.4*/("""
	</div>
	
	<div class="Log">
		<H1>Log:</H1>
		"""),_display_(Seq[Any](/*131.4*/for(line <- text) yield /*131.21*/{_display_(Seq[Any](format.raw/*131.22*/("""
			<br/> """),_display_(Seq[Any](/*132.11*/Html(log(line)))),format.raw/*132.26*/("""
		""")))})),format.raw/*133.4*/("""
	</div>
""")))})),format.raw/*135.2*/("""
"""))}
    }
    
    def render(text:List[String],runID:Long): play.api.templates.Html = apply(text,runID)
    
    def f:((List[String],Long) => play.api.templates.Html) = (text,runID) => apply(text,runID)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 19 12:19:51 EST 2013
                    SOURCE: C:/Users/dhallahan/workspace/regressionsiteRnd2-1/eclipse-regressionsite/app/views/logInfo.scala.html
                    HASH: 8b9ae5ca737b19c24037e33c3ad6784edafd785f
                    MATRIX: 736->1|834->135|844->138|1106->509|1124->518|2384->1879|2409->1895|3755->39|3786->132|3815->386|3845->506|3874->1764|3904->1876|3934->3211|3975->3216|3997->3228|4038->3230|4249->3405|4282->3428|4322->3429|4377->3447|4393->3453|4443->3480|4503->3508|4578->3547|4671->3623|4711->3624|4753->3630|4775->3642|4815->3643|4903->3699|4945->3705|5047->3784|5084->3789|5129->3798|5206->3858|5246->3859|5288->3865|5310->3877|5350->3878|5421->3917|5463->3923|5508->3945|5545->3950|5635->4004|5669->4021|5709->4022|5758->4034|5796->4049|5833->4054|5877->4066
                    LINES: 26->1|28->6|28->6|37->19|37->19|77->63|77->63|118->1|120->5|121->15|122->18|123->59|124->62|125->103|127->105|127->105|127->105|131->109|131->109|131->109|132->110|132->110|132->110|133->111|136->114|136->114|136->114|137->115|137->115|137->115|139->117|140->118|140->118|141->119|143->121|143->121|143->121|144->122|144->122|144->122|146->124|147->125|147->125|148->126|153->131|153->131|153->131|154->132|154->132|155->133|157->135
                    -- GENERATED --
                */
            